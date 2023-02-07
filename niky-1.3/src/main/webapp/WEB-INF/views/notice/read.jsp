<%@page import="org.springframework.http.MediaType"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>공지사항 자세히 보기</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="/resources/js/templateform.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>

<style type="text/css">
 #uploaded_list li {
 	list-style-type: none;
 	display: inline-block;
 }
</style>

<style type="text/css">
.addBorder {
	border: 1px soloid green;
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
				PowerMall<br> <br>공지사항: ${dto.title}
			</h1>
		</div>

			<div class="form-group row">
				<label for="id">작성자</label>
				<input class="form-control" id="id" value="${dto.id}" readonly>
			</div>
			
			<div class="form-group row">
				<label for="writedate">작성일</label>
				<input class="form-control" id="writedate" value="${dto.writedate}" readonly>
			</div>
			
			
			<div class="form-group row">
				<label for="criteria">종류</label>
				<input id="criteria" class="form-control" value="${dto.criteria}" readonly>
			</div>
			
			<div class="form-group row">
				<label for="title">제목</label>
				<input id="title" class="form-control" value="${dto.title}" readonly>
			</div>
			
			<div class="form-group row">
				<label for="content">내용</label>
				<textarea id="content" class="form-control" readonly>${dto.content}</textarea>
			</div>
			

			
			<div class="form-group row" id="notice_option">
			<a href="/notice/list/${curpage}${empty criteria?'':'/'}${criteria}${empty keyword?'':'/'}${keyword}" class="btn btn-light">
			목록</a> 
			<c:if test="${dto.id == login.id}">
			<a class="btn btn-light" id="notice_btn_update">수정</a> 
			<a class="btn btn-light" id="notice_btn_delete">삭제</a>
			</c:if>

			
			
			</div>

			
		
		
		
		</div>


	<div class="modal" tabindex="-1" id="notice_delete_modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">공지 삭제</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<p>공지를 삭제하시겠습니까?</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" id="delete_modal">삭제</button>
					<button type="button" class="btn btn-secondary" data-dismiss="modal" id="exit_modal">취소</button>

				</div>
			</div>
		</div>
	</div>




	<script type="text/javascript">
		let bno = "${dto.bno}";
	
		
		$(document).ready(function() {
			$("#notice_delete_modal").on("click", "#exit_modal", function() {
				$("#notice_delete_modal").modal("toggle");
			});
			
			$("#notice_delete_modal").on("click", "#delete_modal", function() {
				$.ajax({
					url : "/notice/delete",
					type : "post",
					data : {
						"bno" : ${dto.bno}
					},
					dataType : "text",
					success : function(result) {
						location.assign("/notice/list");
					}
					
				});
			});
			
			$("#notice_option").on("click", "#notice_btn_delete", function() {
				$("#notice_delete_modal").modal("toggle");
			});
			
			$("#notice_option").on("click","#notice_btn_update", function() {
				location.assign("/notice/update/${dto.bno}");
			});
			
			
			
			
			
			
			
		});
		
	</script>


</body>
</html>