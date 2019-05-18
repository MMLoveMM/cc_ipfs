/**
 *  用于临时使用的bootstrap 表格分页处理
 */

//添加table数据
function setTableData(data, element, tableHeader, total, skipUrl) {
    var tableStr = '<table class="table table-hover">';

    if (!!tableHeader) {
        tableStr += '<thead>' +
        '<tr>';
        tableHeader.forEach(function (val) {
            tableStr += '<th>' + val + '</th>';
        });

        tableStr += '</tr>' +
            '</thead>';
    }

    tableStr += '<tbody>';
    if (!!data) {
        data.forEach(function (val) {
            tableStr += getTable(val, skipUrl);
        });
    }

    tableStr += '</tbody>' +
        '</table>';

    // tableStr += getFooter(total);

    $("#" + element).html(tableStr);
}

//整理table格式
function getTable(data, skipUrl) {
    var rtnStr = '';
    if (!!data) {
        data.forEach(function (val, index) {
            if (index === 0) {
                skipUrl = "'" +  skipUrl + val + "'";
                rtnStr += '<tr onclick="skipHtml(' + skipUrl + ');">'
            }else {
                rtnStr += '<td>' + val + '</td>';
            }
        });
    }

    rtnStr += '</tr>';
    return rtnStr;
}

//获取页码
function getFooter(total) {
    if (!!total) {
        var pageTotal = 0;
        if(total % 20 === 0) {
            pageTotal = total / 20;
        }else {
            pageTotal = total / 20 + 1;
        }

        var footerStr = '<div style="text-align: right"> <a class="btn btn-xs btn-default" href="#">上一页</a> ';
        var footerFlag = 0;
        var maxFooter = 4;
        if (pageTotal !== 0) {
            for (var i = 1; i < pageTotal + 1; i++){
                if (footerFlag < 5) {
                    footerStr += '<a class="btn btn-xs btn-default" href="#">' + i + '</a> ';
                    ++footerFlag;
                }else if (maxFooter > -1) {
                    var maxNum = pageTotal - maxFooter;
                    footerStr += '<a class="btn btn-xs btn-default" href="#">' + maxNum + '</a> ';
                    --maxFooter;
                }else {
                    break;
                }
            }
        }
        footerStr += '<a class="btn btn-xs btn-default" href="#">下一页</a> <div>'

        return footerStr;
    }else {
        return '';
    }
}

function skipHtml(skipUrl) {
    window.location.href = skipUrl;
}