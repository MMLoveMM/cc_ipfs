/**
 * 融资需求首页js
 */

var tableHeader = ['企业名称', '行业分类', '拟融资额'];

$(function () {

    $("#pager").zPager({
        htmlBox: $('#wraper'),
        btnShow: true,
        pageData: 20,
        url: Global.appCtx + '/public/demand/list',
        dataRender: function(data) {
            setTable(data);
        }
    });

    $("#searchBtn").click(function () {
        $("#pager").zPager({
            htmlBox: $('#wraper'),
            btnShow: true,
            pageData: 20,
            companyName: $("#companyName").val(),
            type: $("#type").val(),
            url: Global.appCtx + '/public/demand/list',
            dataRender: function(data) {
                setTable(data);
            }
        });
    });
});

//加载表格数据
function setTable(projectInfoJson) {
    if (!!projectInfoJson) {
        var tableData = [];
        projectInfoJson.forEach(function (val) {
            var tableDataList = [];
            tableDataList.push(val.id);
            tableDataList.push(val.projectname);
            var loantype = val.loantype === '01' ? '股权' : val.loantype === '02' ? '债权' : '股权+债权';
            tableDataList.push(loantype);
            tableDataList.push(val.loanamt);
            tableData.push(tableDataList);
        });
        
        //加载table
        setTableData(tableData, 'demandTable', tableHeader, 1000, Global.appCtx + '/public/demand/detail?projectId=');
    }
}