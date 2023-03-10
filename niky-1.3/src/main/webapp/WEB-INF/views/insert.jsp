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
		
	<div class="menus text-center mt-5" id="div_sel_insert">
			<button type="button" class="btn btn-primary btn-lg" id="div_customer_insert">일반 회원</button>
			<button type="button" class="btn btn-primary btn-lg" id="div_manager_insert">직원 회원</button>
	</div>
	
	<div class="menus text-center mt-5" id="div_exit_insert">
			<button type="button" class="btn btn-secondary btn-lg" id="div_exit">취소</button>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			$("#div_sel_insert").on("click", "#div_customer_insert", function() {
				location.assign("/customer/insert");
				
			});
			
			$("#div_sel_insert").on("click", "#div_manager_insert", function() {
				location.assign("/manager/insert");
				
			});
			
			$("#div_exit_insert").on("click", "#div_exit", function() {
				location.assign("/");
			});
			
			
			
		});
	
	
	</script>

</body>
</html>