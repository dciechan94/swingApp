package swingApp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	JLabel nameLabel;
	JLabel occupationLabel;
	JTextField nameField;
	JTextField occupationField;
	
	JButton submitBtn;
	
	public FormPanel() {
		nameLabel = new JLabel("Name:");
		occupationLabel = new JLabel("Occupation:");
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		submitBtn = new JButton("Submit");
		
		setLayout(new GridBagLayout());
		
		Border inner = BorderFactory.createTitledBorder("Form:");
		Border outer = BorderFactory.createEtchedBorder();
		
		setBorder(BorderFactory.createCompoundBorder(outer, inner));
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		// ================== FIRST ROW ==================
		gc.gridx = 0;
		add(nameLabel, gc);
		
		gc.gridx = 1;
		add(nameField, gc);
		
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
		gc.gridx = 0;
		add(occupationLabel, gc);
		
		gc.gridx = 1;
		add(occupationField, gc);
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
			
		gc.gridx = 1;
		add(submitBtn, gc);
			
		gc.gridy++;
		// ==============================================
		
	}

}
