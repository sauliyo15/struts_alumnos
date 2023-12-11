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
    <h3><s:text name="form.message"/></h3>


    <s:form theme="simple" name="registrar" action="registrar" method="post" validate="true">

      <ul>
        <li><s:text name="dni.label"/><s:textfield id="alumnoBean.dni" name="alumnoBean.dni"/><s:fielderror fieldName="alumnoBean.dni" /></li>
        <li><s:text name="nombre.label"/><s:textfield id="alumnoBean.nombre" name="alumnoBean.nombre"/><s:fielderror fieldName = "alumnoBean.nombre" /></li>
        <li><s:text name="apellidos.label"/><s:textfield id="alumnoBean.apellidos" name="alumnoBean.apellidos"/><s:fielderror fieldName = "alumnoBean.apellidos" /></li>
        <li><s:text name="fecha.label"/><sx:datetimepicker id="alumnoBean.fechaNacimiento" name="alumnoBean.fechaNacimiento"/><s:fielderror fieldName = "alumnoBean.fechaNacimiento" /></li>
        <li><s:text name="email.label"/><s:textfield id="alumnoBean.email" name="alumnoBean.email"/><s:fielderror fieldName = "alumnoBean.email" /></li>
        <li><s:text name="telefono.label"/><s:textfield id="alumnoBean.telefono" name="alumnoBean.telefono"/><s:fielderror fieldName = "alumnoBean.telefono" /></li>
        <li><s:text name="direccion.label"/><s:textfield id="alumnoBean.direccion" name="alumnoBean.direccion"/><s:fielderror fieldName = "alumnoBean.direccion" /></li>
        <li><s:text name="poblacion.label"/><s:textfield id="alumnoBean.poblacion" name="alumnoBean.poblacion"/><s:fielderror fieldName = "alumnoBean.poblacion" /></li>
        <li><s:text name="nacionalidad.label"/><s:textfield id="alumnoBean.nacionalidad" name="alumnoBean.nacionalidad"/><s:fielderror fieldName = "alumnoBean.nacionalidad" /></li>
        <li><s:text name="observaciones.label"/><s:textfield id="alumnoBean.observaciones" name="alumnoBean.observaciones"/><s:fielderror fieldName = "alumnoBean.observaciones" /></li>
      </ul>
      <s:submit align="left" value="%{getText('button.register')}"/>
    </s:form>
    <h3><s:property value="mensaje"/></h3>
    <a href="principal.action"><s:text name="button.comeback"/></a>
</body>
</html>