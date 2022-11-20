<%@page import="tn.enig.dao.GestionImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of subjects</title>
</head>
<body>
<h2>List of subjects</h2>
<a href='/TP1-SPRING/ajoutMat'>Add subject</a>
<table border="1">
  <tr>
  <th>ID</th>
  <th>Title</th>
  <th>Level</th>
  <th>Hours' number</th>
  </tr>
  
  <c:forEach items="${matieres}" var="mat" >
                <tr>
                    <td>${mat.id}</td>
                    <td>${mat.titre}</td>
                    <td>${mat.niveau}</td>
                    <td>${mat.nbHeures}</td>
                </tr>
  </c:forEach>
</table>
</body>
</html>