package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.demo.actions.datos.OperacionesDatos;

import javax.servlet.ServletContext;

public class Registro  extends ActionSupport {

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }
}
