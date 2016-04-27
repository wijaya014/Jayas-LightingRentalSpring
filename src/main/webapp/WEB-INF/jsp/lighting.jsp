<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lighting Page</title>
</head>
<body>
	
	<form:form action="lighting.do" method="POST" commandName="newLighting">
		<table>
			<tr>
				<td>Lighting ID</td>
				<td><form:input path="idLighting" /></td>
			</tr>
			<tr>
				<td>Name </td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>jumlah watt </td>
				<td><form:input path="watt" /></td>
			</tr>
			<tr>
				<td>Harga Satuan </td>
				<td><form:input path="hargaSatuan" /></td>
			</tr>
			<tr>
				<td>Jumlah </td>
				<td><form:input path="jumlah" /></td>
			</tr>
			<tr>
				<td colspan="1">
					<input type="submit" name="action" value="Add" />
					<input type="submit" name="action" value="Edit" />
					<input type="submit" name="action" value="Delete" />
					<input type="submit" name="action" value="Search" />
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<table border="1">
		<th>ID Lighting</th>
		<th>Name</th>
		<th>Watt</th>
		<th>Harga Satuan</th>
		<th>Jumlah</th>
		<c:forEach items="${lightingList}" var="lighting">
		<tr>
			<td>${lighting.idLighting}</td>
			<td>${lighting.name}</td>
			<td>${lighting.watt}</td>
			<td>${lighting.hargaSatuan}</td>
			<td>${lighting.jumlah}</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>