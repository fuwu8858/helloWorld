<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%----%>
<jsp:include  page="/common/head.jsp"/>
<html>
<meta charset="UTF-8"/>
<style>
    body{
        text-align:center;
        margin-left:auto;
        margin-right:auto;

    }
</style>
<body>

<h2>Hello World!</h2>

<script charset="UTF-8" src="javascripts/jquery.min.js"></script>
<form method="post" action="register.do">
    <input name="name" type="text"/>
    <input name="password" type="password"/>
    <input type="submit" value="提交"/>
</form>
<img id="imgObj" alt="验证码" src="code.do" />
<a href="#" onclick="changeImg()">换一张</a>
<img id="chineseCode" alt="验证码" src="chineseCode.do" />
<a href="#" onclick="changeImg()">换一张</a>
<script type="text/javascript">
    function changeImg() {
        var imgSrc = $("#imgObj");
        var src = imgSrc.attr("src");
        imgSrc.attr("src", chgUrl(src));
    }
    //时间戳
    //为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
    function chgUrl(url) {
        var timestamp = (new Date()).valueOf();
        url = url.substring(0, 17);
        if ((url.indexOf("&") >= 0)) {
            url = url + "×tamp=" + timestamp;
        } else {
            url = url + "?timestamp=" + timestamp;
        }
        return url;
    }

</script>
<a href="http://localhost:9000/login.shtml">nuomibao</a>

</body>
</html>
<jsp:include page="common/footer.html" />