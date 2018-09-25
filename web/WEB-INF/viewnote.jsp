<%-- 
    Document   : viewnote
    Created on : Sep 21, 2018, 3:34:57 PM
    Author     : 747787
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>View Note</h2>
        <b>Title:</b> ${Note.title}
        <br>
        <br>
        <b>Contents:</b> <br>
        <div>${Note.content}</div>
        
        <br>
        <a href="note?edit">Edit</a>
    </body>
</html>