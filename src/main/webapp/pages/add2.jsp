<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/10/13
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");%>
<html>
<head>
    <title>

    </title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/add.do" method="post" id="for">
    <table border="1">
        <input type="hidden" name="projectid" value="${projectid}">
        <tr>
            <td colspan="2">
                <h1>添加工单</h1>
            </td>
        </tr>
        <tr>
            <td style="background-color: purple">执行人(*)</td>
            <td><input type="text" name="executor" value="" id="per"></td>
        </tr>
        <tr>
            <td style="background-color: purple">任务描述(*)</td>
            <td><textarea name="description" id="des" cols="30" rows="10"></textarea></td>
        </tr>
        <tr>
            <td style="background-color: purple">级别(*)</td>
            <td>
                <select name="orderlevel" >
                    <option value="1级">1级</option>
                    <option value="2级">2级</option>
                    <option value="3级">3级</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交" onsubmit="go()"></td>
        </tr>
    </table>
</form>
</body>
<script>
    $(function () {
        $("#for").submit(function () {
            if ($("#per").val()==''){
                alert("执行人不能为空")
                return false;
            }
            if ($("#des").val()==''){
                alert("描述不能为空")
                return false;
            }
            return true;
        })
    })
</script>
</html>
