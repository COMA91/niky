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
		<jsp:include page="../part_header.jsp"></jsp:include>
	</div>
	

	<div class="container">
		<img class="img-fluid mx-auto d-block mb-3"
			src="#"
			alt="">
		<h1 class="mb-1 text-center">Sign up</h1>
		<p class="fs-14 text-gray text-center mb-5">Join to Power mall!</p>

		<form action="/customer/insert" method="post">

			<div id="divid" class="col-sm-10 offset-sm-2">
				<label for="id" class="col-sm-2 col-form-label">Id</label>
				<div class="col-sm-8">
					<input class="form-control" id="id" name="id" required>
				</div>
			</div>
			<div id="divpw" class="col-sm-10 offset-sm-2">
				<label for="pw1" class="col-sm-2 col-form-label">Pw</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" id="pw1" name="pw1"
						required>
				</div>
			</div>
			<div id="divpw" class="col-sm-10 offset-sm-2">
				<label for="pw2" class="col-sm-2 col-form-label">Pw Check</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" id="pw2" name="pw2"
						required>
				</div>
			</div>
			<div id="divname" class="col-sm-10 offset-sm-2">
				<label for="name" class="col-sm-2 col-form-label">Name</label>
				<div class="col-sm-8">
					<input class="form-control" id="name" name="name" required>
				</div>
			</div>
			
			<div id="divbirth" class="col-sm-8 offset-sm-2">
				<label for="birth" class="col-sm-2 col-form-label">Birth</label>
				<div class="col-sm-8">
					<input class="form-control" id="birth" name="birth" type="date" required>
				</div>
				<label for="birth" class="col-sm-4 col-form-label">Sex</label>
				<div class="col-sm-2 margin-left-1">
					<input class="form-control" type="number" id="sex" name="sex" maxlength="1" required />
				</div>
	
			</div>
			

			<div id="divemail" class="col-sm-10 offset-sm-2">
				<label for="email" class="col-sm-2 col-form-label">Email</label>
				<div class="col-sm-8">
					<input type="email" class="form-control" id="email" name="email"
						placeholder="name@example.com" required />
				</div>
			</div>
			<div id="divphone" class="col-sm-10 offset-sm-2">
				<label for="phone" class="col-sm-2 col-form-label">phone</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" pattern="[0-9]+" id="phone"
						name="phone" placeholder="-제외하고 숫자만 입력" maxlength="11" required />
				</div>
			</div>

			<div id="divAddress" class="col-sm-10 offset-sm-2">
				<label for="Address" class="col-sm-2 col-form-label">Address</label>
				<div class="col-sm-8">
					<input class="form-control" id="address" name="address" required />
				</div>
			</div>

			<div class="menus text-center mt-5">
				
					<button type="submit" class="btn btn-primary" id="divsubmitp">가입</button>
			
				
					<button type="submit" class="btn btn-primary" id="divsubmitexit">취소</button>
				
			</div>
			</div>
		</form>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			let idCheck = false;
			
			$("#divsubmitexit").click(function() {
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
			
			
			$("#divsubmitp").on("click", "#divsubmitp", function(event) {
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

				let pw = $("#pw").val();

					if (pw1 == "") {
						$("#pw").focus();
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