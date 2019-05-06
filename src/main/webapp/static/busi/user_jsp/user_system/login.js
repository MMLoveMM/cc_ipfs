var Login = Login || {};

/**
 * 注册表单验证jquery validate
 */
Login.initModDictFormValidate = function () {
    $("#loginForm").validate({
        rules : {
        	userid : {required : true},
        	name : {required : true},
        	password : {required : true},
        	sure_password : {required : true, equalTo:"#password"},
        	mobile : {required : true, isMobile : true},
        	mail : {required : true, email : true}
        },
        messages : {
        	userid : {required : "用户名不能为空"},
        	name : {required : "名称不能为空"},
        	password : {required : "密码不能为空"},
        	sure_password : {required : "确认密码不能为空", equalTo:"与密码不一致"},
        	mobile : {required : "手机号码不能为空", isMobile : "手机号码不正确"},
        	mail : {required : "邮箱不能为空", email : "邮箱格式不正确"}
        },
        focusCleanup : true,
        focusInvalid : false,
        errorPlacement : function(error, element) {
            if ($(error).html() == "") {
                return;
            }
            $(element).parent().parent().find(".error-tips").html(error.html());
            $(element).focus();
        },
        success : function(error, element) {
            $(element).parent().parent().find(".error-tips").html("");
        }
    });
}

Login.beginLogin = function() {
	var result = $("#loginForm").valid();
	if (!result) {
		return;
    }
	bootbox.confirm("确认注册?",function(result){	
    	if(!result) {
    		return false;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/public/addLogin',
	        type: 'post',
	        data: $("#loginForm").serialize(),
	        dataType: 'json',
	        success: function (data) {
	        	console.log(data);
	            if (data != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("注册成功", function () {
	            	window.location.href = Global.appCtx + "/public/toUserLogIn";
	            });
	        },
	        error : function () {
	            bootbox.alert("注册异常");
	        }
	    });
    });    
	    	
}

$(function() {
	//初始化登录表单验证
	Login.initModDictFormValidate();
	
    //开始登录
    $("#sure_login").click(function() {
    	Login.beginLogin();
    });
});