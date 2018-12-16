<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Main</title>
</head>
<body>
	<h1>종합 정보 시스템 -수강</h1>
<!-- 로그인이 된 사람들의 세션을 만들어 준다. 

회원값이 있는 사람들은 userID에 정보가 담기게 되고

아닌 사람은 null값을 가지게 된다.

-->

<%

String userID = null;

if(session.getAttribute("userID") != null){

userID = (String) session.getAttribute("userID");

}

%>
	
		<P><a href="login.jsp">
			*로그인*</a></P>
			
		<P><a href="logoutAction.jsp">
			*로그아웃*</a></P>
	
		<!-- 학기별 이수학점 조회 -->
		<P><a href="semesterPoint.jsp">
			1. 학기별 이수 학점 조회</a></P>
			
		<!-- 수강 신청 -->	
		<P><a href="register.jsp">
			2. 수강 신청 하기</a></P>
			
		<!-- 수강 신청 조회 -->	
		<P><a href="registerList.jsp">
			3. 수강 신청 조회</a></P>
			
</body>
</html>