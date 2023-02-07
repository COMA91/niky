<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>PowerMall 회원가입</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</head>
<body>

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

</style>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1 class="display-4 text-center">
				PowerMall<br> <br>직원 회원 가입
			</h1>
		</div>


			<div class="form-group row" id="dividp">
				<label for="id" class="col-sm-2 col-form-label text-right">아이디</label>
				<div class="col-sm-8">
					<input class="form-control" id="id" name="id" required>
				</div>
				<div class="col-sm-2 text-right">
					<button class="btn btn-info" id="idcheck">중복확인</button>
				</div>
				<div id="divid" class="col-sm-10 offset-sm-2"></div>
			</div>

			<div class="form-group row">
				<label for="name" class="col-sm-2 col-form-label text-right">이름</label>
				<div class="col-sm-8">
					<input class="form-control" id="name" name="name" required>
				</div>
				<div id="divid" class="col-sm-10 offset-sm-2"></div>
			</div>

			<div class="form-group row">
				<label for="pw" class="col-sm-2 col-form-label text-right">비밀번호</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" id="pw" name="pw"
						required>
				</div>
			</div>

			<div class="form-group row">
				<label for="email" class="col-sm-2 col-form-label text-right">이메일</label>
				<div class="col-sm-8">
					<input type="email" class="form-control" id="email" name="email" placeholder="name@example.com">
				</div>
			</div>

			<div class="form-group row">
				<label for="phone" class="col-sm-2 col-form-label text-right">전화번호</label>
				<div class="col-sm-8">
					<input type="text" pattern="[0-9]+" class="form-control" id="phone" name="phone" placeholder="-제외하고 숫자만 입력" maxlength="11" required/>
				</div>
			</div>
			
			<div class="form-group row">
				<label for="address" class="col-sm-2 col-form-label text-right">주소</label>
				<div class="col-sm-8">
					<input class="form-control" id="address" name="address" required>
				</div>
			</div>
			
			<div class="form-group row">
				<label for="department" class="col-sm-2 col-form-label text-right">부서</label>
				<div class="col-sm-8">
					<input class="form-control" id="department" name="department" required>
				</div>
			</div>
			
			<div class="form-group row">
				<label for="position" class="col-sm-2 col-form-label text-right">직책</label>
				<div class="col-sm-8">
					<input class="form-control" id="position" name="position" required>
				</div>
			</div>
			
			<div class="form-group row">
				<label for="code" class="col-sm-2 col-form-label text-right">회원가입코드</label>
				<div class="col-sm-8">
					<input class="form-control" type="password" id="code" name="code" required>
				</div>
			</div>


			<div class="menus text-center mt-5" id="divinsert">
				
					<button type="submit" class="btn btn-primary" id="div_manager_insert_submit">가입</button>
			
				
					<button type="submit" class="btn btn-primary" id="divsubmitexit">취소</button>
				
			</div>

	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			let idCheck = false;
			
			$("#divinsert").on("click", "#divsubmitexit", function() {
				location.assign("/");
			});
			
			$("#dividp").on("input", "#id", function() {
				idCheck = false;
			});
			
			$("#dividp").on("click", "#idcheck", function(event) {
				event.preventDefault();
				let id = $("#id").val();
				if (id == "") {
					$("#id").focus();
					return false;
				}
				$.ajax({
					url : "/customer/idcheck",
					type : "post",
					data : {
						"id" : id
					},
					dataType : "text",
					success : function(result) {
					let msg = "";

					if (result == 1) {
						msg = "<span style='color:green;'>사용 가능한 아이디입니다.</sapn>";
						idCheck = true;
					} else {
						$("#id")
						msg = "<span style='color:red;'>사용 불가능한 아이디입니다.</span>";
					}
						$("#divid").html(msg);
	
					}
				});
			});
			
			
			$("#divinsert").on("click", "#div_manager_insert_submit", function() {
				msg = null;
				if (idCheck) {
				let id = $("#id").val();
				
					if (id == "") {
							$("#id").focus();
							return false;
					}
					
				let name = $("#name").val();

					if (name == "") {
						$("#name").focus();
						return false;
						}

				let pw = $("#pw").val();

					if (pw == "") {
						$("#pw").focus();
						return false;
						}
				
				let phone = $("#phone").val();

					if (phone == "") {
						$("#phone").focus();
						return false;
						}
					
				let email = $("#email").val();

					if (email == "") {
						$("#email").focus();
						return false;
						}
					
				let address = $("#address").val();
					
					if (address == "") {
						$("#address").focus();
						return false;
					}
					
				let department = $("#department").val();
					
					if (department == "") {
						$("#department").focus();
						return false;
					}
					
				let position = $("#position").val();
					
					if (position == "") {
						$("#position").focus();
						return false;
					}
					
				let code = $("#code").val();
					
					if (code == "") {
						$("#code").focus();
						return false;
					}
					
				$.ajax({
					url : "/manager/insert",
					type : "post",
					data :{
						"id" : id,
						"name" : name,
						"pw" : pw,
						"email" : email,
						"phone" : phone,
						"address" : address,
						"department" : department,
						"position" : position,
						"secretcode" : code
					},
					dataType : "text",
					success : function(result) {
						if (result > 0) {
							location.assign("/");
						}else{
							alert("잘못된 코드를 입력하셨습니다.");
							$("#code").val("");
							$("#code").focus();
							$("#code").select();
						}
						
					}
				});
					
				
				} else {
					$("#id").focus();
					msg = "<span style='color:red;'>아이디 중복확인 하세요.</span>";
					$("#divid").html(msg);
					return false;
				}
			
			});
		});

		
	</script>

</body>
</html>