<%-- 
    Document   : AddDetails
    Created on : 30-Mar-2024, 10:23:07 pm
    Author     : sharm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/AddCriminalDetails.css">
        <link rel="stylesheet" href="css/Ails.css">
    </head>
    <body>
       <div class="maindiv">
       
            <div class="container">
                <div><h1>Add New Criminal-Details</h1></div>
                <form action="AddCriminalDetails" method="post" >
                    <input type="text" class="" name="cid" placeholder="Enter Criminal ID." required>
                    <input type="text" name="fullname" placeholder="Enter Criminal Name" required>
                    <input type="text" name="age" placeholder="Enter Criminal Age" required>
                    <input type="text" name="ctype" placeholder="Enter Crime-Type" required>
                    <input type="text" name="address" placeholder="Enter Criminal Address">
                    <input type="text" name="date" placeholder="Enter Date Of Crime" >
                    
<!--                     Image: <input type="file" name="image">-->
                    
<!--                    <button type="submit">Submit</button>-->
                    <button>Submit</button>
                </form>
            </div>
       </div>
        
<!--        
         <script>
        // Get references to DOM elements
        const fileInput = document.getElementById('fileInput');
        const imagePreview = document.getElementById('imagePreview');

        // Add event listener for file input change
        fileInput.addEventListener('change', function() {
            const file = this.files[0]; // Get the selected file
            
            if (file) {
                const reader = new FileReader(); // Initialize FileReader
                reader.onload = function(event) {
                    // Set the src attribute of the image with the data URL
                    imagePreview.src = event.target.result;
                    imagePreview.style.display = 'block'; // Show the image
                };
                reader.readAsDataURL(file); // Read the file as a data URL
            } else {
                // If no file is selected, hide the image
                imagePreview.src = '';
                imagePreview.style.display = 'none';
            }
        });
    </script>
        -->
        
        
    </body>
</html>
