<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form target="_blank">
	<div class="input-group mb-3">
		<div class="input-group-prepend col-sm-2">
			<select class="custom-select" name="price">
				<option value="10000">1만원 미만</option>
				<option value="30000">3만원 미만</option>
				<option value="50000">5만원 미만</option>
				<option value="80000">8만원 미만</option>
				<option value="100000">10만원 미만</option>
				<option value="999999999999999999999">10만원 이상</option>
			</select>
		</div>
	
		<div class="input-group-prepend col-sm-2">
			<select class="custom-select" name="cartegory">
				<option value="top">상의</option>
				<option value="bottom">하의</option>
				<option value="underwear">속옷</option>
				<option value="shoes">신발</option>
				<option value="outfit">외투</option>
				<option value="etc">기타</option>
			</select>
		</div>
		
		<input type="text" class="form-control" aria-label="검색 키워드"
			aria-describedby="button-addon2" name="keyword">
			
		<div class="input-group-append">
			<button class="btn btn-outline-secondary" type="button"
				id="search_submit">검색</button>
		</div>
	</div>
</form>