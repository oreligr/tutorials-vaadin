package org.test.views.register;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class RegisterView extends FormLayout implements View {

	private final TextField email = new TextField("Enter Email:");
	private final PasswordField passwd = new PasswordField("Password:");
	private final PasswordField retype = new PasswordField("Retype:");
	private final CheckBox accept = new CheckBox("Iaccept terms and conditions of using Recipe Book.");
	
	public RegisterView(){
		for(Component c: new Component[]{email,passwd,retype,accept}){
			this.addComponent(c);
		}
	}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
