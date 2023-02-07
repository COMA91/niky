<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Power Mall My page</title>
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
			<h1 class="display-4">
				${mDto.id} 
			</h1>	
				부서 : ${mDto.department}<br>
				직책 : ${mDto.position}<br>
		<div class="menus text-center mt-5" id="manageroption">
			<button type="button" class="btn btn-success" id="mread">관리자
				정보</button>
			<button type="button" class="btn btn-success" id="mupdate">관리자
				정보 변경</button>
			<button type="button" class="btn btn-success" id="clist">회원 목록
			</button>	
				
		</div>
			
		</div>

	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("#manageroption").on("click", "#mread", function() {
				location.assign("/manager/read/${mDto.id}");
			});
			$("#manageroption").on("click", "#mupdate", function() {
				location.assign("/manager/update/${mDto.id}");
			});	
			$("#manageroption").on("click", "#clist", function() {
				location.assign("/customer/list");
			});	
		});
		
	
	</script>
</body>
</html>