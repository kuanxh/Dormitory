<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>来访信息登记</title>
<!-- basic styles -->
	<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
	<!--[if IE 7]>
	<link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
	<![endif]-->
	<!-- page specific plugin styles -->
	<link rel="stylesheet" href="assets/css/jquery-ui-1.10.3.custom.min.css" />
	<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
	<link rel="stylesheet" href="assets/css/select2.css" />
	<link rel="stylesheet" href="assets/css/bootstrap-editable.css" />
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
	<!--[if lte IE 8]>
	  <script src="assets/js/excanvas.min.js"></script>
	<![endif]-->
	<script src="assets/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
	<script src="assets/js/jquery.gritter.min.js"></script>
	<script src="assets/js/bootbox.min.js"></script>
	<script src="assets/js/jquery.slimscroll.min.js"></script>
	<script src="assets/js/jquery.easy-pie-chart.min.js"></script>
	<script src="assets/js/jquery.hotkeys.min.js"></script>
	<script src="assets/js/bootstrap-wysiwyg.min.js"></script>
	<script src="assets/js/select2.min.js"></script>
	<script src="assets/js/date-time/bootstrap-datepicker.min.js"></script>
	<script src="assets/js/fuelux/fuelux.spinner.min.js"></script>
	<script src="assets/js/x-editable/bootstrap-editable.min.js"></script>
	<script src="assets/js/x-editable/ace-editable.min.js"></script>
	<script src="assets/js/jquery.maskedinput.min.js"></script>
	<!-- ace scripts -->
	<script src="assets/js/ace-elements.min.js"></script>
	<script src="assets/js/ace.min.js"></script>
	<!-- inline scripts related to this page -->
	<script src="assets/js1/profile.js"></script>
</body>
</html>