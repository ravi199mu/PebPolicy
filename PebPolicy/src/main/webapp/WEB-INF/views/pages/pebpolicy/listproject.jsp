<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
        
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project List</title>
<spring:url value="/resources/js/jquery-3.4.1.min.js" var="jquery" />
<spring:url value="/resources/js/popper.min.js" var="popperJs" />
<%-- <spring:url value="/resources/DataTables/datatables.min.css" var="dataTableCss" />
<spring:url value="/resources/DataTables/datatables.min.js" var="dataTableJs" /> --%>
<spring:url value="/resources/js/bootstrap.min.js" var="mainJs" />
<spring:url value="/resources/css/sb-admin-2.min.css" var="mainCss" />
<spring:url value="/resources/css/all.css" var="fontAwesomeCss" />

<link href="${mainCss}" rel="stylesheet" />
<%-- <link href="${dataTableCss}" rel="stylesheet" /> --%>
<link href="${fontAwesomeCss}" rel="stylesheet" />
</head>
<body>

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.html">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div>
				<div class="sidebar-brand-text mx-3">
					ECGC-Peb Policy
				</div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item active"><a class="nav-link"
				href="index.html"> <i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span></a>
			</li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Interface</div>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapseTwo"
				aria-expanded="true" aria-controls="collapseTwo"> <i
					class="fas fa-fw fa-cog"></i> <span>Components</span>
			</a>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Custom Components:</h6>
						<a class="collapse-item" href="buttons.html">Buttons</a> <a
							class="collapse-item" href="cards.html">Cards</a>
					</div>
				</div></li>

			<!-- Nav Item - Utilities Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapseUtilities"
				aria-expanded="true" aria-controls="collapseUtilities"> <i
					class="fas fa-fw fa-wrench"></i> <span>UdataTableJstilities</span>
			</a>
				<div id="collapseUtilities" class="collapse"
					aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Custom Utilities:</h6>
						<a class="collapse-item" href="utilities-color.html">Colors</a> <a
							class="collapse-item" href="utilities-border.html">Borders</a> <a
							class="collapse-item" href="utilities-animation.html">Animations</a>
						<a class="collapse-item" href="utilities-other.html">Other</a>
					</div>
				</div></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Addons</div>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapsePages"
				aria-expanded="true" aria-controls="collapsePages"> <i
					class="fas fa-fw fa-folder"></i> <span>Pages</span>
			</a>
				<div id="collapsePages" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Login Screens:</h6>
						<a class="collapse-item" href="login.html">Login</a> <a
							class="collapse-item" href="register.html">Register</a> <a
							class="collapse-item" href="forgot-password.html">Forgot
							Password</a>
						<div class="collapse-divider"></div>
						<h6 class="collapse-header">Other Pages:</h6>
						<a class="collapse-item" href="404.html">404 Page</a> <a
							class="collapse-item" href="blank.html">Blank Page</a>
					</div>
				</div></li>

			<!-- Nav Item - Charts -->
			<li class="nav-item"><a class="nav-link" href="charts.html">
					<i class="fas fa-fw fa-chart-area"></i> <span>Charts</span>
			</a></li>

			<!-- Nav Item - Tables -->
			<li class="nav-item"><a class="nav-link" href="tables.html">
					<i class="fas fa-fw fa-table"></i> <span>Tables</span>
			</a></li>

			<!-- Divider -->
			<hr class="sidebar-divider d-none d-md-block">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>

					<!-- Topbar Search -->
					<%-- <form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
						<div class="input-group">
							<input type="text" class="form-control bg-light border-0 small"
								placeholder="Search for..." aria-label="Search"
								aria-describedby="basic-addon2">
							<div class="input-group-append">
								<button class="btn btn-primary" type="button">
									<i class="fas fa-search fa-sm"></i> <c:forEach var="list" items="${listCat}">
       <option id="${list.key}" value="${list.value.getName()}">${list.value.getName()}</option>   
   </c:forEach>
								</button>
							</div>
						</div>
					</form> --%>

					<!-- Topbar Navbar -->
					<%-- <ul class="navbar-nav ml-auto">
viewproject?id=
						<!-- Nav Item - Search Dropdown (Visible Only XS) -->
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>

						<!-- Nav Item - Alerts -->
						<li class="nav-item dropdown no-arrow mx-1"><a <c:forEach var="list" items="${listCat}">
       <option id="${list.key}" value="${list.value.getName()}">${list.value.getName()}</option>   
   </c:forEach>
							class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
							role="button" data-togattributeValuegle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <!-- Counter - Alerts -->
								<span class="badge badge-danger badge-counter">3+</span>
						</a> <!-- Dropdown - Alerts -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="alertsDropdown">
								<h6 class="dropdown-header">Alerts Center</h6>
								<a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-primary">
											<i class="fas fa-file-alt text-white"></i>
										</div>
									</div>
									<div>http://localhost:8080/PebPolicy/
										<div class="small text-gray-500">December 12, 2019</div>
										<span class="font-weight-bold">A new monthly report is
											ready to download!</span>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-sdataTableJsuccess">
											<i class="fas fa-donate text-white"></i>
										</div>attributeValue
									</div>
									<div>
										<div class="small text-gray-500">December 7, 2019</div>
										$290.29 has been deposited into your account!
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-warning">
											<i class="fas fa-exclamation-triangle text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-grayhttp://localhost:8080/PebPolicy/-500">December 2, 2019</div>
										Spending Alert: We've noticed unusually high spending for your
										account.
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Show AattributeValuell Alerts</a>
							</div></li>

						<!-- Nav Item - Messages -->
						<li class="nav-item dropdown no-arrow mx-1"><a
							class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i>
								<!-- Counter - Messages --> <span
								class="badge badge-danger badge-counter">7</span>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="messagesDropdown">
								<h6 class="dropdown-header">Message Center</h6>
								<a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/fn_BT9fwg_E/60x60" alt="">
										<div class="status-indicator bg-success"></div>
									</div>
									<div class="font-weight-bold">
										<div class=attributeValue"text-truncate">Hi there! I am wondering if
											you can help me with a problem I've been having.</div>
										<div class="small text-gray-500">Emily Fowler · 58m</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/AU4VPcFN4LE/60x60" alt="">
										<div class="status-indicator"></div>
									</div>
									<div><input type="text" name="" class="form-control">
										<div class="text-truncate">I have the photos that you
											ordered last month, how would you like them sent to you?</div>
										<div class="small text-gray-500">Jae Chun · 1d</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/CS2uCrpNzJY/60x60" alt="">
										<div class="status-indicator bg-warning"></div>
									</div>
									<div>
										<div class="text-truncate">Last month's report looks
											great, attributeValueI am very happy with the progress so far, keep up the
											good work!</div>
										<div class="small text-gray-500">Morgan Alvarez · 2d</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="">
										<div class="status-indicator bg-success"></div>
									</div>
									<div>
										<div class="text-truncate">Am I a good boy? The reason I
											ask is because someone told me that people say this to all
											dogs, even if they aren't good...</div>
										<div class="small text-gray-500">Chicken the Dog · 2w</div>
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Read More Messages</a>
							</div></li>

						<div class="topbar-divider d-none d-sm-block"></div>

						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none attributeValued-lg-inline text-gray-600 small">Valerie
									Luna</span> <img class="img-profile rounded-circle"
								src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
						</a> <!-- Dropdown - User Information -->
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">
								<a class="dropdown-item" href="#"> <i
									class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
									Settings
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
									Activity Log
								</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#" data-toggle="modal"
									data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</div></li>

					</ul> --%>

				</nav>
				<!-- End of Topbar -->

				<!-- pre bid main -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Search Projects</h1>
						
					</div>
					<!-- start from here  -->
					<div>
					<form:form method="post" modelAttribute="pebProjectBean" action="search">
							<div class="row">
								<div class="form-group col-3">
									<label>Contract No</label>
									<form:input type="text" path="contractNo" class="form-control" />
									<form:errors path="contractNo" cssClass="text-danger" />
								</div>
								<div class="form-group col-3">
									<label>Project Country</label>
									<form:select path="projectCountry" class="form-control">
										<c:forEach items="${countryList}" var="cList"
											varStatus="status">
											<form:option value="${cList.key}">${cList.value}</form:option>
										</c:forEach>
									</form:select>
									<form:errors path="projectCountry" cssClass="text-danger" />
								</div>

								<div class="form-group col-3">
									<label>Project Start date</label>
									<form:input type="date" path="startDate" class="form-control" />
									<form:errors path="startDate" cssClass="text-danger" />
								</div>
								<div class="form-group col-3">
									<label>Project End date</label>
									<form:input type="date" path="endDate" class="form-control" />
									<form:errors path="endDate" cssClass="text-danger" />
								</div>
							</div>

							<div class="row">
								<div class="form-group col-3">
									<label class="">Sector/Project Type</label>
									<form:select path="sectorProjectType" class="form-control">
										<form:option value="-1">----Please Select----</form:option>
										<c:forEach items="${projectTypes}" var="pTypes"
											varStatus="status">
											<form:option value="${pTypes.key}">${pTypes.value}</form:option>
										</c:forEach>
									</form:select>
									<form:errors path="sectorProjectType" cssClass="text-danger" />
								</div>

								<div class="form-group col-3">
									<label>Exporter ID</label>
									<form:input type="text" path="exporterId" class="form-control" />
									<form:errors path="exporterId" cssClass="text-danger" />
								</div>
								<div class="form-group col-3">
									<label>Buyer ID</label>
									<form:input type="text" path="buyerId" class="form-control" />
									<form:errors path="buyerId" cssClass="text-danger" />
								</div>

								<div class="form-group col-3">
									<label>Project Status</label>
									<form:select path="projectStatus" class="form-control">
										<form:option value="NA">----Please Select------</form:option>
										<form:option value="active">Active</form:option>
										<form:option value="inactive">InActive</form:option>
									</form:select>
									<form:errors path="projectStatus" cssClass="text-danger" />
								</div>
							</div>

							<div class="row">
								<div class="form-group col-3">
									<label>Tags</label>
									<form:input type="text" path="tags" class="form-control" />
									<%-- <form:errors path="tags" cssClass="text-danger" /> --%>
								</div>
								<div class="form-group offset-1 col-3">
									<button type="submit" class="btn btn-md btn-primary btn-block mt-4">Search</button>
								</div>
							</div>
						</form:form>
						<div
							class="d-sm-flex align-items-center justify-content-between mb-4">
							<h1 class="h3 mb-0 text-gray-800">List of Projects</h1>

						</div>
					</div>
					<div class="">
						<table class="table table-hover table-striped">
						<thead class="thead-dark">
							<tr>
								<th>Contract No</th>
								<th>Project Country</th>
								<th>Start Date</th>
								<th>End Date</th>
								<th>Buyer Id</th>
								<th>Exporter Id</th>
								<th>Project Status</th>
								<th>Project Type</th>
								<th>Operation</th>
							</tr>
						</thead>
							<c:forEach items="${ProjectList}" var="project"
								varStatus="status">
								<input type="hidden" value="${project.key}" name="projectId">
								<tr>
									<td>${project.value.contractNo}</td>
									<td>${project.value.projectCountry}</td>
									<td>${project.value.startDate}</td>
									<td>${project.value.endDate}</td>
									<td>${project.value.buyerId}</td>
									<td>${project.value.exporterId}</td>
									<td>${project.value.projectStatus}</td>
									<td>${projectTypeList[status.index]}</td>
									<td>
										<a href="viewproject?id=${project.key}" class="btn btn-link">View</a> 
										<!-- <button type="button" class="btn btn-link" data-toggle="modal" data-target="#exampleModal">View</button> --> 
										<a href="editproject?id=${project.key}" class="btn btn-link">Edit</a>
									</td>
								</tr>
								
							</c:forEach>
						</table>

						<%-- 	<c:forEach var="project" items="${ProjectList}" varStatus="status">	
					<div class="card mt-3" style="width: 100%;">
						<div class="card-body onsameline">
							<input type="hidden" value="${project.key}" />
							<!-- <h5 class="card-title">Card title</h5> -->
							<!-- <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6> -->
							<p class="card-text">${project.value}</p>
							<div style="float: right;">
								<a href="viewproject?id=${project.key}" class="card-link">View</a> 
								<a href="#" class="card-link">Edit</a>
							</div>
						</div>
					</div>
					</c:forEach> --%>
						<div class="modal fade" id="exampleModal" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Modal
											title</h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">...</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">Close</button>
										<button type="button" class="btn btn-primary">Save
											changes</button>
									</div>
								</div>
							</div>
						</div>
						
					</div>
				</div><!-- container fluid  -->
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; PEB Policy 2019</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="${jquery}"></script>
	<script type="text/javascript" src="${popperJs}"></script>
	<script type="text/javascript" src="${mainJs}"></script>
<%-- 	<script type="text/javascript" src="${dataTableJs}"></script> --%>
	
</body>
</html>