<%-- 
    Document   : showPerson
    Created on : Sep 19, 2019, 10:54:35 AM
    Author     : Melnikov
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
        <h1>Список читателей</h1>
        <p>${info}</p>
        
        <a href="index">Главная страница</a>
        <ul>
            <c:forEach var="person" items="${listPerson}">
                <li>
                    Пользователь ${person.id}, ${person.firstname} ${person.lastname}, Статус: ${person.status}
                    <a href="ShowReader?id=${person.id}">Изменить</a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
