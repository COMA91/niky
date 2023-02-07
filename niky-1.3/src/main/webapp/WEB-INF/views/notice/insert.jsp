<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>공지 작성</title>

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
	
<script type="text/javascript" src="/resources/js/templateform.js"></script>	

<style type="text/css">
	#file_drop{
		width: 100%;
		height: 150px;
		border: 1px solid gray;
		background-color: #FFFFB6;
		margin: auto;
		
	}
	
	#uploaded_list li{
		list-style-type: none;
		display: inline-block;
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
				PowerMall<br> <br>공지 작성
			</h1>
		</div>

			<div class="form-group row">
				<label for="id">작성자</label>
				<input class="form-control" value="${login.id}" id="id" name="id" readonly>
			</div>
			
			<div class="form-group row">
				<label for="pw">비밀번호</label>
				<input class="form-control" id="pw" name="pw" type="password" required>
				<div id="divpw" class="col-sm-10 offset-sm-2"></div>
			</div>
			
			<div class="form-group row">
				<label for="title">제목</label>
				<input class="form-control" id="title" name="title" required>
			</div>
			
			<div class="form-group row">
				<label for="criteria">종류</label>
				<input class="form-control" id="criteria" name="criteria" required>
			</div>
			
			
			<div class="form-group row">
				<label for="content">내용</label>
				<textarea rows="10" id="content" name="content" class="form-control" required></textarea>
			</div>
			
				
		<div class="form-group row" id="notice_option">
			<button type="submit" class="btn btn-primary" id="notice_insert_submit">등록</button>
			<button type="submit" class="btn btn-primary" id="notice_exit_submit">취소</button>
		</div>
		
	</div>

	<script type="text/javascript">
		$(document).ready(function() {			

			 $("#notice_option").on("click","#notice_exit_submit",function() {
					location.assign("/notice/list");
				});
	            
	            $("#notice_option").on("click","#notice_insert_submit",function() {
	               
	               
	               let pw = $("#pw").val();
	               if(pw == ""){
	                  $("#pw").focus();
	                  return false;
	               }
	               
	               let title = $("#title").val();
	               if(title == ""){
	                  $("#title").focus();
	                  return false;
	               }
	               
	               let criteria = $("#criteria").val();
	               if(criteria == ""){
	                  $("#criteria").focus();
	                  return false;
	               }
	               
	               let content = $("#content").val();
	               if(content == ""){
	                  $("#content").focus();
	                  return false;
	               }
	               
	               $.ajax({
	                  url : "/notice/insert",
	                  type : "post",
	                  data : {
	                	  "id" : "${login.id}",
	                	  "pw" : pw,
	                	  "title" : title,
	                	  "criteria" : criteria,
	                	  "content" : content
	                  },
	                  dataType : "text",
	                  success : function(result) {
	                	  if (result > 0) {
	                	location.assign("/notice/list");				
						}else{
							alert("잘못된 비밀번호");
							$("#pw").val("");
							$("#pw").focus();
							$("#pw").select();
						}
					}
	                  
	               });
	               
	            });
	         });
	</script>


</body>
</html>