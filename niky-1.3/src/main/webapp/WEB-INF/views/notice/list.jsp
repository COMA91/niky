<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>${empty pt.criteria? '공지사항': '공지사항 검색 결과'}</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
	<jsp:include page="../part_header.jsp"></jsp:include>
</div>

<div class="container">
	<div class="jumbotron">
		<h1 class="display-4 text-center">
			Powermall<br>				
			<br>공지사항
		</h1>
	</div>	
	<c:if test="${fn:contains(login.grade, 'M')}">
		<a href="/notice/insert">공지 작성</a>
	</c:if>
	<table class="table">
	  <thead class="thead-dark">
	    <tr>
			<th scope="col" class="text-center">글번호</th>
			<th scope="col" class="text-center">종류</th>
	    	<th scope="col" class="text-center">게시자</th>
	    	<th scope="col" class="text-center">제목</th>
	    	<th scope="col" class="text-center">작성일</th>
	    </tr>
	  </thead>
	  <tbody>
		<c:forEach items="${list}" var="notice">
	    <tr>
	      <td class="text-center">${notice.bno}</td>
	      <td class="text-center">${notice.criteria}</td>
	      <td class="text-center">${notice.id}</td>
	      <td class="text-center"><a href="/notice/read/${notice.bno}">${notice.title}</a></td>
	      <td class="text-center">${notice.writedate}</td>
	    </tr>
		</c:forEach>
		
		
	  </tbody>
	</table>
		<jsp:include page="part_search.jsp"/>
		<nav aria-label="Page navigation example">
			<ul class="pagination justify-content-center">
					<li class="page-item ${pt.curpage > 1? '': 'disabled' }"><a class="page-link" href="/notice/list/1${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&laquo;</a></li>

					<li class="page-item ${pt.curpage > 1? '': 'disabled' }"><a class="page-link" href="/notice/list/${pt.curpage-1}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&lt;</a></li>

					<c:forEach begin="${pt.beginPageNum}" end="${pt.finishPageNum}" var="i">
						<li class="page-item ${pt.curpage != i?'':'active'}">
							<a class="page-link" href="/customer/list/${i}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">${i}</a></li>
					</c:forEach>

					<li class="page-item ${pt.curpage < pt.totalPageNum? '': 'disabled' }"><a class="page-link" href="/notice/list/${pt.curpage+1}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&gt;</a></li>


					<li class="page-item ${pt.curpage < pt.totalPageNum? '': 'disabled' }"><a class="page-link" href="/notice/list/${pt.totalPageNum}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&raquo;</a></li>
			</ul>
		</nav>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		$("form").on("click", "#search_submit", function(event) {
			event.preventDefault();
			
			let criteria = $("select[name='criteria']").val();
			let keyword = $("input[name='keyword']").val();
			
			if (keyword == null || keyword == "") {
				let uri = "/notice/list";
				
				$("form").attr("action", uri);
			}else{
				let uri = "/notice/list/"+criteria+"/"+keyword;
				
				$("form").attr("action", uri);
			}
			$("form").attr("method", "GET");
			$("form").submit();
		});
		
	});
	
</script>
</body>
</html>