<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
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

<s:form theme="simple" id="itemAdd" name="itemAdd" action="invoice" method="post" validate="true">
  <table>
    <tr>
        <td class="evenRow">
            <s:text name="form.subject.message"/>
            <s:textfield id="subject" name="invoiceBean.subject"/>
            <s:fielderror fieldName = "invoiceBean.subject" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <s:submit align="left" value="Enviar"/>
        </td>
    </tr>
  </table>
</s:form>

</body>
</html>
