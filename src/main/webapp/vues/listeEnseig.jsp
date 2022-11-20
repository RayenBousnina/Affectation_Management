<%@page import="tn.enig.dao.GestionImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des enseignants</title>
<c:set var="cxt" value = "${dispatcher-servlet.request.contextPath}"></c:set>
</head>
<body>
<h2>List of teachers</h2>
<a href='/TP1-SPRING/addEnseignant'>Add Teacher</a>
<table border="1">
  <tr>
  <th>ID</th>
  <th>Prénom</th>
  <th>Nom</th>
  <th>Charge</th>
  </tr>
  
  <c:forEach items="${enseg}" var="mat" >
                <tr>
                    <td>${mat.id}</td>
                    <td>${mat.nom}</td>
                    <td>${mat.prenom}</td>
                    <td>${mat.chargeEns}</td>
                </tr>
  </c:forEach>
</table>

</body>
</html>