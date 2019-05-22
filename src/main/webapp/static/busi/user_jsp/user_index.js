var INDEX = INDEX || {};

INDEX.scrollImgLeft = function () {
	var speed = 20;
	var scroll_begin = document.getElementById("scroll_begin");
	var scroll_end = document.getElementById("scroll_end");
	var scroll_div = document.getElementById("scroll_div");
	scroll_end.innerHTML = scroll_begin.innerHTML;

	function Marquee() {
		if(scroll_end.offsetWidth - scroll_div.scrollLeft <= 0)
			scroll_div.scrollLeft -= scroll_begin.offsetWidth;
		else
			scroll_div.scrollLeft++
	}
	var MyMar = setInterval(Marquee, speed);
	scroll_div.onmouseover = function() {
		clearInterval(MyMar)
	};
	scroll_div.onmouseout = function() {
		MyMar = setInterval(Marquee, speed)
	}
};

var params = {page: 1, pageSize: 6};

INDEX.demand = function () {
	$.ajax({
		url: Global.appCtx + '/public/demand/list',
		type: 'GET',
		data: params,
		dataType: 'json',
		success: function (resultData) {
			if (resultData.flagCode === "0") {
				var data = resultData.data.rows;
				var demandTitleHtml = '';
				var demandDateHtml = '';
				data.forEach(function (val) {
					var url = Global.appCtx + '/public/demand/detail?projectId=' + val.id;
					demandTitleHtml += INDEX.getHtml(val.projectname, url);
					demandDateHtml += INDEX.getHtml(val.date, url)
				});
				$("#demandTitle").html(demandTitleHtml);
				$("#demandDate").html(demandDateHtml);
			}else {
				console.log(resultData.message);
			}
		},
		error : function () {
			console.log("获取融资需求展示列表数据失败")
		}
	});
};

INDEX.success = function() {
	$.ajax({
		url: Global.appCtx + '/public/success/list',
		type: 'GET',
		data: params,
		dataType: 'json',
		success: function (resultData) {
			if (resultData.flagCode === "0") {
				var data = resultData.data.rows;
				var successTitleHtml = '';
				var successDateHtml = '';
				data.forEach(function (val) {
					var url = Global.appCtx + '/public/success/detail?projectId=' + val.id;
					successTitleHtml += INDEX.getHtml(val.projectName, url);
					successDateHtml += INDEX.getHtml(val.createTime, url)
				});

				$("#successTitle").html(successTitleHtml);
				$("#successDate").html(successDateHtml);
			}else {
				console.log(resultData.message);
			}
		},
		error : function () {
			console.log("获取成功案例展示列表数据失败")
		}
	});
};

INDEX.news = function() {
	$.ajax({
		url: Global.appCtx + '/public/news/list',
		type: 'GET',
		data: {page: 1, pageSize: 16},
		dataType: 'json',
		success: function (resultData) {
			if (resultData.flagCode === "0") {
				var data = resultData.data.rows;
				var newsTitleHtml = '';
				var newsDateHtml = '';
				data.forEach(function (val) {
					var url = Global.appCtx + '/public/news/detail?newsId=' + val.id;
					newsTitleHtml += INDEX.getHtml(val.title, url);
					newsDateHtml += INDEX.getHtml(val.updateDate, url)
				});
				$("#newsTitle").html(newsTitleHtml);
				$("#newsDate").html(newsDateHtml);
			}else {
				console.log(resultData.message);
			}
		},
		error : function () {
			console.log("获取资讯展示列表数据失败")
		}
	});
};

INDEX.getHtml = function(val, url) {
	return 	'<div class="row" onclick="INDEX.clickFunction(\'' + url + '\')">' +
		'<label style="font-size: 0.88rem;">' + val + '</label>' +
		'</div>';
};

INDEX.clickFunction = function(url) {
	window.location.href = url;
};

INDEX.getIndexNum = function() {
	$.ajax({
		url: Global.appCtx + '/public/getIndexNum',
		type: 'GET',
		data: {},
		dataType: 'json',
		success: function (resultData) {
			if (resultData.flagCode === "0") {
				var data = resultData.data;
				$("#amt").html(data.amt);
				$("#org").html(data.org);
				$("#company").html(data.company);
			}else {
				console.log(resultData.message);
			}
		},
		error : function () {
			console.log("获取首页统计数据失败")
		}
	});
};

$(function() {
	INDEX.scrollImgLeft();

	INDEX.demand();

	INDEX.success();

	INDEX.news();

	INDEX.getIndexNum();
});