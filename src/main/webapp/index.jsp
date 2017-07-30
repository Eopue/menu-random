<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Document</title>
    <meta http-equiv="content" content="text/html;charset=utf-8">
    <script type="text/javascript" src="jquery/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        function query() {
            $.ajax({
                type:"get",//请求方式
                url:"/menu/index?num=2",//发送请求地址

                success:function(msg){
                    $(".resText").html(msg);
                },
                error:function(XMLHttpRequest){
                    alert("查询失败!")
//                    alert(XMLHttpRequest.status);
//                    alert(XMLHttpRequest.readyState);
                }
            });
        }

        function remove() {
            $.ajax({
                type:"post",//请求方式
                url:"/web-mvc/delete",//发送请求地址
                data:{//发送给数据库的数据
                    id:$("#id").val(),
                },
                success:function(msg){
                    $(".resText").html(msg);
                },
                error:function(XMLHttpRequest){
                    alert("删除失败!")
//                    alert(XMLHttpRequest.status);
//                    alert(XMLHttpRequest.readyState);
                }
            });
        }

        function add() {
            $.ajax({
                type:"post",//请求方式
                url:"/web-mvc/add",//发送请求地址
                data:{//发送给数据库的数据
                    username:$("#username").val(),
                    age:$("#age").val(),
                    salary:$("#salary").val()
                },
                success:function(msg){
                    $(".resText").html(msg);
                },
                error:function(XMLHttpRequest){
                    alert("添加失败!")
//                    alert(XMLHttpRequest.status);
//                    alert(XMLHttpRequest.readyState);
                }
            });
        }

        function modify() {
            $.ajax({
                type:"post",//请求方式
                url:"/web-mvc/modify",//发送请求地址
                data:{//发送给数据库的数据
                    id:$("#id").val(),
                    username:$("#username").val(),
                    age:$("#age").val(),
                    salary:$("#salary").val()
                },
                success:function(msg){
                    $(".resText").html(msg);
                },
                error:function(XMLHttpRequest){
                    alert("修改失败!")
//                    alert(XMLHttpRequest.status);
//                    alert(XMLHttpRequest.readyState);
                }
            });
        }

        function login() {
            $.ajax({
                type:"post",//请求方式
                url:"/web-mvc/login",//发送请求地址
                data:{//发送给数据库的数据
                    username:$("#username").val(),
                    age:$("#age").val(),
                    salary:$("#salary").val()
                },
                success:function(msg){
                    $(".resText").html("验证成功!");
                },
                error:function(XMLHttpRequest){
                    alert("登录失败!")
//                    alert(XMLHttpRequest.status);
//                    alert(XMLHttpRequest.readyState);
                }
            });
        }
    </script>
</head>
<body>
<p>id：<input type="text" name="id" id="id"/></p>
<p>姓名：<input type="text" name="username" id="username"/></p>
<p>年龄：<input type="text" name="age" id="age"/></p>
<p>工资：<input type="text" name="salary" id="salary"/></p>
<p>
    <input type="button"  value="添加" onclick="add();"/>
    <input type="button"  value="删除" onclick="remove();"/>
    <input type="button"  value="修改" onclick="modify();"/>
    <input type="button"  value="查询" onclick="query();"/>
    <input type="button"  value="登录" onclick="login();"/>
</p>
<div class="resText">
</div>

</body>
</html>
