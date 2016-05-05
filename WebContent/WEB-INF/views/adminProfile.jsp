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

<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>用户信息</title>

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


	<div class="clearfix">
		<div class="pull-left alert alert-success no-margin">
			<button type="button" class="close" data-dismiss="alert">
				<i class="icon-remove"></i>
			</button>

			<i class="icon-umbrella bigger-120 blue"></i>
			Click on the image below or on profile fields to edit them ...
		</div>
	</div>

	<div class="hr dotted"></div>

	<div>
	<div id="user-profile-2" class="user-profile">
		<div class="tabbable">
			<ul class="nav nav-tabs padding-18">
				<li class="active">
					<a data-toggle="tab" href="#home">
						<i class="green icon-user bigger-120"></i>
						Profile
					</a>
				</li>
			</ul>

			<div class="tab-content no-border padding-24">
				<div id="home" class="tab-pane in active">
					<div class="row">
						<div class="col-xs-12 col-sm-3 center">
							<span class="profile-picture">
								<img class="editable img-responsive" alt="Alex's Avatar" id="avatar2" src="assets/avatars/profile-pic.jpg" />
							</span>

							<div class="space space-4"></div>

							<a href="#" class="btn btn-sm btn-block btn-success">
								<i class="icon-plus-sign bigger-120"></i>
								<span class="bigger-110">Add as a friend</span>
							</a>

							<a href="#" class="btn btn-sm btn-block btn-primary">
								<i class="icon-envelope-alt bigger-110"></i>
								<span class="bigger-110">Send a message</span>
							</a>
						</div><!-- /span -->

						<div class="col-xs-12 col-sm-9">
							<h4 class="blue">
								<span class="middle">${admin.name }</span>
							</h4>

							<div class="profile-user-info">
								<div class="profile-info-row">
									<div class="profile-info-name"> 姓名 </div>

									<div class="profile-info-value">
										<span>${admin.name }</span>
									</div>
								</div>

								<div class="profile-info-row">
									<div class="profile-info-name"> 管理楼层 </div>
									<div class="profile-info-value">
										<i class="icon-map-marker light-orange bigger-110"></i>
										<span>${admin.gllc }</span>
									</div>
								</div>

								<div class="profile-info-row">
									<div class="profile-info-name"> 年龄 </div>

									<div class="profile-info-value">
										<span>${admin.age }</span>
									</div>
								</div>

								<div class="profile-info-row">
									<div class="profile-info-name"> 生日 </div>

									<div class="profile-info-value">
										<span>${admin.birth }</span>
									</div>
								</div>

								<div class="profile-info-row">
									<div class="profile-info-name"> 手机号 </div>

									<div class="profile-info-value">
										<span>${admin.phone }</span>
									</div>
								</div>
								<div class="profile-info-row">
									<div class="profile-info-name"> 工号 </div>

									<div class="profile-info-value">
										<span>${admin.admnumber }</span>
									</div>
								</div>
							</div>

							<div class="hr hr-8 dotted"></div>

							
						</div><!-- /span -->
					</div><!-- /row-fluid -->

					<div class="space-20"></div>

				</div><!-- #home -->

			</div>
		</div>
	</div>
	</div>


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