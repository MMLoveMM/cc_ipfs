/**
 * 成功案例js
 */

$(function () {

	$("#pager").zPager({
		htmlBox: $('#wraper'),
		btnShow: true,
		pageData: 20,
		url: Global.appCtx + '/project/list/web/get',
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
			tableDataList.push('');
			tableDataList.push(val.id);
			tableDataList.push(val.projectName);
			tableDataList.push(val.createTime);
			tableDataList.push(val.visitorVolume);
			tableData.push(tableDataList);
		});

		var tableHeader = ['项目编号', '项目名称', '录入时间', '浏览量'];

		//加载table
		setTableData(tableData, 'projectTable', tableHeader, 1000, '#');
	}
}