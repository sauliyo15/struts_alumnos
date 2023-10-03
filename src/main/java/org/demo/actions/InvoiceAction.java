package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;

public class InvoiceAction extends ActionSupport  {

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        return SUCCESS;
    }
}
