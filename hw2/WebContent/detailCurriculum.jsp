<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
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

	<div class="panel-heading">상세보기</div>
	<table class="table table-striped">
		<tbody>
		<thead>
			<tr align="center">
				<th>과목명</th>
			</tr>

		</thead>
		<c:forEach var="curriculum" items="${curriculumnameList}">
			<tr align="center">
				<td>${curriculum.curriculum_name}</td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="${pageContext.request.contextPath}/ ">main</a>
		</tr>
		</tbody>
	</table>
</body>
</html>