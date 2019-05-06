/*
 * jQuery treeGrid Plugin 0.0.1
 * ref jquery.treegrid.js
 *
 * Copyright 2016, zzw  tzzhongwen@gmail.com
 * Licensed under the MIT licenses.
 */
;(function($){

    $.fn.treeGrid = function (method) {

    // 如果第一个参数是字符串, 就查找是否存在该方法, 找到就调用; 如果是object对象, 就调用init方法;.

        if (methods[method]) {

            // 如果存在该方法就调用该方法

            // apply 是把 obj.method(arg1, arg2, arg3) 转换成 method(obj, [arg1, arg2, arg3]) 的过程.

            // Array.prototype.slice.call(arguments, 1) 是把方法的参数转换成数组.

            return methods[method].apply(this, Array.prototype.slice.call(arguments, 1));

        } else if (typeof method === 'object' || !method) {

            // 如果传进来的参数是"{...}", 就认为是初始化操作.

            return methods.init.apply(this, arguments);

        } else {

            $.error('Method ' + method + ' does not exist on jQuery.treeGrid');

        }

    };

    // 不把方法扩展在 $.fn.treeGrid 上.在闭包内建个"methods"来保存方法, 类似公有方法.
    
    $.fn.treeGrid.options = undefined;
    
    var methods = {
//    	var options;
        /**

         * 初始化方法

         * @param _options

         * @return {*}

         */

        init : function (_options) {
            return this.each(function () {

                var $this = $(this);

                var args = $.extend({}, $.fn.treeGrid.defaults, _options);
                $.fn.treeGrid.options = args;
//                var tableSelector = args.selector || this.element;
	            var datas = args.data;
	            var colModel = args.colModel;
	            var treeReader = args.treeReader;
	            var selected = args.selected.split(",");
	            var single = args.single;
	            var showNav = args.showNav;
	            var cascade = args.cascade;
	            
	            //检查数据
	            if(datas.length < 1){
	            	//通过url加载
	            	if(args.url){
	            		var url = args.url;
	            		var method = args.method;
	            		$.ajax({
	        			   type: method,
	        			   url: url,
	        			   data: "_=" + new Date(),
	        			   async: false,
	        			   success: function(data){
	        			     datas = data;
	        			   },
	        			   error: function(){
	        				   alert("加载数据失败");
	        			   }
	        			});
	            	}else{
	            		alert("加载数据失败");
	            		return false;
	            	}
	            }
	        
	            var $table = $(this);

	            var name, value, title, formatter,witdh, $tr, $td;
	            if(showNav){
		            //init head button
		            $tr = $("<tr>").append($("<td>").append(
		                            $("<button>").addClass("btn").addClass("btn-xs").addClass("btn-purple").attr("id","selectAll").text("全选")
		                        ).append(
		                            $("<button>").addClass("btn").addClass("btn-xs").addClass("btn-grey").attr("id","selectNone").text("全不选")
		                        ).append(
		                            $("<button>").addClass("btn").addClass("btn-xs").addClass("btn-purple").attr("id","expandAll").text("展开全部")
		                        ).append(
		                            $("<button>").addClass("btn").addClass("btn-xs").addClass("btn-grey").attr("id","collapseAll").text("折叠全部")
		                        ).attr("colspan", colModel.length+1)
		                    );
		
		            $table.append($tr);
	            }
	            
	            //init head title
	            $tr = $("<tr>").append($("<th>"));
	            $.each(colModel, function(c, m){
	                $tr.append($("<th>").text(m['title']));
	            });

	            $table.append($tr);

	            var maxLevel = 0;

	            $.each(datas, function(i, data){
	                maxLevel = maxLevel < parseInt(data[treeReader['level']]) ? parseInt(data[treeReader['level']]) : maxLevel;


	                $tr = $("<tr>").addClass("treegrid-" + data[treeReader.id])
	                        .attr("id", "node_" + data[treeReader.id]);
	                if(parseInt(data[treeReader.pid]) > 0){
	                    $tr.addClass("treegrid-parent-" + data[treeReader.pid]).attr("pid", data[treeReader.pid]);
	                }
	                //add checkbox or radio
	                if(single){
	                	$td = $("<td>").css("width", (maxLevel + 1) * 24 + "px").append($("<input type='radio' name='tree_radio_id' value='"+data[treeReader.id]+"'>").addClass("tree_check"));
	                }else{
	                	$td = $("<td>").css("width", (maxLevel + 1) * 24 + "px").append($("<input type='checkbox'>").addClass("tree_check"));
	                }
	                
	                
	                //是否选中该记录
	                if(selected.indexOf(data[treeReader.id]) > -1){
	                	$td.find(".tree_check").prop("checked", true);
	                }
	                
	                $tr.append($td);

	                $.each(colModel, function(c, m){
	                    title = m['title'] || "";
	                    formatter = m["formatter"];
	                    value = data[m['name']];
	                    width = m['width'];
	                    if(formatter){
	                        value = formatter.call(this, value);
	                    }
	                    $td = $("<td>").attr("title", title).text(value);
	                    if(width){
	                        $td.css("width" , width + "px");
	                    }
	                    $tr.append($td);
	                });

	                $table.append($tr);
	            });

	            $table.treegrid();
	            if(!single){
		            //注册选中事件
		            $table.find(".tree_check").click(function(){
		                var $node = $(this);
		                $.each($node.parent().parent().treegrid('getAllChildNodes'), function(){
		                    $(this).find(".tree_check").prop("checked", $node.is( ":checked" ));                        
		                });
		                // 选中子菜单，递归选中父菜单
		                // 取消选中，递归判断父菜单是否存在其他选中菜单，如无，取消父菜单选中
		                if(cascade){
		                	loopCheck($node, $node.is( ":checked" ));
		                }
		                //获取选中的记录的id
//		                console.log($node.parent().parent().treegrid("getAllChildNodesId"));
		            });
		
		            $table.find("#selectAll").click(function(){
		                $table.find("input[type='checkbox']").prop("checked", true);
		            });
		
		            $table.find("#selectNone").click(function(){
		                $table.find("input[type='checkbox']").prop("checked", false);
		            });
		
		            $table.find("#expandAll").click(function(){
		                $table.treegrid('expandAll');
		            });
		
		            $table.find("#collapseAll").click(function(){
		                $table.treegrid('collapseAll');
		            });
	            }
	            
	            // 选中子菜单，递归选中父菜单
                // 取消选中，递归判断父菜单是否存在其他选中菜单，如无，取消父菜单选中
	            function loopCheck(node, isChecked, pid){
	            	var $c = $(node);
	            	var $p = pid ? $(".treegrid-"+pid) : $c.parent().parent();
	            	var pid = $p.attr("pid");
	            	var isRoot = $p.hasClass("treegrid-expanded");
	            	
	            	if(!isChecked){
	            		var i = 0;
            			// 取消
            			$p.treegrid('getAllChildNodes').each(function(){
            				var $t = $(this);
            				$t.find(":checked").each(function(){
            					if($(this).is(":checked")){
            						i++;
            					}
            				});
            			});
            			
            			if(i<1){
            				$p.find(".tree_check").prop("checked", isChecked);
            			}
            			
            		}else{
            			//选中
            			$p.find(".tree_check").prop("checked", isChecked);
            		}
	            	
	            	if(!isRoot || pid){
	            		loopCheck($p, isChecked, pid);
	            	}
	            }
	            

            })

        },
        // public method
        getAllSelectNodesId: function(){

            var ids = new Array();
            var $table = $(this);
            var options = $.fn.treeGrid.options;
            if(!options.single){
	            $.each($table.find(":checkbox"),function(i, d){
	                if($(this).prop("checked")){
	                    ids.push($(this).parent().parent().attr("id").replace("node_",""));
	                }
	            });
	            return ids.join(",");
            }else{
            	return $table.find(":checked").attr("value");
            }
        }

    };

    // 默认参数

    $.fn.treeGrid.defaults = {
    	colModel: [],			//列模型
        treeReader: {			//jsonReader
            "id" : "id",		//id
            "pid" : "pid",		//父id
            "level" : "level"	//级别，从1开始
        },
        data: [],				//json数据
        url : '',				//获取json数据url
        method : 'POST',		//请求url方式
        selected : '',			//已选中id集合 "1,2,3,4,5"
        single : false,			//是否为单选，默认false
        showNav: true,			//是否显示头部按钮导航，默认true
        cascade: false,			//是否级联，即如果选中子节点，同时递归选中各级父节点。模式false

    };

})(jQuery);


/*
	调用方法
	var datas = [{"level":1, "restype":"MENU","resindex":"1","respid":"0","permission":"sys:manage","resname":"系统管理","resid":"1","url":"/sys/manage","status":"1"},
				{"level":2, "restype":"MENU","resindex":"3","respid":"1","permission":"sys:manage:org:**","resname":"机构管理","resid":"10","url":"/sys/org/list","status":"1"},
				{"level":2, "restype":"BUTTON","resindex":"1","respid":"1","permission":"trans:refund:commit","resname":"审核退款","resid":"6","url":"/trans/refund/commit","status":"1"},
				{"level":2, "restype":"MENU","resindex":"1","respid":"1","permission":"sys:manage:resource:**","resname":"资源管理","resid":"8","url":"/sys/resource/list","status":"1"},
				{"level":2, "restype":"MENU","resindex":"2","respid":"1","permission":"sys:manage:user:**","resname":"用户管理","resid":"9","url":"/sys/user/list","status":"1"},
				{"level":1,  "restype":"MENU","resindex":"2","respid":"0","permission":"trans:manage","resname":"交易管理","resid":"2","url":"/tran/manage","status":"1"},
				{"level":3, "restype":"MENU","resindex":"2","respid":"2","permission":"trans:refund:manage","resname":"退款订单管理","resid":"3","url":"/tran/refund/manage","status":"1"},
				{"level":4, "restype":"MENU","resindex":"1","respid":"3","permission":"trans:refund:manage","resname":"退款订单管理2","resid":"7","url":"/tran/refund/manage/2","status":"1"},
				{"level":2, "restype":"MENU","resindex":"1","respid":"2","permission":"trans:pay:manage","resname":"交易订单管理","resid":"4","url":"/tran/pay/manage","status":"1"},
				{"level":1,  "restype":"MENU","resindex":"3","respid":"0","permission":"mer:manage","resname":"商户管理","resid":"5","url":"/mer/manage","status":"1"}];

			var colModel = [
				{name:'resname', title:'资源名称'},
				// {name:'restype', title:'资源类型', width:100, formatter:typeFmatter}
				{name:'restype', title:'资源类型', formatter:typeFmatter}
			];

			//转换类型
			function typeFmatter(cellvalue){
				var txt;
				switch(cellvalue) {
				case 'MENU':
				  	txt = "菜单";
				  	break;
				case 'BUTTON':
					txt = "按钮";
					break;
				case 'URL':
					txt = "链接";
					break;
				default:
				  	txt = "未知";
				}
				return txt;
			}

			var treeReader = {
				"id" : "resid",
				"pid" : "respid",
				"level" : "level"
			};

			$(".tree").treeGrid({
				data: datas,
				colModel: colModel,
				treeReader: treeReader
			});

			console.log("----->" + $(".tree").treeGrid("getAllSelectNodesId"));
 */
