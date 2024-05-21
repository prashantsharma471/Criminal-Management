<%-- 
    Document   : UpdateDetails
    Created on : 31-Mar-2024, 2:31:29 pm
    Author     : sharm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/UpdateCriminalDetails.css">
    </head>
    <body>
         <div class="maindiv">
       
            <div class="container">
                <div><h1>Update Criminal Details</h1></div>
                <form action="UpdateCriminalDetails" method="post">
                    <input type="text" name="cid" placeholder="Enter Criminal ID." required>
                    <input type="text" name="fullname" placeholder="Enter Criminal Name" required>
                    <input type="text" name="age" placeholder="Enter Criminal Age" required>
                    <input type="text" name="ctype" placeholder="Enter Crime-Type" required>
                    <input type="text" name="address" placeholder="Enter Criminal Address">
                    <input type="text" name="date" placeholder="Enter Date Of Crime" required>
                    <button>Update</button>
                </form>
            </div>
       </div>
    </body>
</html>
