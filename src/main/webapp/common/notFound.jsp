<%--

  User: gjy
  Date: 2016/1/15
  Time: 9:11

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>页面错误</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="/javascripts/jquery.min.js"></script>
    <link href='http://fonts.googleapis.com/css?family=Metal+Mania' rel='stylesheet' type='text/css'>
    <style type="text/css">
        body {
            font-family: 'Metal Mania', cursive;
        }

        body {
            background: skyblue;
        }

        .wrap {
            margin: 0 auto;
            width: 1000px;
        }

        .logo h3 {
            font-size: 80px;
            color: yellow;
            text-align: center;
            margin-bottom: 1px;
            text-shadow: 1px 1px 6px #555;
        }

        .logo p {
            color: white;
            font-size: 20px;
            margin-top: 1px;
            text-align: center;
        }

        .logo p span {
            color: lightgreen;
        }

        .sub a {
            color: yellow;
            background: #06afd8;
            text-decoration: none;
            padding: 5px;
            font-size: 13px;
            font-family: arial, serif;
            font-weight: bold;
        }

        .footer {
            color: white;
            position: absolute;
            right: 10px;
            bottom: 10px;
        }

        .footer a {
            color: yellow;
        }
    </style>
</head>


<body>
<div class="wrap">
    <div class="logo">
        <h3>404</h3>
        <iframe frameborder="0" scrolling="no" src="/common/notFoundbody.jsp" width="100%" height="500px"></iframe>
       <%-- <jsp:include page="/common/notFoundbody.jsp" />--%>
        <p>Sorry This was deadlink - Page not Found</p>

<%--        <div class="sub">
            <p><a href="/"><span id="remain">5</span>秒后返回首页</a></p>

        </div>--%>
    </div>
</div>

<script type="text/javascript">
    redirectIndex();
    var i =10;
    function redirectIndex() {
        if (i <= 0) {
            redirectHome()
            return;
        }
        i--;
        setTimeout("redirectIndex()", 1000);
    }
    function redirectHome(){
        window.location.href="/";
    }
</script>

</body>