<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
  <title><s:text name="title.message"/></title>
  <s:head/>
  <sx:head/>
</head>
<body>

<h2><s:text name="welcome.message"/></h2>
<h3><s:text name="options.message"/></h3>

<a href="registro.action"><s:text name="form.message"/></a>
<br>
<br>
<s:form theme="simple" name="dni" action="buscar" method="post" validate="true">
  <table>
    <tr>
        <td class="evenRow">
            <s:text name="dni.message"/>
            <s:textfield id="dni" name="dni"/>
            <s:submit align="left" value="%{getText('button.search')}"/>
            <s:fielderror fieldName = "dni" />
        </td>
    </tr>
  </table>
</s:form>

</body>
</html>
