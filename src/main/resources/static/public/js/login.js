var Login = function() {
    var handleLogin = function() {
            $('#login').validate({
                errorElement: 'span', //default input error message container
                errorClass: 'help-block', // default input error message class
                focusInvalid: false, // do not focus the last invalid input
                rules: {
                    phone: {
                        required: true
                    },
                    name : {
                        required: true
                    },
                    content:{
                        required: true
                    }
                },
                messages: {
                    phone: {
                        required: "电话不能为空"
                    },
                    name: {
                        required: "姓名不能为空"
                    },
                    content:{
                        required: "内容不能为空"
                    }
                },
                invalidHandler: function(event, validator) {
                    var errMsg = $('.alert-danger', $('#login')).show();
                    $("span", errMsg).text("请输入用户名、密码");
                },
                highlight: function(element) {
                    $(element)
                        .closest('.form-control').addClass('has-error');
                },
                success: function(label) {
                    label.closest('.form-control').removeClass('has-error');
                    label.remove();
                },
                errorPlacement: function(error, element) {
                    // error.insertAfter(element.closest('.input-icon'));
                },
            });
           /* $('#login input').keypress(function(e) {
                if (e.which == 13) {
                    if ($('#login').validate().form()) {
                        $('#login').submit();
                    }
                    return false;
                }
            });*/
        },
        initError = function() {
            if (window.location.search.indexOf("error") > -1) {
                var errMsg = $('.alert-danger', $('#login')).show();
                $("span", errMsg).text("信息不能为空");
            }
        };
    return {
        init: function() {
            initError();
            handleLogin();
        }
    };
}();
jQuery(document).ready(function() {
    var wh = $(window).height();
    var ww = $(window).width();
    $("body").height(wh);
    /*当元素获得焦点时触发focus内的事件*/
    $("input[name='name']").focus();
    Login.init();
});
$(window).resize(function() {
    var wh = $(window).height();
    var ww = $(window).width();
    $("body").height(wh);
});