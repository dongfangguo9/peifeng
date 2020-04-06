<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html>

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
</style>
<%@include file="collection/extractheader.jsp" %>


<!--<iframe src="../a.html" width="100%" height="400" scroll="no"></iframe>-->
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

<style type="text/css">
    .home_pro {
        width: 1200px;
    }

    .home_pro ul li {
        width: 24%;
    }


    .home_nav ul li {

        display: inline-block;

        width: 234px;

        position: relative;

        background: none;

        margin-bottom: 10px;

        height: auto;

    }

    .home_nav ul li a {

        display: block;

        padding: 10px 30px;

        color: #333;

        font-size: 14px;

        background: #fff;

        margin: 0 2px;

        border-radius: 2px;

        border: 1px solid #E7E7E7;

        height: auto;

        text-align: center;


    }
</style>


<div class="width inner_container am-animation-slide-bottom am-animation-delay-1">





    <div class="news_show">

        <h1>${tittle}</h1>

        <div class="info">作者：创始人　日期：${dynamicDetail.dateStr}　人气：${dynamicDetail.popularity}</div>

        <div class="intro">

            <p style="text-indent:28px">
                <span style="font-family: 宋体;">${dynamicDetail.content}</span>
                           <%-- <div class="clear"></div>--%>

        </div>




    </div>


</div>


<jsp:include page="collection/extractfooter.jsp"></jsp:include>
<jsp:include page="collection/extractplugService.jsp"></jsp:include>


<!--[if lt IE 9]>

<div class="notsupport">

    <h1>:( 非常遗憾</h1>

    <h2>您的浏览器版本太低，请升级您的浏览器</h2>

</div>

<![endif]-->

<script src="/public/js/jquery.min.js"></script>

<script src="/public/js/amazeui.min.js"></script>

<script src="/theme/default/js/app.js"></script>

<script src="/theme/default/js/jquery.easing.1.3.js"></script>

<script src="/theme/default/js/jquery.skitter.js"></script>

<script src="/theme/default/js/jquery.liMarquee.js"></script>

<script>

    $(function(){

        //首页链接添加选中效果


        //Banner切换

        $('#banner').skitter({dots:true,interval:5000});

    })

</script>

</body>

</html><!--Processed in 0.093750 s , Memory 2.51 M , 15 queries-->