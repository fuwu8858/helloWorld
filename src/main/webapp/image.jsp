<%--
 
  User: gjy
  Date: 2016/1/12
  Time: 9:55
  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include  page="/common/head.jsp"/>
<!doctype html>
<html>
<head>
    <meta charset="utf-8" />
    <title>KindEditor JSP</title>
    <link rel="stylesheet" href="/themes/default/default.css" />
    <link rel="stylesheet" href="/plugins/code/prettify.css" />
    <script charset="utf-8" src="/javascripts/kindeditor.js"></script>
    <script charset="utf-8" src="/lang/zh_CN.js"></script>
    <script charset="utf-8" src="/plugins/code/prettify.js"></script>

    <script>
        KindEditor.ready(function(K) {
            var editor1 = K.create('textarea[name="content1"]', {
                cssPath : '../plugins/code/prettify.css',
                uploadJson : '/fileUpload.do',
                fileManagerJson : '/fileManage.do',
                allowFileManager : true,
                afterCreate : function() {
                    var self = this;
                    K.ctrl(document, 13, function() {
                        self.sync();
                        document.forms['example'].submit();
                    });
                    K.ctrl(self.edit.doc, 13, function() {
                        self.sync();
                        document.forms['example'].submit();
                    });
                }
            });
            prettyPrint();
        });
    </script>
</head>
<body>


    <textarea name="content1" cols="100" rows="8" style="width:700px;height:200px;visibility:hidden;"></textarea>



</body>
</html>
<%!
    private String htmlspecialchars(String str) {
        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("\"", "&quot;");
        return str;
    }
%>
<jsp:include page="common/footer.html" />