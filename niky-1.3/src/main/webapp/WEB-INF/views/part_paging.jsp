<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav aria-label="Page navigation example">
	<ul class="pagination">
		<li class="page-item ${pt.curpage > 1 ? '':'disabled'}">
			<a class="page-link" href="#" aria-label="Previous">
				<span aria-hidden="true">&laquo;</span>
			</a>
		</li>
	
		<li class="page-item ${pt.curpage > 1 ? '':'disabled'}">
			<a class="page-link" href="/board/list/${pt.curpage-1}/${pt.criteria}/${pt.keyword}" aria-label="Previous"><span aria-hidden="true">&lt;</span></a>
		</li>
		
		<c:forEach begin="${pt.beginPageNum}" end="${pt.finishPageNum}" var="i">
			<li class="page-item ${pt.curpage != i ? '':'active'}">
				<a class="page-link" href="/board/list/${i}${empty pt.criteria ? '':'/'}${pt.criteria}${empty pt.keyword ? '':'/'}${pt.keyword}">${i}</a>
			</li>
		</c:forEach>
		
		<li class="page-item ${pt.curpage < pt.totalPageNum ? '':'disabled'}">
			<a class="page-link" href="/board/list/${pt.curpage+1}/${pt.criteria}/${pt.keyword}" aria-label="Next">
				<span aria-hidden="true">&gt;</span>
			</a>
		</li>
	</ul>
</nav>