<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<%-- Instantiating a bean of type Person and putting it into SESSION scope --%>
		<jsp:useBean id="pers" class="example.beans.Person" scope="session"/>
		<%--Setting values for all the properties of bean --%>
		<jsp:setProperty property="*" name="pers"/>
		<h1>
			Person Created. To view, Please <a href="show_person.jsp">Click here</a>
		</h1>
	</body>
</html>