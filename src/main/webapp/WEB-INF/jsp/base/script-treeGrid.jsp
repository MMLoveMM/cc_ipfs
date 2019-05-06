<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="taglibs.jsp"%>
		
<!-- page specific plugin scripts -->
<script src="${appCtx}/static/dist/js/jquery.treeGrid/jquery.treegrid.min.js" type="text/javascript"></script>
<script src="${appCtx}/static/dist/js/jquery.treeGrid/jquery.treegrid.wrapper.min.js" type="text/javascript"></script>


<script type="text/javascript">
	/**
	 * 初始化table，由jqGrid实现
	 *
	 *
	 * @param    {string}  options.p_grid_selector     	grid选择选择器：#grid-table
	 * @param    {string}  options.p_pager_selector    	paper选择选择器：#grid-pager
	 * @param    {string}  options.p_url    		           异步加载数据地址：${appCtx}/sys/resource/json,
	 * @param    {int}     options.p_height    		    table高度：300
	 * @param    {array}   options.p_colNames           table表头：['操作', '编号','名称','类型', '排序', '父编号','权限', 'URL', '状态']
	 * @param    {array}   options.p_colModel           列模型
	 * @param    {string}  options.p_tableName  		表名称：xxx列表
	 * @returns  void
	 *
	 * @date     2016-07-14
	 * @author   zzw
	 */
	function initTable(options) {
		var grid_selector = options.p_grid_selector;
		var pager_selector = options.p_pager_selector;
		
		//resize to fit page size
		$(window).on('resize.jqGrid', function () {
			$(grid_selector).jqGrid( 'setGridWidth', $(".page-content").width() );
	    })
		//resize on sidebar collapse/expand
		var parent_column = $(grid_selector).closest('[class*="col-"]');
		$(document).on('settings.ace.jqGrid' , function(ev, event_name, collapsed) {
			if( event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed' ) {
				//setTimeout is for webkit only to give time for DOM changes and then redraw!!!
				setTimeout(function() {
					$(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
				}, 0);
			}
	    })
		
		//if your grid is inside another element, for example a tab pane, you should use its parent's width:
		/**
		$(window).on('resize.jqGrid', function () {
			var parent_width = $(grid_selector).closest('.tab-pane').width();
			$(grid_selector).jqGrid( 'setGridWidth', parent_width );
		})
		//and also set width when tab pane becomes visible
		$('#myTab a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
		  if($(e.target).attr('href') == '#mygrid') {
			var parent_width = $(grid_selector).closest('.tab-pane').width();
			$(grid_selector).jqGrid( 'setGridWidth', parent_width );
		  }
		})
		*/
	
	
		jQuery(grid_selector).jqGrid({
			url: options.p_url, 
			 
			datatype: "json",
			 
			mtype: 'POST',
			
			height: options.p_height,
			colNames: options.p_colNames,
			colModel: options.p_colModel,
			/*[
				{name:'myac',index:'', width:80, fixed:true, sortable:false, resize:false,
					formatter:'actions',  
					formatoptions:{  // see:http://www.trirand.com/jqgridwiki/doku.php?id=wiki:predefined_formatter
						keys:true,
						//delbutton: false,//disable delete button
						
						delOptions:{recreateForm: true, beforeShowForm:beforeDeleteCallback},
						//editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}
					}
				},
				{name:'resid', index:'resid', width:100, editable: false, sortable:false},
				{name:'resname', index:'resname', width:100,  editable: false, sortable:false},
				{name:'restype', index:'restype', width:100, editable: false, sortable:false},
				{name:'resindex', index:'resindex', width:100, editable: false, sortable:false},
				{name:'respid', index:'respid', width:100, editable: false, sortable:false},
				{name:'permission', index:'permission', width:100, editable: false, sortable:false},
				{name:'url', index:'url', width:100, editable: false, sortable:false},
				{name:'status', index:'status', width:100, editable: false, sortable:false},
				
			],*/ 
			
			jsonReader : {
			      root:"rows",
			      page: "currpage",
			      total: "totalpages",
			      records: "totalrecords"
			},
	
			viewrecords : true,
			rowNum:10,
			rowList:[10,20, 30],
			pager : pager_selector,
			altRows: true,
			//toppager: true,
			
			multiselect: true,
			//multikey: "ctrlKey",
	        multiboxonly: true,
	
			loadComplete : function() {
				var table = this;
				setTimeout(function(){
					//styleCheckbox(table);
					
					//updateActionIcons(table);
					updatePagerIcons(table);
					enableTooltips(table);
				}, 0);
			},
	
			editurl: "/sys/resource/list",// just use for delete
			caption: options.p_tableName,
			emptyrecords: "无相关记录",
			//,autowidth: true,
	
	
		});
		$(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size
		
		
	
		//enable search/filter toolbar
		//jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})
		//jQuery(grid_selector).filterToolbar({});
	
	
		//navButtons
		jQuery(grid_selector).jqGrid('navGrid',pager_selector,
			{ 	//navbar options
				edit: false,
				add: false,
				del: true,
				delicon : 'ace-icon fa fa-trash-o red',
				search: false,
				delicon : 'ace-icon fa fa-trash-o red',
				refresh: true,
				refreshicon : 'ace-icon fa fa-refresh green',
				view: true,
				viewicon : 'ace-icon fa fa-search-plus grey',
			},
			{
				//view record form
				recreateForm: true,
				beforeShowForm: function(e){
					var form = $(e[0]);
					form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
				}
			}
		)

		
		//replace icons with FontAwesome icons like above
		function updatePagerIcons(table) {
			var replacement = 
			{
				'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',
				'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',
				'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',
				'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'
			};
			$('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
				var icon = $(this);
				var $class = $.trim(icon.attr('class').replace('ui-icon', ''));
				
				if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
			})
		}
	
		function enableTooltips(table) {
			$('.navtable .ui-pg-button').tooltip({container:'body'});
			$(table).find('.ui-pg-div').tooltip({container:'body'});
		}
	
		//var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');
	
		$(document).one('ajaxloadstart.page', function(e) {
			$(grid_selector).jqGrid('GridUnload');
			$('.ui-jqdialog').remove();
		});
		
		
		return jQuery(grid_selector);
	};
</script>