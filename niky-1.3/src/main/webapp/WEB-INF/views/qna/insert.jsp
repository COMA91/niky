<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Power mall-Sign Up </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="/resources/js/templateform.js"></script>
</head>
<body>
<jsp:include page="../part_header.jsp"></jsp:include>

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

</style>
</head>
<body>
      <div class="container">
      
        <form>
           <div class="form-group row">
             <label for="id">작성자</label>
                  <input class="form-control" value="${login.id}" id="id" name="id" required readonly>             
           </div>
           
           <div class="form-group row">
             <label for="pw">비밀번호</label>
                  <input type="password" class="form-control" id="pw" name="pw" required>             
           </div>
           
           <div class="form-group row">
             <label for="title">제목</label>
                  <input class="form-control" id="title" name="title" required>
           </div>
           
           <div class="form-group row">
                 <label for="content">내용</label>
                  <textarea rows="10" id="content" name="content" class="form-control" required></textarea>
           </div>
         </form>    
        
         
         
         
         
         
		<div class="form-group row" id="qna_submit">
			<button type="submit" class="btn btn-primary boardsubmit" style="float : right;" id="qna_insert_submit">등록</button>
			<button type="submit" class="btn btn-primary boardsubmit" style="float : right;" id="qna_exit_submit">취소</button>
         
		</div>
         
      </div>
      
      <script type="text/javascript">
         $(document).ready(function() {
         
            $("#qna_submit").on("click","#qna_exit_submit", function() {
				location.assign("/qna/list/${login.id}");
			});
            
            $("#qna_submit").on("click","#qna_insert_submit",function() {
               
            	let id = $("#id").val();
               
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
               
               let content = $("#content").val();
               if(content == ""){
                  $("#content").focus();
                  return false;
               }
               
               $.ajax({
                  url : "/qna/insert",
                  type : "post",
                  data : {
                	  "id" : id,
                	  "pw" : pw,
                	  "title" : title,
                	  "content" : content
                  },
                  dataType : "text",
                  success : function(result) {
                	  if (result > 0) {
                	location.assign("/qna/list/${login.id}");				
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