<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Телефонный справочник</title>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="<c:url value="/resources/img/header/logo.png"/>" type="image/x-icon">
    <link href="<c:url value="/resources/styles/styles.css"/>" rel="stylesheet" type="text/css">
</head>
<html>
<body>
<div class="page">
    <header>
        <div class="container">
            <h1>Телефонный справочник</h1>
            <img src="<c:url value="/resources/img/header/logo.png"/>">
        </div>
    </header>

    <section class="table">
        <div class="container">
            <h2>Телефоны</h2>
            <table>
                <tr>
                    <th>Фамилия</th>
                    <th>Имя</th>
                    <th>Отчество</th>
                    <th>Подразделение</th>
                    <th>Должность</th>
                    <th>Телефон</th>
                </tr>
                <c:forEach var="phoneBook" items="${AllPhonebookTableEntities}">

                <tr>
                    <td>${phoneBook.secondName}</td>
                    <td>${phoneBook.firstName}</td>
                    <td>${phoneBook.thirdName}</td>
                    <td>${phoneBook.department}</td>
                    <td>${phoneBook.postion}</td>
                    <td>${phoneBook.telNumber}</td>
                </tr>

                </c:forEach>
            </table>

            <div class="table-addrow">
                <input class="table-add" type="button" value="Добавить номер" onclick="window.location.href = 'addNewNumber'">
            </div>
        </div>
    </section>

    <footer>
        <div class="container">
            <div class="author">
                <p>&copy; Сачков Владимир Игоревич, МТУСИ</p>
            </div>
        </div>
    </footer>
</div>
</body>
</html>
