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
    <h3><s:text name="info.message"/></h3>
    <ul>
        <li><s:text name="dni.label"/><strong><s:property value="alumno.getDni()" /></strong></li>
        <li><s:text name="nombre.label"/><strong><s:property value="alumno.getNombre()" /></strong></li>
        <li><s:text name="apellidos.label"/><strong><s:property value="alumno.getApellidos()" /></strong></li>
        <li><s:text name="fecha.label"/><strong><s:property value="alumno.getFechaNacimiento()" /></strong></li>
        <li><s:text name="email.label"/><strong><s:property value="alumno.getEmail()" /></strong></li>
        <li><s:text name="telefono.label"/><strong><s:property value="alumno.getTelefono()" /></strong></li>
        <li><s:text name="direccion.label"/><strong><s:property value="alumno.getDireccion()" /></strong></li>
        <li><s:text name="poblacion.label"/><strong><s:property value="alumno.getPoblacion()" /></strong></li>
        <li><s:text name="nacionalidad.label"/><strong><s:property value="alumno.getNacionalidad()" /></strong></li>
        <li><s:text name="observaciones.label"/><strong><s:property value="alumno.getObservaciones()" /></strong></li>
    </ul>
    <a href="principal.action"><s:text name="button.comeback"/></a>
</body>
</html>