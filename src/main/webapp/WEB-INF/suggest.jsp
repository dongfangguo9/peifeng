<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/public/js/jquery.min.js"></script>

<script src="/public/js/amazeui.min.js"></script>

<script src="/theme/default/js/app.js"></script>

<script src="/theme/default/js/jquery.easing.1.3.js"></script>

<script src="/theme/default/js/jquery.skitter.js"></script>

<script src="/theme/default/js/jquery.liMarquee.js"></script>
<%--<script src="/public/js/login.js"></script>--%>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=0">

    <meta name="renderer" content="webkit">
    <base href="/">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="stylesheet" href="/public/css/amazeui.min.css">

    <link rel="stylesheet" href="/theme/default/css/app.css">

    <title>广西建筑装饰堵漏-防水补漏-屋面防水工程-广西沛丰建筑装饰工程有限公司</title>
    <link rel="icon" type="image/x-ico" href="/images/favicon.ico">

    <meta name="keywords" content="广西建筑装饰公司,广西建筑装饰,广西建筑装饰堵漏,防水工程,专业防水,屋面防水">

    <meta name="description"
          content="广西沛丰建筑装饰工程公司具有防水丶防腐丶保温工程专业承包（壹级资质），提供防水补漏堵漏、屋面防水工程等服务，具有经过培训的专职施工队伍，可承揽各种防水丶防腐丶保温工程，是集研发、生产、销售、施工、服务于一体的企业">


    <link rel="stylesheet" href="/theme/default/css/skitter.css">

</head>


<body>


<style>
    .topbox {
        width: 100%;
        overflow: hidden;
        line-height: 45px;
        background: #0497e4;
        color: #fff;
        font-size: 14px;
    }

    .wrap {
        width: 1200px;
        margin: 0 auto;
    }

    .top_L {
        float: left;
    }
    #test{
    font-size:x-large;
    }
</style>
<%@include file="collection/extractheader.jsp" %>
<div class="banner">
    <div class="skitter" id="banner">
        <ul>
            <li><a href="" target="_blank"><img src="/upfile/2019/12/15766286991471.jpg" alt="" class="random"/></a>
            </li>
            <li><a href="" target="_blank"><img src="/upfile/2019/12/15766287061401.jpg" alt="" class="random"/></a>
            </li>
            <li><a href="" target="_blank"><img src="/upfile/2019/12/15766287126441.jpg" alt="" class="random"/></a>
            </li>
        </ul>
    </div>
</div>


<div class="width inner_container am-animation-slide-bottom am-animation-delay-1">


    <h1>在线留言</h1>


    <!---->

    <div class="clear"></div>

    <div class="pagelist">
        <ul></ul>
    </div>


    <div class="subject m20">

        <b>我要留言</b>
    </div>
    <div id="test" align="center"></div>

    <form class="am-form am-margin-top nice-validator n-yellow" id="form" method="post" novalidate="novalidate">

        <div class="am-input-group am-form-group">

            <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>

            <input type="text" id="name" name="name" class="am-form-field" placeholder="请输入您的姓名" aria-required="true">

        </div>

        <div class="am-input-group am-form-group">

            <span class="am-input-group-label"><i class="am-icon-phone am-icon-fw"></i></span>

            <input type="text" id="phone" name="phone" maxlength="11" class="am-form-field" placeholder="请输入您的手机号码"
                   aria-required="true">

        </div>


        <div class="am-input-group am-form-group">

            <span class="am-input-group-label"><i class="am-icon-comments-o am-icon-fw"></i></span>

            <textarea id="content" name="content" rows="5" placeholder="请输入留言内容" aria-required="true"></textarea>

        </div>

        <button type="button" id="submit1" class="am-btn am-btn-primary am-center">提交留言</button>

    </form>
    <script>

        function inputCheck(){
            if ($("#name").val() == ""){
                $("#test").html("<font color='red'>"+"请输入您的姓名！"+"</font>");
                return false;
            }
            if(!(/^1[3456789]\d{9}$/.test($("#phone").val()))){
                $("#test").html("<font color='red'>"+"手机号格式不正确！"+"</font>");
                return false;
            }
            if ($("#content").val() == ""){
                $("#test").html("<font color='red'>"+"请输入留言内容！"+"</font>");
                return false;
            }
            return true;
        }

        $("#submit1").click(
            function () {
                if (inputCheck() == false){
                    return false;
                }
                debugger
                $.post({
                    url: "/suggest",
                    data: $("#form").serialize(),
                    datatype: "json",
                    success: function (data) {
                        if(data=="提交成功"){
                            $("#test").html("<font color='green'>"+data+"</font>");
                        }else {
                            $("#test").html("<font color='red'>"+data+"</font>");
                        }
                    }
                })
            }
        )

    </script>

    <!---->

</div>


<jsp:include page="collection/extractfooter.jsp"></jsp:include>
<jsp:include page="collection/extractplugService.jsp"></jsp:include>

<!--[if lt IE 9]>

<div class="notsupport">

    <h1>:( 非常遗憾</h1>

    <h2>您的浏览器版本太低，请升级您的浏览器</h2>

</div>

<![endif]-->


<script>
    $(function () {
//Banner切换

        $('#banner').skitter({dots: true, interval: 5000});

    })
</script>

</body>

</html><!--Processed in 0.078125 s , Memory 2.57 M , 13 queries-->