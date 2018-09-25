<%-- 
    Document   : editnote
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
        <form>
        <h2>View Note</h2>
        
        <b>Title:</b> <input type ="text" name="title" value="${Note.title}">
        <br>
        <br>
        <b>Contents:</b> <br>
        <textarea name="content">${Note.content}</textarea>
        
        <br>
        
    <button type="submit">Save</button>
    </form>
    </body>
</html>