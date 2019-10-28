<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/10/13
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr><td colspan="6"><h1>企业工单列表</h1></td></tr>
    <tr>
        <td>工单编号</td>
        <td>项目名称</td>
        <td>执行人</td>
        <td>任务描述</td>
        <td>级别</td>
        <td>创建时间</td>
    </tr>
    <c:forEach items="${work}" var="w">
        <tr>
            <td>${w.id}</td>
            <td>${w.projectName}</td>
            <td>${w.executor}</td>
            <td>${w.description}</td>
            <td>${w.orderLevel}</td>
            <td>${w.createDate}</td>
            <td></td>
        </tr>    
    </c:forEach>
    <tr>
        <td colspan="6" align="center">
            <c:if test="${insert=='ss'}">
                <span style="color: red">保存成功</span>
            </c:if>
            <c:if test="${insert=='er'}">
                <span>保存失败</span>
            </c:if>
        </td>
    </tr>
    
</table>
</body>
</html>
