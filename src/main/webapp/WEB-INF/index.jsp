<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Currency converter</title>
</head>
<body>
<h2 style="text-align: center">Convert currency</h2>
<br/>
<div style="margin-left: 20%">
<form method="Post">
    <label for="fromCurrency"> From </label>
    <select id="fromCurrency" name="fromCurrency">
        <option value="USD">USD</option>
        <option value="EUR">EUR</option>
        <option value="RUB">RUB</option>
        <option value="UAH">UAH</option>
    </select>
    <br/><br/>
    <label for="value"> Enter a number</label>
    <input type="number" id="value" name="value" value="1" step="0.01">
    <br/><br/>
    <label for="toCurrency"> To </label>
    <select id="toCurrency" name="toCurrency">
        <option value="USD">USD</option>
        <option value="EUR">EUR</option>
        <option value="RUB">RUB</option>
        <option value="UAH">UAH</option>
    </select>
    <br/><br/>
    <input type="submit" value="Convert"/>
</form>
<h3 th:text=${value}></h3>
</div>
</body>
</html>