<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Power mall-Qna_list </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="/resources/js/templateform.js"></script>
</head>
<body>
<jsp:include page="../part_header.jsp"></jsp:include>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>


</head>
<body>


<div class="container">

		<img class="img-fluid mx-auto d-block mb-3"
			src="#"
			alt="">
		<h1 class="mb-1 text-center">QnA!</h1>
		<p class="fs-14 text-gray text-center mb-5"><br>${empty pt.criteria?'QnA-list' : 'search-list'}</p>
		
		
		
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col" class="text-center">Number</th>
	      <th scope="col" class="text-center">title</th>
	      <th scope="col" class="text-center">member</th>
	      <th scope="col" class="text-center">writedate</th>
	      <th scope="col" class="text-center">is answered?</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach items="${list}" var="dto">
	    <tr>
	    	<td class="text-center">${dto.bno}</td>
	    	<td><a href="/qna/read/${dto.bno}/${pt.curpage}${empty pt.criteria?'':'/'}${pt.criteria}${empty pt.keyword?'':'/'}${pt.keyword}">${dto.title}</a></td>
	    	<td class="text-center">${dto.cid}</td>
	    	<td class="text-center">${dto.writedate}</td>
	    	<td class="text-center">${dto.answer}</td>
	    </tr>
	  </c:forEach>
  	   </tbody>
  	   
	</table>
	<a href="/qna/insert/${login.id}" class="btn btn-primary my-3 text-right">write</a>
	
	<jsp:include page="../part_paging.jsp"/>

	
	
  </div>
 <script type="text/javascript">
   $(document).ready(function() {
      $("form").on("click", "#search_submit", function(event) {
         event.preventDefault();
         
         let criteria = $("select[name='criteria']").val();
         let keyword = $("input[name='keyword']").val();
         
         if (keyword == null || keyword == "") {
            let uri = "/qna/list";
            
            $("form").attr("action", uri);
         }else{
            let uri = "/qna/list/"+criteria+"/"+keyword;
            
            $("form").attr("action", uri);
         }
         $("form").attr("method", "POST");
         $("form").submit();
      });
      
   });
   
</script> 
  
  
  
  	

</body>
</html>