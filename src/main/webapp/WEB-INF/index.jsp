<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Currency converter</title>
</head>
<body>
<p>Simple text</p>
<br/>
<form method="Post">
    <label for="fromCurrency"> From </label>
    <select id="fromCurrency" name="fromCurrency">
        <option value="usd">USD</option>
        <option value="eur">EUR</option>
        <option value="rub">RUB</option>
        <option value="uah">UAH</option>
    </select>
    <br/><br/>
    <label for="value"> Enter a number</label>
    <input type="number" id="value" name="value" value="1">
    <br/><br/>
    <label for="toCurrency"> To </label>
    <select id="toCurrency" name="toCurrency">
        <option value="usd">USD</option>
        <option value="eur">EUR</option>
        <option value="rub">RUB</option>
        <option value="uah">UAH</option>
    </select>
    <br/><br/>
    <input type="submit" value="Convert"/>
</form>
<p th:text=${value}></p>
</body>
</html>