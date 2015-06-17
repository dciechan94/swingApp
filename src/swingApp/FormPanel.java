package swingApp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	JLabel nameLabel;
	JLabel occupationLabel;
	JLabel ageLabel;
	JLabel emplLablel;
	JLabel usCitizenLabel;
	JLabel taxIdLabel;
	JLabel genderLabel;
	JTextField nameField;
	JTextField occupationField;
	
	JButton submitBtn;
	
	public FormPanel() {
		nameLabel = new JLabel("Name:");
		occupationLabel = new JLabel("Occupation:");
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		submitBtn = new JButton("Submit");
		ageLabel = new JLabel("Age:");
		emplLablel = new JLabel("Employment:");
		usCitizenLabel = new JLabel("US Citizen:");
		taxIdLabel = new JLabel("Tax ID:");
		genderLabel = new JLabel("Gender:");
		
		setLayout(new GridBagLayout());
		
		Border inner = BorderFactory.createTitledBorder("Form:");
		Border outer = BorderFactory.createEtchedBorder();
		
		setBorder(BorderFactory.createCompoundBorder(outer, inner));
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridy = 0;
		gc.weightx = 1;
		gc.fill = GridBagConstraints.NONE;
		
		// ================== FIRST ROW ==================
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nameField, gc);
		
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 5);
		add(occupationLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gc);
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 5);
		add(ageLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		//add(ageLabel, gc);
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 5);
		add(emplLablel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gc);
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 5);
		add(taxIdLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gc);
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 5);
		add(usCitizenLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gc);
		
		gc.gridy++;
		
		// ================== NEXT ROW ==================
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 5);
		add(genderLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gc);
		
		gc.gridy++;
				
		// ================== NEXT ROW ==================
		gc.weighty = 3;
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(submitBtn, gc);
			
		gc.gridy++;
		// ==============================================
		
	}

}
