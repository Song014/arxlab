<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>(주)에이알엑스랩</title>
<meta charset="UTF-8" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
	<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	border: 0.4em inset black;
}

#wrapper {
	margin: 0 auto;
}

.gnbContent{
	float: none; margin: 0 auto;
}
</style>

	<div id="wrapper">
		<header>
			<div class="wrap_haeder">
				<nav id= "gnbContent">
					<ul class="list_gnb nav nav-pills ">
						<li><a href="/admin" class="link_menu">홈</a>
							<ul class="list_2 nav nav-pills">
								<li><a href="#">히스토리</a></li>
								<li><a href="#">파트너</a></li>
							</ul></li>
						<li><a href="#" class="link_menu">사업역량</a>
							<ul class="list_2 nav nav-pills">
								<li><a href="#">수행사업</a>
									<ul class="list_3 nav ">
										<li><a href="#">용역</a></li>
									</ul></li>
								<li><a href="#">보유장비</a>
									<ul class="list_3 nav ">
										<li><a href="#">드론</a>
											<ul class="list_4 nav ">
												<li><a href="#">고정익 드론</a></li>
												<li><a href="#">회전익 드론</a></li>
												<li><a href="#">특수 드론</a></li>
											</ul></li>
										<li><a href="#">페이로드</a></li>
									</ul></li>
								<li><a href="#">조직구성</a></li>
							</ul></li>
						<li><a href="#" class="link_menu">제품과 서비스</a></li>
						<li><a href="#" class="link_menu">뉴스</a>
							<ul class="list_2 nav ">
								<li><a href="#">보도자료</a></li>
								<li><a href="#">홍보자료</a></li>
							</ul></li>
					</ul>
				</nav>
			</div>
		</header>
	</div>

</body>
</html>