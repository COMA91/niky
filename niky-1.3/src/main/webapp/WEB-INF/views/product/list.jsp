<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<ul class="list-group list-group-horizontal">
		<li class="list-group-item">An item</li>
		<li class="list-group-item">A second item</li>
		<li class="list-group-item">A third item</li>
	</ul>
	
	<jsp:include page="../part_paging.jsp"/>
	
	<jsp:include page="../part_search.jsp"/>
	
	<script type="text/javascript">
		$("document").ready(function() {
			let minprice = 0;
			let maxprice = 0;
			
			$("form").on("change", "#input_left", function(event) {
				minprice = $("input[name='input_left']").val();
			});
			
			$("form").on("change", "#input_right", function(event) {
				maxprice = $("input[name='input_right']").val();
			});
	
			$("form").on("click", "#search_submit", function(event) {
				event.preventDefault();
				let sex = $("select[name='sex']").val();
				let category = $("select[name='category']").val();
				let keyword = $("input[name='keyword']").val();
				
				let uri = "/product/list${empty sex?'':'/'}"+sex+"/"+minprice+"/"+maxprice+"${empty category?'':'/'}"+category+"${empty keyword?'':'/'}"+keyword;
				
				$("form").attr("action", uri);
				$("form").attr("method", "post");
				
				$("form").submit();
			});
		});
	</script>
</body>
</html>