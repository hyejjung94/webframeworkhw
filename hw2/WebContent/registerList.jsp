<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
}
</style>
</head>
<body>

	<div class="panel-heading">���� ��û ���</div>
	<table class="table table-striped">
		<tbody>
		<thead>
			<tr align="center">
				<th>�����ڵ�</th>
				<th>�����</th>
				<th>����</th>
				<th>����</th>
			</tr>

		</thead>
		<c:forEach var="registerList" items="${registerList}">
			<tr align="center">
				<td>${register.curriculum_code}</td>
				<td>${register.curriculum_name}</td>
				<td>${register.curriculum_type}</td>
				<td>${register.curriculum_point}</td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="main.jsp">main </a>
		</tr>
		</tbody>
	</table>
</body>
</html>