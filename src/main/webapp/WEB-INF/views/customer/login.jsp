<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>로그인</title>
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
		<form class="form-signin" action="/customer/loginPost" method="POST">
			<img class="mb-4" src="https://getbootstrap.com/docs/4.6/assets/brand/bootstrap-solid.svg"
				alt="" width="72" height="72">
			<label for="id" class="sr-only">아이디</label> 
			<input name="id" id="id" class="form-control my-4" placeholder="아이디를 입력하세요." required autofocus> 
			<label for="pw" class="sr-only">비밀번호</label> 
			<input name="pw" type="password" id="pw" class="form-control my-4" placeholder="비밀번호를 입력하세요." required>
			<button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
		</form>

	</div>

</body>
</html>