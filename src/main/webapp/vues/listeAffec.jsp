<%@page import="tn.enig.dao.GestionImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste Affectations</title>
<c:set var="cxt" value = "${dispatcher-servlet.request.contextPath}"></c:set>
</head>
<body>
<h2>List of affectations</h2>
<a href='/TP1-SPRING/addAffectations'>Add affectation</a>
<table border="1">
  <tr>
  <th>Subject</th>
  <th>Teacher</th>
  <th>Affected hours</th>
  <th></th>
  </tr>
  
  <c:forEach items="${lisAff}" var="aff" >
                <tr>
              <%--  <td>${aff.id}</td> --%>
                    <td>${aff.matiere.titre}</td>
                    <td>${aff.enseignant.nom }</td>
                    <td>${aff.nbHeures}</td>
                    <td><a href="/TP1-SPRING/deleteAff/${aff.id}">delete</a></td>
                </tr>
  </c:forEach>
</table>

</body>
</html>