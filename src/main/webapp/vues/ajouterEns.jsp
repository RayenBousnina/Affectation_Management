<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>
<form:form method="post" action="/TP1-SPRING/saveEnseignant" modelAttribute="ens">    
       <br><br>  
             
          Surname:    
          <form:input path="nom" />
         <br><br>
         
          Name:    
          <form:input path="prenom" />
         <br><br>  
        
             
         hours of teaching:    
          <form:input path="chargeEns" />
          
          <br><br>  
         
          <input type="submit" value="Add Enseignant" />   
       </form:form>


</h1>

</body>
</html>