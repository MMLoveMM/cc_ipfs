/**
 * 成功案例js
 */

$(function () {
    setTable($.parseJSON($("#successList").val()));
});

//加载表格数据
function setTable(projectInfoJson) {
    if (!!projectInfoJson) {
        var tableData = [];
        projectInfoJson.forEach(function (val) {
            var tableDataList = [];
            tableDataList.push(val.id);
            tableDataList.push(val.projectName);
            tableDataList.push(val.createTime);
            tableData.push(tableDataList);
        });

        //加载table
        setTableData(tableData, 'successTable', "", 1000, Global.appCtx + '/public/success/detail?projectId=');
    }
}