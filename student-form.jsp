<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>

    <%
      String name=request.getParameter("name");
      String id=request.getParameter("id");
      String branch=request.getParameter("branch");
      
      Connection con=null;
      PreparedStatement ps=null;
      
      try{
    	  
    	    String url="jdbc:mysql://localhost:3306/";
    		String user="root";
    		String pass="";
    		Class.forName("com.mysql.jdbc.Driver");
    		con=DriverManager.getConnection(url,user,pass); 
    		String url2="Insert into students('name', 'id', 'branch') values('"+name+"','"+id+"','"+branch+"')";
    	    ps.executeUpdate(url2);
    		
    	  
      } catch(Exception e)
      {
    	 e.printStackTrace(); 
      }
      
    %>
	Student Name is <%=name %> and id is <%=id %> 
</body>
</html>