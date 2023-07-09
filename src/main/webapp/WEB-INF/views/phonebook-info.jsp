<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8" language="java" %>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="shortcut icon" href="<c:url value="/resources/img/header/logo.png"/>" type="image/x-icon">
  <link href="<c:url value="/resources/styles/styles.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/resources/styles/phonebook-info.css"/>" rel="stylesheet" type="text/css">
  <title>Телефонный справочник</title>
</head>
<body>
<div class="page">
  <header>
    <div class="container">
      <h1>Телефонный справочник</h1>
      <img src="<c:url value="/resources/img/header/logo.png"/>">
    </div>
  </header>

  <section class="info">
    <div class="container">
      <h2>${InfoView.h2}</h2>
      <form:form action="saveNumber" modelAttribute="PhonebookTableEntity" class="info-form">
        <form:hidden path="id"/>
        <div class="info-form-items">
          <div class="info-form-item">
            <p>Имя</p>
            <form:input type="text" path="firstName"/>
          </div>
          <div class="info-form-item">
            <p>Фамилия</p>
            <form:input type="text" path="secondName"/>
          </div>
          <div class="info-form-item">
            <p>Отчество</p>
            <form:input type="text" path="thirdName"/>
          </div>
          <div class="info-form-item">
            <p>Должность</p>
            <form:input type="text" path="postion"/>
          </div>
          <div class="info-form-item">
            <p>Подразделение</p>
            <form:input type="text" path="department"/>
          </div>
          <div class="info-form-item">
            <p>Телефон</p>
            <form:input type="text" path="telNumber"/>
          </div>
        </div>
        <input class="info-form-button" type="submit" value="${InfoView.submit}"/>
      </form:form>
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
