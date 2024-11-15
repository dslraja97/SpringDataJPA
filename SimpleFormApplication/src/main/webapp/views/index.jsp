<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title>UserDetailes Form</title>
    </head>

    <body>
        <h2>${message}</h2>
        <form action="userDetailes" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>age:</td>
                    <td><input type="number" name="age"></td>
                </tr>
                <tr>
                    <td>sex:</td>
                    <td><input type="text" name="sex"></td>
                </tr>
                <tr>
                    <td>phonenumber:</td>
                    <td><input type="number" name="phonenumber"></td>
                </tr>
                <tr>
                    <td>email:</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>Nativeplace:</td>
                    <td><input type="text" name="nativePlace"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit" </td>
                </tr>
            </table>
        </form>
    </body>

    </html>