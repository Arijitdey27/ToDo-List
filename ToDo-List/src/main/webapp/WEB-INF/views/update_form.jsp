<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
	<div class="container task">
		<div class="row">
		 	<div class="col-md-6 offset-md-3">
		 		<h1 class="text-center">Update Task</h1>
				<form action="${pageContext.request.contextPath}/newForm" method="post">
				  <input type="hidden" name="id" value="${task.id}">
				  <div class="form-group">
				    <label for="exampleInputEmail1">Title</label>
				    <input type="text" class="form-control" name="title"
				    id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter title Here!"
				    value="${task.title}" required>
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1">Completion Data</label>
				    <input type="date" class="form-control" id="dateInput"
				    	name="dueDate" value="${task.dueDate}" required onclick="setMinDate()">
				  </div>
				   <div class="form-group">
				    <label for="exampleInputEmail1">Task Description</label>
				    <textarea class="form-control"  
				    	name="description" placeholder="Write description here!" required>${task.description}
				    </textarea>
				  </div>
				  <div  class="form-btn text-center">
				  	<a href="${pageContext.request.contextPath}/" class="btn btn-danger m-4">Back</a>
				  	
				  	<button type="submit" class="btn btn-success">Update</button>
				  </div>
				 
				</form>
  			</div>
		 </div>	
	</div>
</body>
</html>