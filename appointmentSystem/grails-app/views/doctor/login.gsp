<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Doctor Login</title>
	
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
	<g:if test="${flash.message}">
	<div class="message">${flash.message}</div>
	</g:if>
	
	<g:form action="validate">
	<input type="hidden" name="cName" value="${cName}">
	<input type="hidden" name="aName" value="${aName}">
	
      <table>
        <tr class="prop">
          <td class="name">
            <label for="DoctorEmail">Doctor Email:</label>
          </td>
          <td class="value">
            <input type="text" id="DoctorEmail" name="DoctorEmail" value="">
          </td></tr>
        <tr class="prop">
          <td class="name">
            <label for="DoctorPassword">Password:</label>
          </td>
          <td class="value">
            <input type="password" id="DoctorPassword" name="DoctorPassword" value="">
          </td></tr>
        <tr><td></td>
          <td>
            <input type="submit" value="login"/>
          </td></tr>
      </table>
    </g:form>
  </body>
</html>
