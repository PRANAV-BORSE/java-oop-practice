<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate,java.time.LocalTime" %>
<!DOCTYPE html>
<html>
	<body>
		<%--Including the resource: demo.html --%>
		<%@ include file="demo.html" %>
		<h2>Welcome to JSP tags demonstration...</h2>
		
		
		
		<%--Declaring a variable and defining some methods --%>
		<%!
			int num = 7;
			public String sayWelcome(String name){
				return "Welcome " + name;
			}
		%>
		<h2>Num = <%=num %></h2>
		<h2>Square of <%=num %> is <%=(num * num) %></h2>
		<h2>Is <%=num %> &lt; 9 ? <%=(num < 9) %></h2>
		<h2>The method is saying <%=sayWelcome("Jack") %></h2>
		
		
		
		
		<%--Printing HELLO 5 times using H1 elements --%>
		<%
			for(int a=1;a<=5;a++){
				
			
		%>
		<h1>HELLO</h1>
		<%
			}
		%>
		
		
		<%--Displaying today's date and local time using LocalDate and LocalTime--%>
		<%
			LocalDate today = LocalDate.now();
			LocalTime now = LocalTime.now();
		%>
		<h2>Today's date is <%=today %></h2>
		<h2>Current time is <%=now %></h2>
		
		
		
	</body>
</html>

