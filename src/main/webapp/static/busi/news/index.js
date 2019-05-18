/**
 * 成功案例js
 */

$(function () {

    $("#pager").zPager({
        htmlBox: $('#wraper'),
        btnShow: true,
        pageData: 20,
        url: Global.appCtx + '/public/news/list',
        dataRender: function(data) {
            setTable(data);
        }
    });
});

//加载表格数据
function setTable(newsListJson) {
    if (!!newsListJson) {
        var tableData = [];
        newsListJson.forEach(function (val) {
            var tableDataList = [];
            tableDataList.push(val.id);
            tableDataList.push(val.title);
            tableDataList.push(val.updateDate);
            tableData.push(tableDataList);
        });

        //加载table
        setTableData(tableData, 'newsTable', [], 1000, Global.appCtx + '/public/news/detail?newsId=');
    }
}