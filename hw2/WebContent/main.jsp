<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Main</title>
</head>
<body>
	<h1>���� ���� �ý��� -����</h1>
<!-- �α����� �� ������� ������ ����� �ش�. 

ȸ������ �ִ� ������� userID�� ������ ���� �ǰ�

�ƴ� ����� null���� ������ �ȴ�.

-->

<%

String userID = null;

if(session.getAttribute("userID") != null){

userID = (String) session.getAttribute("userID");

}

%>
	
		<P><a href="login.jsp">
			*�α���*</a></P>
			
		<P><a href="logoutAction.jsp">
			*�α׾ƿ�*</a></P>
	
		<!-- �б⺰ �̼����� ��ȸ -->
		<P><a href="semesterPoint.jsp">
			1. �б⺰ �̼� ���� ��ȸ</a></P>
			
		<!-- ���� ��û -->	
		<P><a href="register.jsp">
			2. ���� ��û �ϱ�</a></P>
			
		<!-- ���� ��û ��ȸ -->	
		<P><a href="registerList.jsp">
			3. ���� ��û ��ȸ</a></P>
			
</body>
</html>