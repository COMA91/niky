<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>관리자 정보 자세히 보기</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>

<style type="text/css">
.addBorder {
	border: 1px soloid green;
}
</style>

</head>
<body>

<div class="container">
	<jsp:include page="../part_header.jsp"></jsp:include>
</div>

	<div class="container">

		<div class="jumbotron">
			<h1 class="display-4 text-center">
				PowerMall<br>
				<br>관리자 정보
			</h1>
		</div>

		<table class="table table-bordered">

			<tbody>
				<tr>
					<th scope="col" class="col-sm-2 text-center">아이디</th>
					<td scope="col">${mDto.id}</td>
				</tr>

				<tr>
					<th scope="col" class="col-sm-2 text-center">이름</th>
					<td scope="col">${mDto.name}</td>
				</tr>


				<tr>
					<th scope="col" class="col-sm-2 text-center">이메일</th>
					<td scope="col">${mDto.email}</td>
				</tr>

				<tr>
					<th scope="col" class="col-sm-2 text-center">주소</th>
					<td scope="col">${mDto.address}</td>
				</tr>
				
					
				<tr>
					<th scope="col" class="col-sm-2 text-center">부서</th>
					<td scope="col">${mDto.department}</td>
				</tr>
				
					
				<tr>
					<th scope="col" class="col-sm-2 text-center">직책</th>
					<td scope="col">${mDto.position}</td>
				</tr>

			</tbody>
		</table>

		<div class="menus text-center mt-5" id="manageroption">
			<button type="button" class="btn btn-success" id="mmypage">마이페이지
			</button>
			<button type="button" class="btn btn-success" id="mupdate">관리자
				정보 변경</button>
			<button type="button" class="btn btn-success" id="mpwupdate">비밀번호
				변경</button>
			<button type="button" class="btn btn-success" id="mdelete">관리자
				탈퇴</button>
				
		</div>


	
		
		

	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			
			$("#manageroption").on("click", "#mmypage", function() {
				location.assign("/manager/mypage/${mDto.id}");
			});
			
			$("#manageroption").on("click", "#mdelete", function() {
				location.assign("/manager/delete/${mDto.id}");
			});

			$("#manageroption").on("click", "#mupdate", function() {
				location.assign("/manager/update/${mDto.id}");
			});
			
			$("#manageroption").on("click", "#mpwupdate", function() {
				location.assign("/manager/updatepw/${mDto.id}");
			});

			
		});
	</script>


</body>
</html>