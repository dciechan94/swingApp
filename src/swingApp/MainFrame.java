package swingApp;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	
	JTextField nameField;
	JTextField occupationField;
	JTextArea textArea;
	JButton okBtn;
	
	public MainFrame() {
		super("Hello World");
		
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		okBtn = new JButton("OK");
		
		textArea = new JTextArea();
		
		
		setLayout(new BorderLayout());
		
		
		add(nameField, BorderLayout.NORTH);
		add(occupationField, BorderLayout.WEST);
		add(textArea, BorderLayout.CENTER);
		add(okBtn, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
