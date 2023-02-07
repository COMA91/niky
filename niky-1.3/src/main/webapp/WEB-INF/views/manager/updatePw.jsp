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
 		<h1 class="display-4 text-center">PowerMall<br><br>비밀번호 변경</h1>
	</div>

			<div class="form-group row">
				<label for="id" class="col-sm-2 col-form-label text-right">아이디</label>
				<div class="col-sm-10">
					<input class="form-control" id="id" name="id" value="${mDto.id}" readonly>
				</div>
			</div>

			<div class="form-group row">
				<label for="pw" class="col-sm-2 col-form-label text-right">기존 비밀번호</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pw" name="pw" required>
				</div>
				<div id="divpw" class="col-sm-10 offset-sm-2"></div>
			</div>

			<div class="form-group row">
				<label for="pw1" class="col-sm-2 col-form-label text-right">새로운 비밀번호</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pw1" name="pw1"
						required>
				</div>
				<div id="divpw2" class="col-sm-10 offset-sm-2"></div>
			</div>


			<div class="form-group row">
				<label for="pw2" class="col-sm-2 col-form-label text-right">비밀번호(확인)</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pw2" name="pw2" required>
				</div>
				<div id="divpw3" class="col-sm-10 offset-sm-2"></div>
			</div>



			<div class="menus text-center mt-5">
				<div id="managerupdsubmit">
      				<button type="submit" class="btn btn-primary" id="managerchangepw">변경</button>
    				<button type="submit" class="btn btn-primary" id="managerchangepw_exit">취소</button>
    			</div>
    		</div>

	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			
			$("#managerupdsubmit").on("click", "#managerchangepw_exit", function() {
				location.assign("/manager/read/${mDto.id}");
			});
			
			$("#managerupdsubmit").on("click", "#managerchangepw", function() {
				
				msg = "<span style='color:red;'>비밀번호를 입력하세요.</span>";
				
				let pw = $("#pw").val();


				if(pw == ""){
					$("#pw").focus();
					$("#divpw").html(msg);
					return false;
				}
				$("#divpw").html("");
				let pw1 = $("#pw1").val();

				if(pw1 == ""){
					$("#pw1").focus();
					$("#divpw2").html(msg);
					return false;
				}
				$("#divpw2").html("");
				
				let pw2 = $("#pw2").val();


				if(pw2 == ""){
					$("#pw2").focus();
					$("#divpw3").html(msg);
					return false;
				}
				
				$("#divpw3").html("");
				
				if(pw1 != pw2){
					$("#pw2").focus();
					$("#divpw3").html("<span style='color:red;'>동일하지 않은 비밀번호입니다.</span>");
					return false;
				}
				$("#divpw3").html("");
				
				if (pw == pw1) {
					$("#pw1").val("");
					$("#pw2").val("");
					$("#pw1").focus();
					$("#pw1").select();
					$("#divpw2").html("<span style='color:red;'>기존 비밀번호와 동일합니다</span>");
					return false;
				}
				$("#divpw2").html("");
				$.ajax({
					url : "/manager/updatepw",
					type : "post",
					data : {
						"id" : "${mDto.id}",
						"pw" : pw,
						"pw1" : pw1
					},
					dataType : "text",
					success : function(result) {
						if (result > 0) {
							alert("비밀번호가 변경되었습니다.");
							location.assign("/manager/read/${mDto.id}");
						} else {
							$("#pw1").val("");
							$("#pw2").val("");
							$("#pw").focus();
							$("#pw").select();
							$("#divpw").html("<span style='color:red;'>잘못된 비밀번호를 입력하셨습니다.</span>");
						}
					}
				});
				
			});
							
		});
</script>
	
	
	
	
	
	
	
	
</body>
</html>