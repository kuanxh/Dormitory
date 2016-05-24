<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="navbar navbar-default" id="navbar">
		<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="#" class="navbar-brand"> <small> <i
						class="icon-leaf"></i> 高校宿舍管理系统
				</small>
				</a>
				<!-- /.brand -->
			</div>
			<!-- /.navbar-header -->

			<div class="navbar-header pull-right" role="navigation">
				<ul class="nav ace-nav">

					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <img class="nav-user-photo"
							src="assets/avatars/user.jpg" alt="Jason's Photo" /> <span
							class="user-info"> <small>Welcome,</small> ${name }
						</span> <i class="icon-caret-down"></i>
					</a>

						<ul
							class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="adminSetting"> <i class="icon-cog"></i> 个人设置
							</a></li>

							<li><a href="adminProfile"> <i class="icon-user"></i> 个人信息
							</a></li>

							<li class="divider"></li>

							<li><a href="login"> <i class="icon-off"></i> 注销
							</a></li>
						</ul></li>
				</ul>
				<!-- /.ace-nav -->
			</div>
			<!-- /.navbar-header -->
		</div>
		<!-- /.container -->
	</div>

	<div class="main-container" id="main-container">
		<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#"> <span
				class="menu-text"></span>
			</a>

			<div class="sidebar" id="sidebar">
				<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-success">
							<i class="icon-signal"></i>
						</button>

						<button class="btn btn-info">
							<i class="icon-pencil"></i>
						</button>

						<button class="btn btn-warning">
							<i class="icon-group"></i>
						</button>

						<button class="btn btn-danger">
							<i class="icon-cogs"></i>
						</button>
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span> <span class="btn btn-info"></span>

						<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
					</div>
				</div>
				<!-- #sidebar-shortcuts -->

				<ul class="nav nav-list">
					<li class="active"><a href="adminProfile"> <i
							class="icon-dashboard"></i> <span class="menu-text">用户信息</span>
					</a></li>

					
						<li>
							<a href="adminCalendar">
								<i class="icon-calendar"></i>
								<span class="menu-text">
									日历
									<span class="badge badge-transparent tooltip-error" title="2&nbsp;Important&nbsp;Events">
										<i class="icon-warning-sign red bigger-130"></i>
									</span>
								</span>
							</a>
						</li>
					<li><a href="adminStuInfoGL" class="dropdown-toggle"> <i
							class="icon-desktop"></i> <span class="menu-text"> 学生信息管理
						</span> <b class="arrow icon-angle-down"></b>
					</a>
						<ul class="submenu">
							<li><a href="adminStuInfoGL"> <i
									class="icon-double-angle-right"></i> 学生信息管理
							</a></li>

							<li><a href="adminStuInfoLR"> <i
									class="icon-double-angle-right"></i> 学生信息录入
							</a></li>
						
						</ul></li>

					<li><a href="#" class="dropdown-toggle"> <i
							class="icon-list"></i> <span class="menu-text"> 宿舍信息管理 </span> <b
							class="arrow icon-angle-down"></b>
					</a>
						<ul class="submenu">
							<li><a href="adminDorInfoGL"> <i
									class="icon-double-angle-right"></i> 宿舍信息管理
							</a></li>
							
							<li><a href="adminDorInfoTJ"> <i
									class="icon-double-angle-right"></i> 宿舍信息添加
							</a></li>
						</ul></li>

					<li><a href="#" class="dropdown-toggle"> <i
							class="icon-edit"></i> <span class="menu-text"> 来访信息管理 </span> <b
							class="arrow icon-angle-down"></b>
					</a>
						<ul class="submenu">
							<li><a href="adminVisitorInfoGL"> <i
									class="icon-double-angle-right"></i> 来访信息管理
							</a></li>

							<li><a href="adminVisitorInfoDJ"> <i
									class="icon-double-angle-right"></i> 来访信息登记
							</a></li>

						</ul></li>
					<li><a href="#" class="dropdown-toggle"> <i
							class="icon-edit"></i> <span class="menu-text"> 卫生检查信息 </span> <b
							class="arrow icon-angle-down"></b>
					</a>
						<ul class="submenu">
							<li><a href="adminSanitationGL"> <i
									class="icon-double-angle-right"></i> 检查信息管理
							</a></li>

							<li><a href="adminSanitationLR"> <i
									class="icon-double-angle-right"></i> 检查信息添加
							</a></li>
						</ul></li>

					<li><a href="#" class="dropdown-toggle"> <i
							class="icon-edit"></i> <span class="menu-text"> 信息审核管理 </span> <b
							class="arrow icon-angle-down"></b>
					</a>
						<ul class="submenu">
							<li><a href="adminRepairInfo"> <i
									class="icon-double-angle-right"></i> 宿舍报修信息
							</a></li>
						</ul></li>
				</ul>
				<!-- /.nav-list -->

				<div class="sidebar-collapse" id="sidebar-collapse">
					<i class="icon-double-angle-left"
						data-icon1="icon-double-angle-left"
						data-icon2="icon-double-angle-right"></i>
				</div>

				<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
			</div>

			<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

					<ul class="breadcrumb">
						<li><i class="icon-home home-icon"></i> <a href="#">${titleUrl.home }</a>
						</li>

						<li><a href="#">${titleUrl.two }</a></li>
						<li class="active">${titleUrl.three }</li>
					</ul>
					<!-- .breadcrumb -->

					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon"> <input type="text"
								placeholder="Search ..." class="nav-search-input"
								id="nav-search-input" autocomplete="off" /> <i
								class="icon-search nav-search-icon"></i>
							</span>
						</form>
					</div>
					<!-- #nav-search -->
				</div>

				<div class="page-content">
					<div class="page-header">
						<h1>
							${titleUrl.four }
						</h1>
					</div>
					<!-- /.page-header -->

					<div class="row">
						<div class="col-xs-12">