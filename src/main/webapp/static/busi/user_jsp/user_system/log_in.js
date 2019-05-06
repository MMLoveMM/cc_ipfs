var LogIn = LogIn || {};

/**
 * 登录表单验证jquery validate
 */
LogIn.initModDictFormValidate = function () {
    $("#logInForm").validate({
        rules : {
        	username : {required : true},
        	password : {required : true},
        	verificationCode : {required : true}
        },
        messages : {
        	username : {required : "用户名不能为空"},
        	password : {required : "密码不能为空"},
        	verificationCode : {required : "验证码不能为空"},
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

LogIn.beginLogIn = function() {
	 var result = $("#logInForm").valid();
	    if (!result) {
	       return;
	    }
	    	
	    $("#logInForm").submit();
}

/**
 * 刷新验证码
 * @returns
 */
LogIn.reloadCode = function () {
	$("#verifyCode").attr("src", '/ipfs/public/createImg?x='+Math.random());
}

$(function() {
	//初始化登录表单验证
	LogIn.initModDictFormValidate();
	
	//验证码刷新点击事件
    $("#verifyCode").click(function(){
    	LogIn.reloadCode();
    });
    
    //开始登录
    $("#sure_log_in").click(function() {
    	LogIn.beginLogIn();
    });
    
    //回车登录
    $(document).keyup(function(e){
    	if(e.keyCode==13){
    		LogIn.beginLogIn();
    	}
    });
});