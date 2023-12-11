package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.demo.actions.datos.AlumnoBean;
import org.demo.actions.datos.OperacionesDatos;
import javax.servlet.ServletContext;

public class Registrar extends ActionSupport {

    OperacionesDatos operacionesDatos;

    private AlumnoBean alumnoBean;

    private String mensaje="";


    public AlumnoBean getAlumnoBean() {
        return alumnoBean;
    }

    public void setAlumnoBean(AlumnoBean alumnoBean) {
        this.alumnoBean = alumnoBean;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    @Override
    public String execute() throws Exception {

        ServletContext servletContext = ServletActionContext.getServletContext();
        operacionesDatos = (OperacionesDatos) servletContext.getAttribute("operacionesDatos");

        if (operacionesDatos != null) {

            AlumnoBean alumno = operacionesDatos.comprobarAlumno(alumnoBean.getDni());

            if (alumno == null) {
                alumno = new AlumnoBean();
                alumno.setDni(alumnoBean.getDni());
                alumno.setNombre(alumnoBean.getNombre());
                alumno.setApellidos(alumnoBean.getApellidos());
                alumno.setFechaNacimiento(alumnoBean.getFechaNacimiento());
                alumno.setEmail(alumnoBean.getEmail());
                alumno.setTelefono(alumnoBean.getTelefono());
                alumno.setDireccion(alumnoBean.getDireccion());
                alumno.setPoblacion(alumnoBean.getPoblacion());
                alumno.setNacionalidad(alumnoBean.getNacionalidad());
                alumno.setObservaciones(alumnoBean.getObservaciones());

                operacionesDatos.agregarAlumno(alumno);
                mensaje = getText("registrocorrecto");
                return SUCCESS;
            }
            else {
                addFieldError("alumnoBean.dni", getText("dni.exits"));
                return  INPUT;
            }
        }
        else {
            return ERROR;
        }
    }


    public void validate() {

        if (alumnoBean.getDni() == null || alumnoBean.getDni().trim().isEmpty()) {
            addFieldError("alumnoBean.dni", getText("dni.isempty"));
        }
        else {
            if (!validarDNI(alumnoBean.getDni())) {
                addFieldError("alumnoBean.dni", getText("dni.format"));
            }
        }

        if (alumnoBean.getNombre() == null || alumnoBean.getNombre().trim().isEmpty()) {
            addFieldError("alumnoBean.nombre", getText("nombre.isempty"));
        }

        if (alumnoBean.getApellidos() == null || alumnoBean.getApellidos().trim().isEmpty()) {
            addFieldError("alumnoBean.apellidos", getText("apellidos.isempty"));
        }

        if (alumnoBean.getFechaNacimiento() == null) {
            addFieldError("alumnoBean.fechaNacimiento", getText("fecha.isempty"));
        }

        if (alumnoBean.getEmail() == null || alumnoBean.getEmail().trim().isEmpty()) {
            addFieldError("alumnoBean.email", getText("email.isempty"));
        }
        else {
            if (!validarEmail(alumnoBean.getEmail())) {
                addFieldError("alumnoBean.email", getText("email.format"));
            }
        }

        if (alumnoBean.getTelefono() == null || alumnoBean.getTelefono().trim().isEmpty()) {
            addFieldError("alumnoBean.telefono", getText("telefono.isempty"));
        }

        if (alumnoBean.getDireccion() == null || alumnoBean.getDireccion().trim().isEmpty()) {
            addFieldError("alumnoBean.direccion", getText("direccion.isempty"));
        }

        if (alumnoBean.getPoblacion() == null || alumnoBean.getPoblacion().trim().isEmpty()) {
            addFieldError("alumnoBean.poblacion", getText("poblacion.isempty"));
        }

        if (alumnoBean.getNacionalidad() == null || alumnoBean.getNacionalidad().trim().isEmpty()) {
            addFieldError("alumnoBean.nacionalidad", getText("nacionalidad.isempty"));
        }

        if (alumnoBean.getObservaciones() == null || alumnoBean.getObservaciones().trim().isEmpty()) {
            addFieldError("alumnoBean.observaciones", getText("observaciones.isempty"));
        }
    }

    private boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }

    private boolean validarDNI(String dni) {
        String regex = "^[0-9]{8}[A-Z]$";
        return dni.matches(regex);
    }

}
