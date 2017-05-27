<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UFT-8"%>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>
            HttpMessageConverter Demo
        </title>
    </head>
    <body>
        <div id="resp"></div>
        <input type="button" onclick="req()" value="请求"/>
        <script src="assets/js/jquery.js" type="text/javascript">
        </script>
        <script>
            function req() {
                $.ajax({
                    url:"convert",
                    date:"1_liuyafei",
                    type:"POST",
                    contentType:"application/x-wisely",
                    success:function (data) {
                        $("#resp").html(data)
                    }
                })
            }
        </script>
    </body>
</html>