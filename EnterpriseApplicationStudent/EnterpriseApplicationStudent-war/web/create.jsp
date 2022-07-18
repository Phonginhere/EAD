<%-- 
    Document   : create.jsp
    Created on : Jul 18, 2022, 11:46:27 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Manager</h1>
        <form action="StudentBean" method="POST">
            <table>
                <tr>
                    <td>Roll Number</td>
                    <td><input type="text" name="rollnumber"></td>
                </tr>
                <tr>
                    <td>name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>email</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>age</td>
                    <td><input type="number" name="age"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
