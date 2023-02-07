<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>PowerMall 관리자정보변경</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="/resources/js/templateform.js"></script>
</head>
<body>
<div class="container">
	<jsp:include page="../part_header.jsp"></jsp:include>
</div>

<div class="container">
	<div class="jumbotron">
 		<h1 class="display-4 text-center">PowerMall<br><br>관리자 정보 변경</h1>
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
				<label for="pw" class="col-sm-2 col-form-label text-right">비밀번호</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pw" name="pw" required>
				</div>
				<div id="divpw" class="col-sm-10 offset-sm-2"></div>
			</div>




			<div class="form-group row">
				<label for="email" class="col-sm-2 col-form-label text-right">이메일</label>
				<div class="col-sm-10">
					<input class="form-control" id="email" name="email" type="email" required value="${mDto.email}">
				</div>
			</div>

			<div class="form-group row">
				<label for="phone" class="col-sm-2 col-form-label text-right">전화번호</label>
				<div class="col-sm-10">
					<input type="text" pattern="[0-9]+" class="form-control" id="phone" name="phone" placeholder="-제외하고 숫자만 입력" maxlength="11" required/>
				</div>
			</div>

			<div class="form-group row">
				<label for="address" class="col-sm-2 col-form-label text-right">주소</label>
				<div class="col-sm-10">
					<input class="form-control" id="address" name="address" required value="${mDto.address}">
				</div>
			</div>
			
			<div class="form-group row">
				<label for="department" class="col-sm-2 col-form-label text-right">부서</label>
				<div class="col-sm-10">
					<input class="form-control" id="department" name="department" required value="${mDto.department}">
				</div>
			</div>
			
			<div class="form-group row">
				<label for="position" class="col-sm-2 col-form-label text-right">직책</label>
				<div class="col-sm-10">
					<input class="form-control" id="position" name="position" required value="${mDto.position}">
				</div>
			</div>
			
			<div class="menus text-center mt-5">
    			<div id="managerupdsubmit">
      				<button type="submit" class="btn btn-primary" id="managersubmitchange">수정</button>
      				<button type="submit" class="btn btn-primary" id="changesubmitexit">취소</button>
				</div>
  			</div>

	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			
			$("#managerupdsubmit").on("click",	"#changesubmitexit", function() {
				location.assign("/manager/mypage/${mDto.id}");
			});
			
			$("#managerupdsubmit").on("click", "#managersubmitchange", function() {
						
				let pw = $("#pw").val();


				if(pw == ""){
					$("#pw").focus();
					return false;
				}
				
				let email = $("#email").val();


				if(email == ""){
					$("#email").focus();
					return false;
				}
				
				let phone = $("#phone").val();


				if(phone == ""){
					$("#phone").focus();
					return false;
				}
				
				let address = $("#address").val();


				if(address == ""){
					$("#address").focus();
					return false;
				}
				
				if(department == "부서"){
					$("#department").focus();
					return false;
				}
				
				if(position == "직책"){
					$("#position").focus();
					return false;
				}
				
				$.ajax({
					url : "/manager/update",
					type : "post",
					data : {
						"id" : "${mDto.id}",
						"name" : "${mDto.name}",
						"pw" : pw,
						"email" : email,
						"phone" : phone,
						"address" : address,
						"department" : department,
						"position" : position
						},
						dataType : "text",
						success : function(result) {
							if (result > 0) {
								alert("관리자정보가 변경되었습니다.");
								location.assign("/manger/read/${mDto.id}");
							}else{
								 $("#pw").val("");
								 $("#pw").focus();
								 $("#pw").select();
								 $("#divpw").html("<span style='color:red;'>잘못된 비밀번호</span>");
							}
						}
				});
				
				
			});
						
			
		});
	</script>



</body>
</html>