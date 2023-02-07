<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>${empty pt.criteria? '회원정보 목록': '회원정보 검색 결과'}</title>
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
			<br>${empty pt.criteria? '회원정보 목록': '회원정보 검색 목록 '}
		</h1>
	</div>	
	
	<table class="table">
	  <thead class="thead-dark">
	    <tr>
	      <th scope="col" class="text-center">가입일자</th>
	      <th scope="col" class="text-center">아이디</th>
	      <th scope="col" class="text-center">이름</th>
	    </tr>
	  </thead>
	  <tbody>
		<c:forEach items="${list}" var="cDto">
	    <tr>
	      <td class="text-center">${cDto.joiningdate}</td>
	      <td class="text-center"><a href="/customer/read/${cDto.id}">${cDto.id}</a></td>
	      <td class="text-center">${cDto.name}</td>
	    </tr>
		</c:forEach>
		
		
	  </tbody>
	</table>
	<jsp:include page="part_search.jsp"/>
		<nav aria-label="Page navigation example">
			<ul class="pagination justify-content-center">
					<li class="page-item ${pt.curpage > 1? '': 'disabled' }"><a class="page-link" href="/customer/list/1${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&laquo;</a></li>

					<li class="page-item ${pt.curpage > 1? '': 'disabled' }"><a class="page-link" href="/customer/list/${pt.curpage-1}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&lt;</a></li>

					<c:forEach begin="${pt.beginPageNum}" end="${pt.finishPageNum}" var="i">
						<li class="page-item ${pt.curpage != i?'':'active'}">
							<a class="page-link" href="/customer/list/${i}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">${i}</a></li>
					</c:forEach>

					<li class="page-item ${pt.curpage < pt.totalPageNum? '': 'disabled' }"><a class="page-link" href="/customer/list/${pt.curpage+1}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&gt;</a></li>


					<li class="page-item ${pt.curpage < pt.totalPageNum? '': 'disabled' }"><a class="page-link" href="/customer/list/${pt.totalPageNum}${empty pt.criteria?'': '/'}${pt.criteria}${empty pt.keyword?'': '/'}${pt.keyword}">&raquo;</a></li>
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
				let uri = "/customer/list";
				
				$("form").attr("action", uri);
			}else{
				let uri = "/customer/list/"+criteria+"/"+keyword;
				
				$("form").attr("action", uri);
			}
			$("form").attr("method", "GET");
			$("form").submit();
		});
		
	});
	
</script>
</body>
</html>