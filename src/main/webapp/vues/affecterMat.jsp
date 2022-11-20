<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Affectation</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>
<form:form method="post" action="/TP1-SPRING/saveAffectation" modelAttribute="aff">    
       
         <br><br>  
        Type: <form:select path="matiere.titre">  
        <form:option value="prog1" label="prog1"/>  
        <form:option value="prog2" label="prog2"/>  
        <form:option value="rx2" label="rx2"/>  
        <form:option value="filtrage optimale" label="filtrage optimale"/>  
        </form:select>  
        
          
         <br><br>  
        Type: <form:select path="enseignant.nom">  
        <form:option value="yassin" label="yassin"/>  
        <form:option value="moussa" label="moussa"/>  
        <form:option value="aziz" label="aziz"/>  
        <form:option value="mourad" label="mourad"/>  
        </form:select>  
        <br><br>  
        
             
         Hours to affect:    
          <form:input path="nbHeures" />
        <br><br>  
         
          <input type="submit" value="Add Affectation" />   
       </form:form>


</h1>
</body>
</html>