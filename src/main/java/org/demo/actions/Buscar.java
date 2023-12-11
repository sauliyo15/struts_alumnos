package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.demo.actions.datos.AlumnoBean;
import org.demo.actions.datos.OperacionesDatos;
import javax.servlet.ServletContext;

public class Buscar extends ActionSupport {
    private String dni;
    OperacionesDatos operacionesDatos;
    private AlumnoBean alumno;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String execute() throws Exception {

        ServletContext servletContext = ServletActionContext.getServletContext();
        operacionesDatos = (OperacionesDatos) servletContext.getAttribute("operacionesDatos");

        if (operacionesDatos != null) {

            alumno = operacionesDatos.comprobarAlumno(dni);

            if (alumno != null) {
                return SUCCESS;
            }
            else {
                addFieldError("dni", getText("dni.notfound"));
                return  INPUT;
            }
        }
        else {
            return ERROR;
        }
    }

    // Getters y setters para el atributo "alumno"
    public AlumnoBean getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoBean alumno) {
        this.alumno = alumno;
    }


    public void validate() {

        if (dni == null || dni.trim().isEmpty()) {
            addFieldError("dni", getText("dni.isempty"));
        }
    }

}