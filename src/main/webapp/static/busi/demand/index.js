/**
 * 融资需求首页js
 */

var tableHeader = ['企业名称', '行业分类', '拟融资额'];

$(function () {

    setTable($.parseJSON($("#projectInfos").val()));

});

//加载表格数据
function setTable(projectInfoJson) {
    if (!!projectInfoJson) {
        var tableData = [];
        projectInfoJson.forEach(function (val) {
            var tableDataList = [];
            tableDataList.push(val.id);
            tableDataList.push(val.projectname);
            tableDataList.push(val.loantype);
            tableDataList.push(val.loanamt);
            tableData.push(tableDataList);
        });
        
        //加载table
        setTableData(tableData, 'demandTable', tableHeader, 1000, Global.appCtx + '/public/demand/detail?projectId=');
    }
}