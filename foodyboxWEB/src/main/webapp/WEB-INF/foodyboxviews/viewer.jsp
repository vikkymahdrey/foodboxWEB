<%@page import="java.util.*"%>
<%@page import="com.team.foodybox.domain.*"%>
<%@page import="org.displaytag.decorator.TotalTableDecorator"%>
<%@page import="org.displaytag.decorator.MultilevelTotalTableDecorator"%>
<%@page import="com.itextpdf.text.log.SysoLogger"%>
 <%@ page buffer = "9000kb" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>

<!DOCTYPE html >
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Viewer</title>
<link rel="stylesheet" href="css/displaytag.css" media="all">
 <link rel="stylesheet" href="css/style.css"> 
<!-- <link rel="stylesheet" href="css/style1.css">
<link rel="stylesheet" href="css/style2.css">  -->
<script type="text/javascript" src="js/jquery-latest.js"></script>

<script  src="https://code.jquery.com/jquery-2.2.0.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/custom_siemens.css" rel="stylesheet">
<link href="css/theme.scss.css" rel="stylesheet">
<link href="css/view.css" rel="stylesheet">
</head>
<body>
	<%
	String fname1=("ViewerList :").concat(new Date().toString()).concat(".csv");
	String fname2=("ViewerList :").concat(new Date().toString()).concat(".xls");
	String fname3=("ViewerList :").concat(new Date().toString()).concat(".xml");
	List<Viewer> viewerList=(List<Viewer>)request.getAttribute("viewer");
	
	%>
	 <p class="visitorReport"><b>Visitor Report</b></p>
	 <div id="PageContainer">
	<div class="wrapper">
		<div class="main-page-container">
			<div class="container">
		<display:table class="alternateColor" name="<%=viewerList%>" id="row"
			export="true" requestURI=""  defaultsort="1" defaultorder="descending" pagesize="50">
			<%-- <display:column property="id" title="ID" sortable="true" headerClass="sortable" /> --%>
			 <display:column property="name" title="Name"	format="{0,date,dd-MM-yyyy}" sortable="true"  />
				
				<display:column property="email" title="Email" sortable="true"  />
				<display:column property="message" title="Message" 	sortable="true"  />
				<display:column property="contactNo" title="ContactNo" sortable="true"  />
				<display:column property="createdDt" title="Created_Date" sortable="true"  />		
				     		   
		 	 <display:setProperty name="export.csv.filename" value="<%=fname1%>" />
			 <display:setProperty name="export.excel.filename" value="<%=fname2%>" />
			 <display:setProperty name="export.xml.filename" value="<%=fname3%>" /> 
		</display:table>
	
			</div>
		</div>
	</div>
	</div>

</body>
</html>