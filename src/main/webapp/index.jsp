<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8" language="java" %>
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
                    <th>Операции</th>
                </tr>
                <tr>
                    <td>Сачков</td>
                    <td>Владимир</td>
                    <td>Игоревич</td>
                    <td>Отдел разработки</td>
                    <td>Разработчик</td>
                    <td>+7 499 99 99</td>
                </tr>
            </table>
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
