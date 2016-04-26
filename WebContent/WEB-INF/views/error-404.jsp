<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 这段代码的意思是获取当前项目的路径，如：http://localhost:8080/项目名称。 -->
<%    
    String path = request.getContextPath();    
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
    %>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>丢失页面</title>





<!-- basic styles -->

<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

<!-- page specific plugin styles -->

<!-- ace styles -->

<link rel="stylesheet" href="assets/css/ace.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />

<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->

<script src="assets/js/ace-extra.min.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
</head>
<body>
	<!-- Head部分 -->
	<%@ include file="adminHead.jsp"%>



	<!-- PAGE CONTENT BEGINS -->

	<div class="error-container">
		<div class="well">
			<h1 class="grey lighter smaller">
				<span class="blue bigger-125"> <i class="icon-sitemap"></i>
					404
				</span> Page Not Found
			</h1>

			<hr />
			<h3 class="lighter smaller">We looked everywhere but we couldn't
				find it!</h3>

			<div>
				<form class="form-search">
					<span class="input-icon align-middle"> <i
						class="icon-search"></i> <input type="text" class="search-query"
						placeholder="Give it a search..." />
					</span>
					<button class="btn btn-sm" onclick="return false;">Go!</button>
				</form>

				<div class="space"></div>
				<h4 class="smaller">Try one of the following:</h4>

				<ul class="list-unstyled spaced inline bigger-110 margin-15">
					<li><i class="icon-hand-right blue"></i> Re-check the url for
						typos</li>

					<li><i class="icon-hand-right blue"></i> Read the faq</li>

					<li><i class="icon-hand-right blue"></i> Tell us about it</li>
				</ul>
			</div>

			<hr />
			<div class="space"></div>

			<div class="center">
				<a href="#" class="btn btn-grey"> <i class="icon-arrow-left"></i>
					Go Back
				</a> <a href="#" class="btn btn-primary"> <i class="icon-dashboard"></i>
					Dashboard
				</a>
			</div>
		</div>
	</div>
	<!-- PAGE CONTENT ENDS -->










	<!-- footer部分 -->
	<%@ include file="adminFooter.jsp"%>

	<!-- basic scripts -->

	<!--[if !IE]> -->

	<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

	<!-- <![endif]-->

	<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

	<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/typeahead-bs2.min.js"></script>

	<!-- page specific plugin scripts -->

	<!-- ace scripts -->

	<script src="assets/js/ace-elements.min.js"></script>
	<script src="assets/js/ace.min.js"></script>

	<!-- inline scripts related to this page -->
</body>
</html>