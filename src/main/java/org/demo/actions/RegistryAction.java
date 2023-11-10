package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
public class RegistryAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        setMessage(getText(MESSAGE));
        setFormTittleMessage(getText(TITTLE_FORM_MESSAGE));
        return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "hello.message";
    public static final String TITTLE_FORM_MESSAGE = "form.tittle.message";

    /**
     * Field for Message property.
     */
    private String message;
    private String formTittleMessage;

    public String getFormTittleMessage() {
        return formTittleMessage;
    }

    public void setFormTittleMessage(String formTittleMessage) {
        this.formTittleMessage = formTittleMessage;
    }

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
