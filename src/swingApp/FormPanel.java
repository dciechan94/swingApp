package swingApp;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel {
	
	JTextField nameField;
	JTextField occupationField;
	
	public FormPanel() {
		
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		
		setLayout(new BorderLayout());
		
		
		
		add(nameField, BorderLayout.NORTH);
		add(occupationField, BorderLayout.SOUTH);
		
	}

}
