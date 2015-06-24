<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>  Hello World  </title>
    </head>
    <body>
         <br>successful login</br>
         <p>
    </body>
</html> 

<script type="text/javascript">
	function fun(){
		document.getElementById("myform").submit();
	}
</script>

<body>    
   
username:${username }  
<p>  
password:${password }  
   
</body>  


 <p>  
   <form id = "myform" action = "test.do?act=test"> 
    <input type="button" value="continue" onclick="fun()"/>  
    </form>