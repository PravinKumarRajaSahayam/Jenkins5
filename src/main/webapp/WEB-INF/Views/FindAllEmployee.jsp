<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<style>
table
{
 border: none;
}
</style>
</head>
<body>
<form action="FindAllEmployee" method="get">
<table width='60%' align='center' class='u' id="cssa">
         <tr><td class='a bg-primary text-white' align='center'><b>Employee Id</b></td><td class='a bg-primary text-white' align='center'><b>Employee Name</b></td><td class='a bg-primary text-white' align='center'><b>Employee Department</b></td></tr>  
         <c:forEach items="${idList}" var="id">
         <tr><td class='s' align='center'>${id.getId()}</td><td class='s' align='center'>${id.getName()}</td><td class='s' align='center'>${id.getDepartment()}</td></tr>
         </c:forEach>
         </table>    
</form>
</body>
</html>