<%--
  Created by IntelliJ IDEA.
  User: xuan
  Date: 2017/3/6 0006
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
  <table>
    <tr>
      <td>id</td>
      <td>name</td>
    </tr>
    <s:iterator value="products" var="p">
      <tr>
        <td>${p.id}</td>
        <td>${p.name}</td>
      </tr>
    </s:iterator>
  </table>
</body>
</html>
