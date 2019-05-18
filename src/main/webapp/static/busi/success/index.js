/**
 * 成功案例js
 */

$(function () {
    $("#pager").zPager({
        htmlBox: $('#wraper'),
        btnShow: true,
        pageData: 20,
        url: Global.appCtx + '/public/success/list',
        dataRender: function(data) {
            setTable(data);
        }
    });
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