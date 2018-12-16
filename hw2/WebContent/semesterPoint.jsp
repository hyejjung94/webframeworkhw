<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
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

	<div class="panel-heading">학년/학기별 이수 총 학점</div>
	<table class="table table-striped">
		<tbody>
		<thead>
			<tr align="center">
				<th>년도</th>
				<th>학기</th>
				<th>이수 학점</th>
				<th>상세보기</th>
			</tr>

		</thead>
		<c:forEach var="semesterPoint" items="${semesterPoint}">
			<tr align="center">
				<td>${semesterPoint.curriculum_year }</td>
				<td>${semesterPoint.curriculum_semester }</td>
				<td>${semesterPoint.curriculum_point }</td>
				<td><a href="${pageContext.request.contextPath }/yearSemesterCurriculum?curriculum_year=${semesterPoint.curriculum_year }&course_semester=${semesterPoint.curriculum_semester }">링크</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="main.jsp">main </a>
		</tr>
		</tbody>
	</table>
</body>
</html>