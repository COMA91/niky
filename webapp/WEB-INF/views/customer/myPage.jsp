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
				${cDto.id} 
			</h1>	
				<a href="/customer/update/${dto.id}">회원정보수정</a><br>
				point<br>
				${cDto.point}
			
		</div>


		<div class="ui-tab-cont" data-tab="Mycart">
			<div class="ui-cont is-active" id="cartDelivery">
				<table class="n-table table-col">
					<colgroup>
						<col style="width: 3.62%">
						<col style="width: *">
						<col style="width: 9.5%">
						<col style="width: 12%">
						<col style="width: 9.5%">
						<col style="width: 17.3%">
						<col style="width: 12%">
					</colgroup>
					<thead>
						<tr>
							<th scope="col"><input type="checkbox"
								class="n-check check-only chk_cart_all"
								id="myCheckAll_cartDelivery"> <label
								for="myCheckAll_cartDelivery">전체 선택</label></th>
							<th scope="col">상품정보</th>
							<th scope="col">상품금액</th>
							<th scope="col">수량</th>
							<th scope="col">주문금액</th>
							<th scope="col">배송 형태/배송비</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>

				<p class="n-table-none">
					<span>장바구니에 담긴 상품이 없습니다.</span>
				</p>

			</div>
			<div class="ui-cont" id="cartPickup">
				<table class="n-table table-col">
					<colgroup>
						<col style="width: 3.62%">
						<col style="width: *">
						<col style="width: 9.5%">
						<col style="width: 12%">
						<col style="width: 9.5%">
						<col style="width: 12%">
					</colgroup>
					<thead>
						<tr>
							<th scope="col"><input type="checkbox"
								class="n-check check-only chk_cart_all"
								id="myCheckAll_cartPickup"> <label
								for="myCheckAll_cartPickup">전체 선택</label></th>
							<th scope="col">상품정보</th>
							<th scope="col">상품금액</th>
							<th scope="col">수량</th>
							<th scope="col">주문금액</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>

				<p class="n-table-none">
					<span>장바구니에 담긴 상품이 없습니다.</span>
				</p>

			</div>
		</div></body>
</html>