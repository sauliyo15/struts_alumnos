package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {

        boolean chequearFecha = true;

        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }

        if (invoiceBean.getDateFrom() == null) {
            chequearFecha = false;
            addFieldError("invoiceBean.dateFrom", "La fecha de inicio es obligatoria.");
        }

        if (invoiceBean.getDateTo() == null) {
            chequearFecha = false;
            addFieldError("invoiceBean.dateTo", "La fecha de fin es obligatoria.");
        }

        if (chequearFecha) {
            if (invoiceBean.getDateFrom().compareTo(invoiceBean.getDateTo()) > 0) {
                addFieldError("invoiceBean.dateTo", "La fecha de fin debe ser igual o mayor que la fecha de inicio.");
            }
        }

        System.out.println(invoiceBean.getPrice());
        if (invoiceBean.getPrice() <= 0.0) {
            addFieldError("invoiceBean.price", "El precio debe ser mayor que 0.");
        }
    }
}
