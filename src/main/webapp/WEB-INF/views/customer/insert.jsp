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
				PowerMall<br> <br>회원 가입
			</h1>
		</div>

		<form action="/customer/insert" method="post">
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
				<label for="pw1" class="col-sm-2 col-form-label text-right">비밀번호</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" id="pw1" name="pw"
						required>
				</div>
			</div>


			<div class="form-group row">
				<label for="birth" class="col-sm-2 col-form-label text-right">생년월일</label>
				<div class="col-sm-5">
					<input class="form-control" id="birth" name="birth" type="date"
						required>
				</div>
				-
				<div class="col-sm-3 margin-left-1">
					<input class="form-control" type="number" id="sex" name="sex" placeholder="주민등록번호 뒷자리 1자리" maxlength="1" required/>
				</div>
				<div id="divsex" class="col-sm-10 offset-sm-2"></div>
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
				<div class="col-sm-8" id="divsubmitp">
					<button type="submit" class="btn btn-primary">가입</button>
				</div>
				<div class="col-sm-8" id="divsubmitexit">
					<button type="submit" class="btn btn-primary">취소</button>
				</div>
			</div>

		</form>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			let idCheck = false;
			
			$("#divsubmitexit").on("click", "button[type='submit']", function() {
				location.assign("/home");
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
			
			
			$("#divsubmitp").on("click", "button[type='submit']", function(event) {
				event.preventDefault();
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

				let pw1 = $("#pw1").val();

					if (pw1 == "") {
						$("#pw1").focus();
						return false;
						}
				let birth = $("#birth").val();

					if (birth == "") {
						$("#birth").focus();
						return false;
						}
					
				let sex = $("#sex").val();

					if (sex == "") {
						$("#sex").focus();
						return false;
						}
					
					if (sex > 4 || sex < 1) {
						$("#sex").focus();
						$("#sex").select();
						msg = "<span style='color:red;'>잘못된 정보를 입력하셨습니다.</span>";
						$("#divsex").html(msg);
						return false;
						
					}
					
				let email = $("#email").val();

					if (email == "") {
						$("#email").focus();
						return false;
						}
					
					
					
				let phone = $("#phone").val();

					if (phone == "") {
						$("#phone").focus();
						return false;
						}
					
				let address = $("#address").val();
					
					if (address == "") {
						$("#address").focus();
						return false;
					}
					
				$("form").submit();
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