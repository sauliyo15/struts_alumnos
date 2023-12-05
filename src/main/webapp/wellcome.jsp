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

    <h1><s:text name="form.resumen.message"/></h1>

    <p><s:text name="form.subject.message"/> <s:property value="invoiceBean.subject"/></p>
    <p><s:text name="dates.message"/> <s:property value="invoiceBean.dateFrom"/> a <s:property value="invoiceBean.dateTo"/></p>
    <p><s:text name="form.price.message"/> <s:property value="invoiceBean.price"/></p>
    <p><s:text name="taxes.message"/> <s:property value="invoiceBean.getTaxes()"/></p>
    <h2><s:text name="total.message"/> <s:property value="invoiceBean.getTotal()"/></h2>

</body>
</html>