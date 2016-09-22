<%-- page directive --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="code.BeanForm, java.util.ArrayList"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>

<body>
	<%-- declaration --%>
	<%!final static String USER = "pepe";%>
	<%-- scriptlet--%>
	<%
		String sLastName = (String) session.getAttribute("lastName");
		String sEmail = (String) request.getParameter("email");
		String sName = request.getParameter("name");
	%>
	<!-- This is a comment that we can see -->
	<%-- This is secret comment --%>
	Client information:
	<h2>
		Name:
		<%-- Expression --%>
		<%=sName%></h2>
	<h2>
		Email:
		<%=sEmail%></h2>

	<%
		if (sName.equals(sLastName) || sName.equals(USER)) {
			out.print("<p>Hello " + sName + "</p>");
		} else {
			out.print("<p>I don't know you.</p>");
		}
	%>
	<%
		if (!sName.equals(""))
		session.setAttribute("lastName", sName);
	%>
</body>
</html>