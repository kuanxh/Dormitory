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
<title>学生日历</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- basic styles -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
<!--[if IE 7]>
<link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
<![endif]-->
<!-- page specific plugin styles -->
<link rel="stylesheet" href="assets/css/fullcalendar.css" />
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
	<%@ include file="stuHead.jsp"%> 
	
	<!-- PAGE CONTENT BEGINS -->
	<div class="row">
		<div class="col-sm-9">
			<div class="space"></div>

			<div id="calendar"></div>
		</div>

		<div class="col-sm-3">
			<div class="widget-box transparent">
				<div class="widget-header">
					<h4>Draggable events</h4>
				</div>

				<div class="widget-body">
					<div class="widget-main no-padding">
						<div id="external-events">
							<div class="external-event label-grey" data-class="label-grey">
								<i class="icon-move"></i> My Event 1
							</div>

							<div class="external-event label-success"
								data-class="label-success">
								<i class="icon-move"></i> My Event 2
							</div>

							<div class="external-event label-danger"
								data-class="label-danger">
								<i class="icon-move"></i> My Event 3
							</div>

							<div class="external-event label-purple"
								data-class="label-purple">
								<i class="icon-move"></i> My Event 4
							</div>

							<div class="external-event label-yellow"
								data-class="label-yellow">
								<i class="icon-move"></i> My Event 5
							</div>

							<div class="external-event label-pink" data-class="label-pink">
								<i class="icon-move"></i> My Event 6
							</div>

							<div class="external-event label-info" data-class="label-info">
								<i class="icon-move"></i> My Event 7
							</div>

							<label> <input type="checkbox" class="ace ace-checkbox"
								id="drop-remove" /> <span class="lbl"> Remove after drop</span>
							</label>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- PAGE CONTENT ENDS -->
	
	<!-- footer部分 -->
	<%@ include file="stuFooter.jsp"%>
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
	<script src="assets/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
	<script src="assets/js/fullcalendar.min.js"></script>
	<script src="assets/js/bootbox.min.js"></script>
	<!-- ace scripts -->
	<script src="assets/js/ace-elements.min.js"></script>
	<script src="assets/js/ace.min.js"></script>
	<!-- inline scripts related to this page -->
	<script src="assets/js1/calendar.js"></script>
</body>
</html>