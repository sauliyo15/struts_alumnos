package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.demo.actions.datos.OperacionesDatos;

import javax.servlet.ServletContext;


public class Principal extends ActionSupport {

    @Override
    public String execute() throws Exception {

        ServletContext servletContext = ServletActionContext.getServletContext();
        OperacionesDatos operacionesDatos = (OperacionesDatos) servletContext.getAttribute("operacionesDatos");

        if (operacionesDatos == null) {
            operacionesDatos = new OperacionesDatos();
            servletContext.setAttribute("operacionesDatos", operacionesDatos);
        }

        return SUCCESS;
    }
}
