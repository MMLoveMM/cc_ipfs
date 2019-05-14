layui.use(['layer', 'form', 'element'], function(exports){
    //加载
    var layer = layui.layer,
        form = layui.form,
        element = layui.element;
});

$(function () {

    $("[name=whetherListed]").click(function () {
        if ($(this).val() === "是") {
            $("#listedType").removeAttr("disabled");
            $("#stockCode").removeAttr("disabled");
            $("#listedDate").removeAttr("disabled");
        }else {
            $("#listedType").attr("disabled","disabled");
            $("#stockCode").attr("disabled","disabled");
            $("#listedDate").attr("disabled","disabled");
        }
    });

    $("#searchForm")

    $("#search_submit_Btn").click(function () {
        bootbox.confirm("确认提交?",function(result){
            if(!result){
                return ;
            }
            $.ajax({
                url: Global.appCtx + '/customer/enterprise/add',
                type: 'post',
                data: $("#searchForm").serialize(),
                dataType: 'json',
                success: function (data) {
                    if (data != 0) {
                        bootbox.alert(data);
                    }else{
                        bootbox.alert("企业客户录入成功", function () {
                            location.reload();
                        });
                    }
                },
                error : function () {
                    bootbox.alert("企业客户录入异常");
                }
            });
        });
    });

    //成立时间
    $("#enterpriseCreateDate").datepicker({
        showOtherMonths : true,
        selectOtherMonths : false,
        format : 'yyyy-mm-dd',
    });

    //上市时间
    $("#listedDate").datepicker({
        showOtherMonths : true,
        selectOtherMonths : false,
        format : 'yyyy-mm-dd',
    });
});