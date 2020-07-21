<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>나만의 레시피</title>
<!-- CSS -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!-- customize css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
<!-- 글씨체 관련 -->
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<!-- 아이콘 관련 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome-4.7.0/css/font-awesome.min.css">
<!-- JS -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<%-- jsp:include(header) --%>
	<jsp:include page="../include/header.jsp">
		<jsp:param value="myrecipe" name="thisPage"/>
	</jsp:include>
	
	<!-- Page Content -->
	<div class="container">
	
	  <!-- Jumbotron Header -->
	  <header class="jumbotron my-4">
	    <h1 class="display-3">나만의 레시피!</h1>
	    <p class="lead">.</p>
	    <a href="#" class="btn btn-primary btn-lg">Call to action!</a>
	  </header>
	
	  <!-- Page Features -->
	  <div class="row text-center">
	
	    <div class="col-lg-6 col-md-6 mb-6">
	      <div class="card h-100">
	        <img class="card-img-top" src="../img/testimg.jpg" alt="">
	        <div class="card-body">
	          <h4 class="card-title">알토란 레시피</h4>
	          <p class="card-text">밥도둑 반찬 고추장 달걀조림 만들기! </p>
	        </div>
	        <div class="card-footer">
	          <a href="sub_myrecipe.jsp" class="btn btn-primary">레시피 보러가기!</a>
	        </div>
	      </div>
	    </div>
	
	    <div class="col-lg-3 col-md-6 mb-4">
	      <div class="card h-100">
	        <img class="card-img-top" src="http://placehold.it/500x325" alt="">
	        <div class="card-body">
	          <h4 class="card-title">Card title</h4>
	          <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo magni sapiente, tempore debitis beatae culpa natus architecto.</p>
	        </div>
	        <div class="card-footer">
	          <a href="#" class="btn btn-primary">Find Out More!</a>
	        </div>
	      </div>
	    </div>
	
	    <div class="col-lg-3 col-md-6 mb-4">
	      <div class="card h-100">
	        <img class="card-img-top" src="http://placehold.it/500x325" alt="">
	        <div class="card-body">
	          <h4 class="card-title">Card title</h4>
	          <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
	        </div>
	        <div class="card-footer">
	          <a href="#" class="btn btn-primary">Find Out More!</a>
	        </div>
	      </div>
	    </div>
	
	    <div class="col-lg-3 col-md-6 mb-4">
	      <div class="card h-100">
	        <img class="card-img-top" src="http://placehold.it/500x325" alt="">
	        <div class="card-body">
	          <h4 class="card-title">Card title</h4>
	          <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo magni sapiente, tempore debitis beatae culpa natus architecto.</p>
	        </div>
	        <div class="card-footer">
	          <a href="#" class="btn btn-primary" >Find Out More!</a>
	        </div>
	      </div>
	    </div>
	    
	    <div class="col-lg-3 col-md-6 mb-4">
	      <div class="card h-100">
	        <img class="card-img-top" src="http://placehold.it/500x325" alt="">
	        <div class="card-body">
	          <h4 class="card-title">Card title</h4>
	          <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
	        </div>
	        <div class="card-footer">
	          <a href="#" class="btn btn-primary">Find Out More!</a>
	        </div>
	      </div>
	    </div>
	    
	    <div class="col-lg-3 col-md-6 mb-4">
	      <div class="card h-100">
	        <img class="card-img-top" src="http://placehold.it/500x325" alt="">
	        <div class="card-body">
	          <h4 class="card-title">Card title</h4>
	          <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
	        </div>
	        <div class="card-footer">
	          <a href="#" class="btn btn-primary">Find Out More!</a>
	        </div>
	      </div>
	    </div>
	    
	    <div class="col-lg-3 col-md-6 mb-4">
	      <div class="card h-100">
	        <img class="card-img-top" src="http://placehold.it/500x325" alt="">
	        <div class="card-body">
	          <h4 class="card-title">Card title</h4>
	          <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
	        </div>
	        <div class="card-footer">
	          <a href="#" class="btn btn-light-primary">Find Out More!</a>
	        </div>
	      </div>
	    </div>
	    
	    <div class="col-lg-3 col-md-6 mb-4">
	      <div class="card h-100">
	        <img class="card-img-top" src="http://placehold.it/500x325" alt="">
	        <div class="card-body">
	          <h4 class="card-title">Card title</h4>
	          <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
	        </div>
	        <div class="card-footer">
	          <a href="#" class="btn btn-primary">Find Out More!</a>
	        </div>
	      </div>
	    </div>
	
	  </div>
	  <!-- /.row -->
	
	</div>
	<!-- /.container -->
	
	<!-- footer --> 
		<%-- jsp:include(footer) --%>
		<jsp:include page="../include/footer.jsp">
			<jsp:param value="sub_myrecipe" name="thisPage"/>
		</jsp:include>
	<!-- footer end--> 

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>