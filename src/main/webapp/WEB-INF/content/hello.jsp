<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

<s:form theme="simple">
  <s:textfield name="fname"/>
  <sx:datetimepicker name="test"/>
</s:form>


<s:form theme="simple" id="itemAdd" name="itemAdd" action="invoice" method="post">
  <tr>
    <td class="evenRow">
      <sx:datetimepicker id="createDate" displayFormat="%{getText('dateFormat')}" name="invoiceItem.createDate"/>
    </td>
    <td class="evenRow">
      <s:submit align="left" value="Save"/>
    </td>
  </tr>
</s:form>

</body>
</html>
