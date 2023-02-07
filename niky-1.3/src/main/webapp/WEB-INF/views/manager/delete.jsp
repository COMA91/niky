<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>비밀번호 변경</title>

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
</head>
<body>

<div class="container">
	<jsp:include page="../part_header.jsp"></jsp:include>
</div>

	<div class="container">
	<div class="jumbotron">
 		<h1 class="display-4 text-center">PowerMall<br><br>관리자 탈퇴</h1>
	</div>

		<div class="form-group row">
			<label for="id" class="col-sm-2 col-form-label text-right">아이디</label>
			<div class="col-sm-10">
				<input class="form-control" id="id" name="id" value="${mDto.id}" readonly>
			</div>
		</div>
		
		<div class="form-group row">
			<label for="name" class="col-sm-2 col-form-label text-right">이름</label>
			<div class="col-sm-10">
				<input class="form-control" id="name" name="name" value="${mDto.name}" readonly>
			</div>
		</div>
		
		<div class="form-group row">
			<label for="email" class="col-sm-2 col-form-label text-right">이메일</label>
			<div class="col-sm-10">
				<input class="form-control" id="email" name="email" value="${mDto.email}" readonly>
			</div>
		</div>
		
		

		<div class="form-group row">
				<label for="pw" class="col-sm-2 col-form-label text-right">비밀번호</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pw" name="pw" required>
				</div>
				<div id="divpw" class="col-sm-10 offset-sm-2"></div>
		</div>
		
		<div class="form-group row">
			<label for="department" class="col-sm-2 col-form-label text-right">부서</label>
			<div class="col-sm-10">
				<input class="form-control" id="department" name="department" value="${mDto.department}" readonly>
			</div>
		</div>
		
		<div class="form-group row">
			<label for="position" class="col-sm-2 col-form-label text-right">직책</label>
			<div class="col-sm-10">
				<input class="form-control" id="position" name="position" value="${mDto.position}" readonly>
			</div>
		</div>

		<div class="input-group mb-3 col-sm-11 offset-sm-1">
			<div class="input-group-prepend">
				<label class="input-group-text" for="selectDeleteReason">탈퇴 사유</label>
			</div>
			<select class="custom-select" id="selectDeleteReason">
				<option selected>관리자 탈퇴 사유를 선택해주세요.</option>
				<option value="8">이직</option>
				<option value="9">부서이동으로 권한소실</option>
				<option value="10">퇴사</option>
			</select>
		</div>
		<div id="divdeletereason" class="col-sm-10 offset-sm-2"></div>




			<div class="menus text-center mt-5">
				<div id="managerdelsubmit">
					<button type="submit" class="btn btn-primary" id="managerdelete">탈퇴</button>
					<button type="submit" class="btn btn-primary" id="delete_exit">취소</button>
				</div>
			</div>

	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("#managerdelsubmit").on("click", "#delete_exit", function() {
				location.assign("/manager/read/${mDto.id}");
			});
			
			$("#managerdelsubmit").on("click", "#managerdelete", function() {
				let pw = $("#pw").val();
				$("#divpw").html("");
				$("#divdeletereason").html("");
				if (pw == "") {
					$("pw").focus();
					$("pw").select();
					$("#divpw").html("<span style='color:red;'>비밀번호를 입력하세요.</span>");
					return false;
				}
				
				let selectDeleteReason = $("#selectDeleteReason").val();
				
				if (selectDeleteReason == "회원 탈퇴 사유를 선택해주세요.") {
					$("#selectDeleteReason").focus();
					$("#selectDeleteReason").select();
					$("#divdeletereason").html("<span style='color:red;'>탈퇴사유를 선택하세요.</span>");
					return false;
				}
				
				$.ajax({
					url : "/manager/delete",
					type : "post",
					data : {
						"id" : "${mDto.id}",
						"name" : "${mDto.name}",
						"email" : "${mDto.email}",
						"grade" : "${mDto.grade}",
						"pw" : pw,
						"reason" : selectDeleteReason
					},
					dataType : "text",
					success : function(result) {
						if (result > 0 ) {
							alert("회원 탈퇴되셨습니다.");
							location.assign("/");
						}else{
							$("pw").val("");
							$("pw").focus();
							$("pw").select();
							$("#divpw").html("<span style='color:red;'>잘못된 비밀번호</span>");
						}
						
						
					}
					
					
				});
			});
			
			
		});
	
	
	
	</script>

</body>
</html>