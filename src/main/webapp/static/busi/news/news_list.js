/**
 * 交易管理
 */
var News = News || {};
/**
 * jqgrid对象
 */
News.jqgrid = News.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
News.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */

News.jqgrid.init = function () {
    var thisObject = News.jqgrid;
    var options = {};
    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";
    var colModel = [
        {label : '资讯编号', name : 'id',index : 'id',align : 'center'},
        {label : '资讯标题', name : 'title',index : 'title',align : 'left'},
        {label : '资讯内容', name : 'context',index : 'context',align : 'left'},
        {label : '资讯来源', name : 'source',index : 'source',align : 'left'},
        {label : '创建时间', name : 'createDate',index : 'createDate',align : 'center'},
        {label : '更新时间', name : 'updateDate',index : 'updateDate',align : 'center'},
        {label : '操作', name : 'myac',index : 'myac',align : 'center',width : '100',
            formatter : function (cellvalue, options, rowObject) {
                var modNews = 	"<button class='btn btn-xs btn-success openbtn' onclick=\"News.modNews('" + rowObject.id + "', '" + rowObject.title + "', " +
                    "'" + rowObject.context + "', '" + rowObject.source + "')\">修改</button>";
                var delNews = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"News.delNews('" + rowObject.id + "')\">删除</button>"

                return '<div class="btn-group btn-group-sm">' + modNews +  delNews +'</div>';
            }
        }
    ];
    thisObject.$tableSelector = Global.initTable({
        p_grid_selector : grid_selector,
        p_pager_selector : pager_selector,
        p_url : Global.appCtx + "/system/news/list/get",
        p_tableName : "资讯信息管理",
        p_height : "auto",
        p_colModel : colModel
    }).navButtonAdd(pager_selector,{
        caption:"添加 &nbsp;&nbsp;",
        buttonicon:"fa fa-plus-circle purple",
        onClickButton: function(){
            $("#addNewsModal").modal('show');
        },
        position:"last"
    })
}
/**
 * 加载数据
 * @param data 搜索条件数据
 */
News.jqgrid.loadData = function (data) {
    var thisObject = News.jqgrid;
    thisObject.clearSearch();
    data = data || {};
    var thisObject = News.jqgrid;
    thisObject.$tableSelector.setGridParam({
        mtype : "POST",
        datatype : "json",
        postData : data,
        page : 1
    }).trigger("reloadGrid");
}
/**
 * 清除搜索条件
 */
News.jqgrid.clearSearch = function () {
    var thisObject = News.jqgrid;
    var oriData = thisObject.$tableSelector.jqGrid("getGridParam", "postData");
    var colms = thisObject.$tableSelector.jqGrid("getGridParam", "colModel");
    $.each(colms, function (k, v) {
        delete oriData[v.name];
    });
};

/**
 * 添加资讯jquery validate
 */
News.initAddNewsFormValidate = function () {
    $("#addNewsForm").validate({
        rules : {
            title : {required : true},
            context : {required : true}
        },
        messages : {
            title : {required : "标题不能为空"},
            context : {required : "内容不能为空"}
        },
        focusCleanup : true,
        focusInvalid : false,
        errorPlacement : function(error, element) {
            if ($(error).html() == "") {
                return;
            }
            $(element).parent().find(".error-tips").html(error.html());
        },
        success : function(error, element) {
            $(element).parent().find(".error-tips").html("");
        }
    });
};

/**
 * 开始添加资讯 action
 */
News.addNews = function () {
    var result = $("#addNewsForm").valid();
    if (!result) {
        return;
    }
    bootbox.confirm("确认添加?",function(result){
        if(!result) {
            return false;
        }

        $.ajax({
            url: Global.appCtx + '/system/news/add',
            type: 'post',
            data: $("#addNewsForm").serialize(),
            dataType: 'json',
            success: function (data) {
                if (data != 0) {
                    bootbox.alert(data);
                    return;
                }
                bootbox.alert("添加成功", function () {
                    location.reload();
                });
            },
            error : function () {
                bootbox.alert("添加功能菜单异常");
            }
        });
    });
};

//修改model赋值
News.modNews = function(id, title, context, source) {
    $("#modId").val(id);
    $("#title").val(title);
    $("#context").val(context);
    $("#source").val(source);

    $("#modNewsModal").modal('show');
};

/**
 * 修改资讯信息表单绑定jquery validate
 */
News.initModNewsFormValidate = function () {
    $("#modNewsForm").validate({
        rules : {
            title : {required : true},
            context : {required : true}
        },
        messages : {
            title : {required : "标题不能为空"},
            context : {required : "内容不能为空"}
        },
        focusCleanup : true,
        focusInvalid : false,
        errorPlacement : function(error, element) {
            if ($(error).html() == "") {
                return;
            }
            $(element).parent().find(".error-tips").html(error.html());
        },
        success : function(error, element) {
            $(element).parent().find(".error-tips").html("");
        }
    });
};

/**
 * 开始修改资讯信息 action
 */
News.modNewsAction = function () {
    var result = $("#modNewsForm").valid();
    if (!result) {
        return;
    }
    bootbox.confirm("确认修改?",function(result){
        if(!result) {
            return;
        }

        $.ajax({
            url: Global.appCtx + '/system/news/mod',
            type: 'post',
            data: $("#modNewsForm").serialize(),
            dataType: 'json',
            success: function (data) {
                if (data != 0) {
                    bootbox.alert(data);
                }
                bootbox.alert("修改成功", function () {
                    location.reload();
                });
            },
            error : function () {
                bootbox.alert("修改功能菜单异常");
            }
        });
    });
};

//删除资讯数据
News.delNews = function(id) {
    if (!!id) {
        bootbox.confirm("确认删除?",function(result){
            if(!result) {
                return;
            }

            $.ajax({
                url: Global.appCtx + '/system/news/del',
                type: 'post',
                data: {id: id},
                dataType: 'json',
                success: function (data) {
                    if (data != 0) {
                        bootbox.alert(data);
                    }
                    bootbox.alert("删除成功", function () {
                        location.reload();
                    });
                },
                error : function () {
                    bootbox.alert("修改功能菜单异常");
                }
            });
        });
    }
};

$(function(){

    // 初始化jqgrid
    News.jqgrid.init();

    News.initAddNewsFormValidate();

    News.initModNewsFormValidate()

    $("#sureAdd").click(function () {
        News.addNews();
    });

    $("#sureMod").click(function () {
        News.modNewsAction();
    });
});

