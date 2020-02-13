<%-- 
    Document   : newPerson
    Created on : Feb 13, 2020, 12:42:30 PM
    Author     : pupil
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Новый читатель!</h1>
        <a href="index">Главная страница</a>
        <p>${info}</p>
        <p>Вошедший пользователь: ${user.login}</p>
        <form action="newPerson" method="POST">
            Имя: <input type="text" name="firstname"><br>
            Фамилия: <input type="text" name="lastname"><br>
            Статус: <input type="text" name="status"><br>            
            Пароль: <input type="password" name="password1"><br>
            <input type="submit" value="Добавить читателя">
        </form>
       
        
    </body>
</html>
