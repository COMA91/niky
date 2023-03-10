<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<form target="_blank">
	<div class="input-group mb-3">
		<div class="input-group-prepend col-sm-2 text-center">
			<select class="custom-select" name="criteria">
				<option value="id">아이디</option>
			</select>
		</div>
		
		<input type="text" class="form-control col-sm-8"
			placeholder="검색어를 입력하세요." 
			aria-label="검색어를 입력하세요." name="keyword">
			
		<div class="input-group-append">
			<button class="btn btn-info"
			id="search_submit">검색</button>
		</div>
	</div>
</form>

