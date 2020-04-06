var login = function () {
    initError = function () {
    if(window.location.search.indexOf("error")>-1){
        var errMsg =$('.alert-danger',$('#login')).show();
        $("span", errMsg).text("用户名或密码错误");
    }

    };
    return {
        init: function () {
            initError();
            handlelogin();
        }
    }
}();
$(function () {
});
$(window).resize(function () {
    var wh = $(window).height();
    var ww = $(window).width();
    $("body").height(wh);
    $("input[name='name']").focus();
    login.init();
});