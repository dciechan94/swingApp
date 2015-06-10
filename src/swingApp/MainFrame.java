package swingApp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	
	FormPanel formPanel;
	JTextArea textArea;
	JButton okBtn;
	
	public MainFrame() {
		super("Hello World");
		
		
		okBtn = new JButton("OK");
		textArea = new JTextArea();
		formPanel = new FormPanel();
		
		
		setLayout(new BorderLayout());
		
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Button Clicked\n");
				
			}
		});
		
		
		add(textArea, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		add(okBtn, BorderLayout.SOUTH);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
