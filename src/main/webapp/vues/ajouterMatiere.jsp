<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Subject</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>
<form:form method="post" action="/TP1-SPRING/saveMatiere" modelAttribute="matr">    
       <br><br>  
             
          Title:    
          <form:input path="titre" />
         <br><br>
         
          Level:    
          <form:input path="niveau" />
         <br><br>  
        
             
         Hours' number:    
          <form:input path="nbHeures" />
          
          <br><br>  
         
          <input type="submit" value="Add Matiere" />   
       </form:form>


</h1>
</body>
</html>