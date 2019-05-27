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

function updateProject(id) {
	$(window).attr('location', Global.appCtx + '/project/toMod?id=' + id + '&flag=2');
}

//加载表格数据
function setTable(projectListJson) {
	if (!!projectListJson) {
		var tableData = [];
		projectListJson.forEach(function (val) {
			var tableDataList = [];
			tableDataList.push('');
			tableDataList.push(val.id);
			tableDataList.push(val.projectName);
			tableDataList.push(val.createTime);
			tableDataList.push(val.visitorVolume);
			var html = '<button class="btn btn-xs btn-info" onclick="updateProject(\'' + val.id + '\')">修改</button>';
			tableDataList.push(html);
			tableData.push(tableDataList);
		});

		var tableHeader = ['项目编号', '项目名称', '录入时间', '浏览量', '操作'];

		//加载table
		setTableData(tableData, 'projectTable', tableHeader, 1000, '#');
	}
	

}