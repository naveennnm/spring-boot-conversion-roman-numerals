<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<link rel="stylesheet" href="/resources/css/app.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<h1>Convert&nbsp;Numerals&nbsp;And&nbsp;Form&nbsp;Roman&nbsp;Numerals</h1>
	<hr>
	<div class="form">
		<form:form id="romanNumeralFormID" modelAttribute="romanNumeral"
			action="numberProcess.html" method="post">
			<table>
				<marquee behavior="alternate" scrollamount="5">
					Roman&nbsp;Numerals&nbsp;Cannot&nbsp;Be&nbsp;Zero&nbsp;Or&nbsp;Negative,&nbsp;Should&nbsp;Enter&nbsp;The&nbsp;Numerals&nbsp;>=&nbsp;1</marquee>
				<tr>
					<td>Enter The Numerals</td>
					<td><form:input path="romanNumeral" name="romanNumeral"
							id="romanNumeralId" /></td>
					<td><input type="button" value="Click"
						onclick="lookUpRomanNumeral(romanNumeral)"></td>
					<td><p id="responceDivID">&nbsp;&nbsp;</p></td>
				</tr>
			</table>
		</form:form>
	</div>
	<footer style="text-align: center">
		<p>naveennnm01@gmail.com</p>
	</footer>
</body>

</html>