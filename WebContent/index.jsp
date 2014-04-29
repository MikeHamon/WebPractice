
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove duplicates</title>
        <script src="http://code.jquery.com/jquery-latest.js">   
        </script>
        <script>
            $(document).ready(function() {                        
                $('#submit').click(function(event) {  
                    var listis=$('#list').val();
                    var nis=$('#n').val();
                	$.get('AlgoServlet',{list:listis,n:nis},function(responseText) { 
                        $('#filteredList').html(responseText);         
                    });
                });
            });
        </script>
<style type="text/css">
body{background-color:#00002e;color:white;text-align:center;}
</style>
</head>
<body>
<form id="form1">
<h1>Removes duplicates in a list using Jquery in JSP and Servlet</h1>
Enter the semi-colon seperated list:<br/>
<input type="text" id="list"/><br/>
Enter the value of N:<br/>
<input type="text" id="n"/><br/>
<input type="button" id="submit" value="Submit"/><br/>
<div id="filteredList"></div>
</form>
</body>
</html>