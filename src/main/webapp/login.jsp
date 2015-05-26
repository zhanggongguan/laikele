<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<font color="red">LOGIN INFO</font>
	<br /> userName:${user.loginName}
	<br /> email:${user.email}
	<form action="saveuser" method="post">
		UserName:<input type="text" name="loginName" value="${user.loginName}" /><br />
		PassWord:<input type="password" name="loginPassword" /><br /> Email:<input
			type="text" name="email" value="${user.email}" /><br /> cnName:<input
			type="text" name="cnName" /><br /> <input type="submit"
			value="Submit" />

	</form>
</body>
</html>