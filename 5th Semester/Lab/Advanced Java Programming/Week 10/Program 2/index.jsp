<%@page import="pes.Employee"%>
<%@page import="pes.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Getting the Value of Bean</title>
</head>
<body>

	<jsp:useBean id="employee" class="pes.Employee"/>
	<div>
		<h3>Employee Details</h3>
	</div>
	
	<%
	Employee empl = (Employee) request.getAttribute("emp");
	double	salary = empl.getGrossSalary();
	double pf, pt, it;
	double netsalary;
	%>
	
	
	<table>
		<tr><td>Employee ID : </td><td>${emp.employeeID}</td></tr>
		<tr><td>Employee Name : </td><td>${emp.employeeName}</td></tr>
		<tr><td>Gross Salary : </td><td>Rs.${emp.grossSalary}</td></tr>
		<tr><td>PF : </td><td>Rs.<%=pf = 0.12 * salary%></td></tr>
		<tr><td>PT : </td><td>Rs.<%=pt = 0.25 * salary%></td></tr>
		<tr><td>IT : </td><td>Rs.<%=it = 0.3 * salary%></td></tr>
		<tr><td>Net Salary : </td><td>Rs.<%=netsalary = salary - pf - pt - it%></td></tr>
	</table>
	
	
</body>
</html>