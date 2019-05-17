/**
 * 机构注册管理
 * @type {{}}
 */
var Enterprise = Enterprise || {};

layui.use(['layer', 'form', 'element'], function(exports){
    //加载
    var layer = layui.layer,
        form = layui.form,
        element = layui.element;
});

Enterprise.businessLicenseCopy = function() {
    var fileData = new FormData();
    fileData.append("myfile", document.getElementById("businessLicenseCopy").files[0]);
    $.ajax({
        url: Global.appCtx + '/customer/enterprise/uploadFile',
        type: "POST",
        data: fileData,
        contentType: false,
        processData: false,
        success: function (data) {
            if (data.flagCode != 0) {
                bootbox.alert(data.message);
            }else{
                bootbox.alert("上传成功", function () {
                    $("#businessLicenseCopyVal").val(data.data);
                });
            }
        },
        error: function () {
            alert("上传失败！");
        }
    });
};

Enterprise.intellectualProperty = function() {
    var fileData = new FormData();
    fileData.append("myfile", document.getElementById("intellectualProperty").files[0]);
    $.ajax({
        url: Global.appCtx + '/customer/enterprise/uploadFile',
        type: "POST",
        data: fileData,
        contentType: false,
        processData: false,
        success: function (data) {
            if (data.flagCode != 0) {
                bootbox.alert(data.message);
            }else{
                bootbox.alert("上传成功", function () {
                    $("#intellectualPropertyVal").val(data.data);
                });
            }
        },
        error: function () {
            alert("上传失败！");
        }
    });
};

Enterprise.financialAuditReport = function() {
    var fileData = new FormData();
    fileData.append("myfile", document.getElementById("financialAuditReport").files[0]);
    $.ajax({
        url: Global.appCtx + '/customer/enterprise/uploadFile',
        type: "POST",
        data: fileData,
        contentType: false,
        processData: false,
        success: function (data) {
            if (data.flagCode != 0) {
                bootbox.alert(data.message);
            }else{
                bootbox.alert("上传成功", function () {
                    $("#financialAuditReportVal").val(data.data);
                });
            }
        },
        error: function () {
            alert("上传失败！");
        }
    });
};

Enterprise.instructionManual = function() {
    var fileData = new FormData();
    fileData.append("myfile", document.getElementById("instructionManual").files[0]);
    $.ajax({
        url: Global.appCtx + '/customer/enterprise/uploadFile',
        type: "POST",
        data: fileData,
        contentType: false,
        processData: false,
        success: function (data) {
            if (data.flagCode != 0) {
                bootbox.alert(data.message);
            }else{
                bootbox.alert("上传成功", function () {
                    $("#instructionManualVal").val(data.data);
                });
            }
        },
        error: function () {
            alert("上传失败！");
        }
    });
};

$(function () {
    
    $("#whetherListed").click(function () {
        $("#listedType").removeAttr("disabled");
        $("#stockCode").removeAttr("disabled");
        $("#listedDate").removeAttr("disabled");
    });

    $("#whetherListed2").click(function () {
        $("#listedType").attr("disabled","disabled");
        $("#stockCode").attr("disabled","disabled");
        $("#listedDate").attr("disabled","disabled");
    });

    $("#search_submit_Btn").click(function () {
        bootbox.confirm("确认提交?",function(result){
            if(!result){
                return ;
            }
            $.ajax({
                url: Global.appCtx + '/customer/enterprise/update',
                type: 'post',
                data: $("#searchForm").serialize(),
                dataType: 'json',
                success: function (data) {
                    if (data != 0) {
                        bootbox.alert(data);
                    }else{
                        bootbox.alert("企业客户更新成功", function () {
                            location.reload();
                        });
                    }
                },
                error : function () {
                    bootbox.alert("企业客户更新异常");
                }
            });
        });
    });

    //上传营业执照副本
    $("#businessLicenseCopyUpload").click(function () {
        Enterprise.businessLicenseCopy();
    });

    //上传知识产权相关证明材料
    $("#intellectualPropertyUpload").click(function () {
        Enterprise.intellectualProperty();
    });

    //上传财务审计报告
    $("#financialAuditReportUpload").click(function () {
        Enterprise.financialAuditReport();
    });

    //上传说明书
    $("#instructionManualUpload").click(function () {
        Enterprise.instructionManual();
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