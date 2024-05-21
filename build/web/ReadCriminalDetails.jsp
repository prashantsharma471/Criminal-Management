<%-- 
    Document   : ReadDetails
    Created on : 31-Mar-2024, 4:18:09 pm
    Author     : sharm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/ReadCriminalDetails.css">
    </head>
    <body>
        <div class="maindiv">
       
            <div class="container">
                <div><h1>Get Criminal Details</h1></div>
                <form action="ReadCriminalDetails" method="post">
                    <input type="text" name="cid" placeholder="Enter Criminal ID.">
                    
                    <button>Get</button>
                </form>
            </div>
       </div>
    </body>
</html>
