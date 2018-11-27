<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Counter</title>
</head>
<body>
<h2>Student Information</h2>
<form:form method="POST" action="/addCounter">
    <table>
        <tr>
            <td><form:label path="apiName">apiName</form:label></td>
            <td><form:input path="apiName" /></td>
        </tr>
        <tr>
            <td><form:label path="count">Count</form:label></td>
            <td><form:input path="count" /></td>
        </tr>
        <tr>
            <td><form:label path="id">id</form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>