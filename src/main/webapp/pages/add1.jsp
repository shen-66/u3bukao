<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/10/13
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add2.do" method="post">
    <table border="1" >
        <tr>
            <td colspan="2">
                <h1 style="text-align: center">
                    企业工单管理系统
                </h1>
            </td>
        </tr>
        <tr>
            <td style="background-color: purple">选择项目</td>
            <td>
                <select name="projectid" id="">
                    <option value="">请选择</option>
                    <c:forEach items="${pro}" var="p">
                        <option value="${p.id}">${p.projectname}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="确认">
            </td>
        </tr>
    </table>
</form>
</body>

</html>
