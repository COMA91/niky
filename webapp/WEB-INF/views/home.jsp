<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.101.0">
<title>Nikey mall</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.6/examples/blog/">



<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">



<!-- Favicons -->
<link rel="apple-touch-icon"
	href="https://getbootstrap.com/docs/4.6/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon"
	href="https://getbootstrap.com/docs/4.6/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon"
	href="https://getbootstrap.com/docs/4.6/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest"
	href="https://getbootstrap.com/docs/4.6/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="https://getbootstrap.com/docs/4.6/assets/img/favicons/safari-pinned-tab.svg"
	color="#563d7c">
<link rel="icon"
	href=https://getbootstrap.com/docs/4.6/assets/img/favicons/favicon.ico">
<meta name="msapplication-config"
	content="https://getbootstrap.com/docs/4.6/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>

<!-- Custom styles for this template -->
<link
	href="https://fonts.googleapis.com/css?family=Playfair&#43;Display:700,900"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="blog.css" rel="stylesheet">
</head>
<body>

	<div class="container">
		
		<header class="blog-header py-3">
	<div class="row flex-nowrap justify-content-between align-items-center">
		<div class="col-4 pt-1">
			<a class="text-muted" href="#">팀프로젝트</a>
		</div>
		<div class="col-4 text-center">
			<a class="blog-header-logo text-dark" href="/">PowerMall</a>
		</div>
		<div class="col-4 d-flex justify-content-end align-items-center">
			<a class="text-muted" href="#" aria-label="Search"> <svg
					xmlns="http://www.w3.org/2000/svg" width="20" height="20"
					fill="none" stroke="currentColor" stroke-linecap="round"
					stroke-linejoin="round" stroke-width="2" class="mx-3" role="img"
					viewBox="0 0 24 24" focusable="false">
							<title>Search</title><circle cx="10.5" cy="10.5" r="7.5" />
							<path d="M21 21l-5.2-5.2" /></svg>
			</a>
			<div class="container">
				<header style="height: 30px;">
					<div class="float-right">
						<c:choose>
							<c:when test="${empty login}">
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/login">로그인</a>
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/insert">회원가입</a>
							</c:when>
							<c:otherwise>
							${login.id}
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/read/${login.id}">회원정보</a>
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/logout">로그아웃</a>
							</c:otherwise>
						</c:choose>
					</div>
				</header>
			</div>
		</div>
	</div>
</header>
					
		<div class="nav-scroller py-1 mb-2">
			<nav class="nav d-flex justify-content-between">
				<a class="p-2 text-muted" href="#">woman</a> <a
					class="p-2 text-muted" href="#">man</a> <a class="p-2 text-muted"
					href="#">shoes</a> <a class="p-2 text-muted" href="#">outdoor</a> <a
					class="p-2 text-muted" href="#">shirt</a> <a class="p-2 text-muted"
					href="#">pants</a> <a class="p-2 text-muted" href="#">new style</a>
				<a class="p-2 text-muted" href="#">old style</a> <a
					class="p-2 text-muted" href="#">order</a> <a class="p-2 text-muted"
					href="#">QnA</a> <a class="p-2 text-muted" href="#">board</a> <a
					class="p-2 text-muted" href="#">my page</a>


			</nav>
		</div>
		<div class="jumbotron p-4 p-md-5 text-white rounded bg-dark">
			<div class="col-md-6 px-0">
				<h1 class="display-4 font-italic">Welcome PowerMall</h1>
				<p class="lead my-3">new generation</p>
				<p class="lead mb-0">
					<a href="#" class="text-white font-weight-bold">원하는 모든 옷이 한곳에</a>
				</p>
			</div>
		</div>
		<div class="row mb-2">
			<div class="col-md-6">
				<div
					class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
					<div class="col p-4 d-flex flex-column position-static">
						<strong class="d-inline-block mb-2 text-primary">new
							style</strong>
						<h3 class="mb-0">신상품</h3>
						<div class="mb-1 text-muted">5월 상품</div>
						<p class="card-text mb-auto">이번 봄상품은 화사한 봄날에 맞게 뛰어난 색채감과 라이트한
							느낌을 주는 아우터입니다.</p>
						<a href="#" class="stretched-link">상품보러가기</a>
					</div>
					<div class="col-auto d-none d-lg-block">
						<svg class="bd-placeholder-img" width="200" height="250"
							xmlns="http://www.w3.org/2000/svg" role="img"
							aria-label="Placeholder: Thumbnail"
							preserveAspectRatio="xMidYMid slice" focusable="false">
							<title>Placeholder</title><rect width="100%" height="100%"
								fill="#55595c" />
							<text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div
					class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
					<div class="col p-4 d-flex flex-column position-static">
						<strong class="d-inline-block mb-2 text-success">old
							style</strong>
						<h3 class="mb-0">이월상품</h3>
						<div class="mb-1 text-muted">4월 상품</div>
						<p class="mb-auto">철 지난 이월상품 세일품목으로 만나보세요!</p>
						<a href="#" class="stretched-link">상품보러 가기</a>
					</div>
					<div class="col-auto d-none d-lg-block">
						<svg class="bd-placeholder-img" width="200" height="250"
							xmlns="http://www.w3.org/2000/svg" role="img"
							aria-label="Placeholder: Thumbnail"
							preserveAspectRatio="xMidYMid slice" focusable="false">
							<title>Placeholder</title><rect width="100%" height="100%"
								fill="#55595c" />
							<text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer class="blog-footer text-center">
		<p>
			Blog template built for <a href="https://getbootstrap.com/">Bootstrap</a>
			by <a href="https://twitter.com/mdo">@mdo</a>.
		</p>
		<p>
			<a href="#">Back to top</a>
		</p>
	</footer>

</body>
</html>