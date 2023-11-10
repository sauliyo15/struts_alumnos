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



<s:form theme="simple" id="itemAdd" name="itemAdd" action="invoice" method="post" validate="true">
  <h1><s:text name="form.tittle.message"/></h1>
  <table>
  <tr>
      <td class="evenRow">
        <s:fielderror fieldName = "invoiceBean.subject" />
        <s:text name="form.subject.message"/>
        <s:textfield id="subject" name="invoiceBean.subject"/>
      </td>
    </tr>
  <tr>
      <td class="evenRow">
        <s:text name="form.fromDate.message"/>
        <sx:datetimepicker id="dateFrom" name="invoiceBean.dateFrom"/>
      </td>
    </tr>
  <tr>
    <td class="evenRow">
       <s:text name="form.toDate.message"/>
       <sx:datetimepicker id="dateTo" name="invoiceBean.dateTo" />
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
