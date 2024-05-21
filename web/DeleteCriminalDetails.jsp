<%-- 
    Document   : DeleteDetails
    Created on : 31-Mar-2024, 3:20:08 pm
    Author     : sharm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/DeleteCriminalDetails.css">
    </head>
    <body>
        <div class="maindiv">
       
            <div class="container">
                <div><h1>Delete Criminal Details</h1></div>
                <form action="DeleteCriminalDetails" method="post">
                    <input type="text" name="cid" placeholder="Enter Criminal ID.">
                    
                     <button>Delete</button> 
                </form>
            </div>
       </div>
    </body>
    

    
    
</html>
