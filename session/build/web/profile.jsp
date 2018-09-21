<%-- 
    Document   : profile
    Created on : Sep 17, 2018, 9:02:41 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <% 
        
            String user = request.getParameter("user");
            
            session.setAttribute("user", user);
               
            
            
        %>
        
        <h1><%= "Welcome " + session.getAttribute("user") %></h1>
    </body>
</html>
