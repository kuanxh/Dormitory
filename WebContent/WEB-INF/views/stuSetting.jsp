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
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>学生信息设置</title>
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
	
	
	<!-- PAGE CONTENT BEGINS -->

	<div class="clearfix">
		<div class="pull-left alert alert-success no-margin">
			<button type="button" class="close" data-dismiss="alert">
				<i class="icon-remove"></i>
			</button>

			<i class="icon-umbrella bigger-120 blue"></i> Click on the image
			below or on profile fields to edit them ...
		</div>

		<div class="pull-right">
			<span class="green middle bolder">Choose profile: &nbsp;</span>

			<div class="btn-toolbar inline middle no-margin">
				<div data-toggle="buttons" class="btn-group no-margin">
					<label class="btn btn-sm btn-yellow active"> <span
						class="bigger-110">1</span> <input type="radio" value="1" />
					</label> <label class="btn btn-sm btn-yellow"> <span
						class="bigger-110">2</span> <input type="radio" value="2" />
					</label> <label class="btn btn-sm btn-yellow"> <span
						class="bigger-110">3</span> <input type="radio" value="3" />
					</label>
				</div>
			</div>
		</div>
	</div>

	<div class="hr dotted"></div>

	<div>
		<div id="user-profile-3" class="user-profile row">
			<div class="col-sm-offset-1 col-sm-10">
				<div class="well well-sm">
					<button type="button" class="close" data-dismiss="alert">&times;</button>
					&nbsp;
					<div class="inline middle blue bigger-110">Your profile is
						70% complete</div>

					&nbsp; &nbsp; &nbsp;
					<div style="width: 200px;" data-percent="70%"
						class="inline middle no-margin progress progress-striped active">
						<div class="progress-bar progress-bar-success" style="width: 70%"></div>
					</div>
				</div>
				<!-- /well -->

				<div class="space"></div>

				<form class="form-horizontal">
					<div class="tabbable">
						<ul class="nav nav-tabs padding-16">
							<li class="active"><a data-toggle="tab" href="#edit-basic">
									<i class="green icon-edit bigger-125"></i> Basic Info
							</a></li>

							<li><a data-toggle="tab" href="#edit-settings"> <i
									class="purple icon-cog bigger-125"></i> Settings
							</a></li>

							<li><a data-toggle="tab" href="#edit-password"> <i
									class="blue icon-key bigger-125"></i> Password
							</a></li>
						</ul>

						<div class="tab-content profile-edit-tab-content">
							<div id="edit-basic" class="tab-pane in active">
								<h4 class="header blue bolder smaller">General</h4>

								<div class="row">
									<div class="col-xs-12 col-sm-4">
										<input type="file" />
									</div>

									<div class="vspace-xs"></div>

									<div class="col-xs-12 col-sm-8">
										<div class="form-group">
											<label class="col-sm-4 control-label no-padding-right"
												for="form-field-username">Username</label>

											<div class="col-sm-8">
												<input class="col-xs-12 col-sm-10" type="text"
													id="form-field-username" placeholder="Username"
													value="alexdoe" />
											</div>
										</div>

										<div class="space-4"></div>

										<div class="form-group">
											<label class="col-sm-4 control-label no-padding-right"
												for="form-field-first">Name</label>

											<div class="col-sm-8">
												<input class="input-small" type="text" id="form-field-first"
													placeholder="First Name" value="Alex" /> <input
													class="input-small" type="text" id="form-field-last"
													placeholder="Last Name" value="Doe" />
											</div>
										</div>
									</div>
								</div>

								<hr />
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-date">Birth Date</label>

									<div class="col-sm-9">
										<div class="input-medium">
											<div class="input-group">
												<input class="input-medium date-picker" id="form-field-date"
													type="text" data-date-format="dd-mm-yyyy"
													placeholder="dd-mm-yyyy" /> <span
													class="input-group-addon"> <i class="icon-calendar"></i>
												</span>
											</div>
										</div>
									</div>
								</div>

								<div class="space-4"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right">Gender</label>

									<div class="col-sm-9">
										<label class="inline"> <input name="form-field-radio"
											type="radio" class="ace" /> <span class="lbl"> Male</span>
										</label> &nbsp; &nbsp; &nbsp; <label class="inline"> <input
											name="form-field-radio" type="radio" class="ace" /> <span
											class="lbl"> Female</span>
										</label>
									</div>
								</div>

								<div class="space-4"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-comment">Comment</label>

									<div class="col-sm-9">
										<textarea id="form-field-comment"></textarea>
									</div>
								</div>

								<div class="space"></div>
								<h4 class="header blue bolder smaller">Contact</h4>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-email">Email</label>

									<div class="col-sm-9">
										<span class="input-icon input-icon-right"> <input
											type="email" id="form-field-email" value="alexdoe@gmail.com" />
											<i class="icon-envelope"></i>
										</span>
									</div>
								</div>

								<div class="space-4"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-website">Website</label>

									<div class="col-sm-9">
										<span class="input-icon input-icon-right"> <input
											type="url" id="form-field-website"
											value="http://www.alexdoe.com/" /> <i class="icon-globe"></i>
										</span>
									</div>
								</div>

								<div class="space-4"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-phone">Phone</label>

									<div class="col-sm-9">
										<span class="input-icon input-icon-right"> <input
											class="input-medium input-mask-phone" type="text"
											id="form-field-phone" /> <i
											class="icon-phone icon-flip-horizontal"></i>
										</span>
									</div>
								</div>

								<div class="space"></div>
								<h4 class="header blue bolder smaller">Social</h4>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-facebook">Facebook</label>

									<div class="col-sm-9">
										<span class="input-icon"> <input type="text"
											value="facebook_alexdoe" id="form-field-facebook" /> <i
											class="icon-facebook blue"></i>
										</span>
									</div>
								</div>

								<div class="space-4"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-twitter">Twitter</label>

									<div class="col-sm-9">
										<span class="input-icon"> <input type="text"
											value="twitter_alexdoe" id="form-field-twitter" /> <i
											class="icon-twitter light-blue"></i>
										</span>
									</div>
								</div>

								<div class="space-4"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-gplus">Google+</label>

									<div class="col-sm-9">
										<span class="input-icon"> <input type="text"
											value="google_alexdoe" id="form-field-gplus" /> <i
											class="icon-google-plus red"></i>
										</span>
									</div>
								</div>
							</div>

							<div id="edit-settings" class="tab-pane">
								<div class="space-10"></div>

								<div>
									<label class="inline"> <input type="checkbox"
										name="form-field-checkbox" class="ace" /> <span class="lbl">
											Make my profile public</span>
									</label>
								</div>

								<div class="space-8"></div>

								<div>
									<label class="inline"> <input type="checkbox"
										name="form-field-checkbox" class="ace" /> <span class="lbl">
											Email me new updates</span>
									</label>
								</div>

								<div class="space-8"></div>

								<div>
									<label class="inline"> <input type="checkbox"
										name="form-field-checkbox" class="ace" /> <span class="lbl">
											Keep a history of my conversations</span>
									</label> <label class="inline"> <span class="space-2 block"></span>

										for <input type="text" class="input-mini" maxlength="3" />
										days
									</label>
								</div>
							</div>

							<div id="edit-password" class="tab-pane">
								<div class="space-10"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-pass1">New Password</label>

									<div class="col-sm-9">
										<input type="password" id="form-field-pass1" />
									</div>
								</div>

								<div class="space-4"></div>

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-pass2">Confirm Password</label>

									<div class="col-sm-9">
										<input type="password" id="form-field-pass2" />
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="clearfix form-actions">
						<div class="col-md-offset-3 col-md-9">
							<button class="btn btn-info" type="button">
								<i class="icon-ok bigger-110"></i> Save
							</button>

							&nbsp; &nbsp;
							<button class="btn" type="reset">
								<i class="icon-undo bigger-110"></i> Reset
							</button>
						</div>
					</div>
				</form>
			</div>
			<!-- /span -->
		</div>
		<!-- /user-profile -->
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