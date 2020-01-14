package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class MainWindow {

	private JFrame frame;
	private JTextField AddressOwnertextField;
	private JTextField OwnerNametextField_1;
	private JTextField BoatNametextField;
	private JTextField WeightTextField;
	private JTextField AreaSailtextField;
	private JTextField HorsePowertextField;
	private JTextField LocationSizetextField;
	private JTextField BoatLocationNametextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(179, 106, 5, 5);
		frame.getContentPane().add(tabbedPane);
		
		
		JPanel jPanel = new JPanel();
		tabbedPane.addTab("Boat", null, jPanel, null);
		jPanel.setLayout(null);
		
		JLabel lblNameOwner = new JLabel("Owner Name :");
		lblNameOwner.setBounds(13, 9, 104, 20);
		lblNameOwner.setHorizontalAlignment(SwingConstants.TRAILING);
		jPanel.add(lblNameOwner);
		
		OwnerNametextField_1 = new JTextField();
		OwnerNametextField_1.setBounds(122, 6, 146, 26);
		jPanel.add(OwnerNametextField_1);
		OwnerNametextField_1.setColumns(10);
		
		JLabel lblOwnerAddressLabel = new JLabel("Owner Address :");
		lblOwnerAddressLabel.setBounds(273, 9, 120, 20);
		jPanel.add(lblOwnerAddressLabel);
		
		AddressOwnertextField = new JTextField();
		AddressOwnertextField.setBounds(398, 6, 146, 26);
		jPanel.add(AddressOwnertextField);
		AddressOwnertextField.setColumns(10);
		
		JButton AddOwnerBtn = new JButton("ADD");
		AddOwnerBtn.setBounds(549, 5, 65, 29);
		AddOwnerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jPanel.add(AddOwnerBtn);
		
		JLabel lblNewLabel = new JLabel("Boat Name : ");
		lblNewLabel.setBounds(23, 45, 93, 20);
		jPanel.add(lblNewLabel);
		
		BoatNametextField = new JTextField();
		BoatNametextField.setBounds(122, 42, 146, 26);
		jPanel.add(BoatNametextField);
		BoatNametextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Weight Name : ");
		lblNewLabel_1.setBounds(283, 45, 110, 20);
		jPanel.add(lblNewLabel_1);
		
		WeightTextField = new JTextField();
		WeightTextField.setBounds(398, 45, 146, 26);
		jPanel.add(WeightTextField);
		WeightTextField.setColumns(10);
		
		JRadioButton rdbtnSailboat = new JRadioButton("SailBoat");
		rdbtnSailboat.setBounds(13, 83, 104, 29);
		jPanel.add(rdbtnSailboat);
		
		JRadioButton rdbtnMotorboat = new JRadioButton("MotorBoat");
		rdbtnMotorboat.setBounds(273, 83, 120, 29);
		jPanel.add(rdbtnMotorboat);
		
		AreaSailtextField = new JTextField();
		AreaSailtextField.setBounds(122, 84, 146, 26);
		jPanel.add(AreaSailtextField);
		AreaSailtextField.setColumns(10);
		
		HorsePowertextField = new JTextField();
		HorsePowertextField.setBounds(398, 87, 146, 26);
		jPanel.add(HorsePowertextField);
		HorsePowertextField.setColumns(10);
		
		JPanel LocationPanel = new JPanel();
		tabbedPane.addTab("Location", null, LocationPanel, null);
		LocationPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(308, 5, 10, 10);
		LocationPanel.add(panel);
		
		JLabel lblLocationSize = new JLabel("Location Size : ");
		lblLocationSize.setBounds(36, 16, 108, 20);
		LocationPanel.add(lblLocationSize);
		
		LocationSizetextField = new JTextField();
		LocationSizetextField.setBounds(147, 13, 146, 26);
		LocationPanel.add(LocationSizetextField);
		LocationSizetextField.setColumns(10);
		
		JLabel lblBoatName = new JLabel("Boat Name : ");
		lblBoatName.setBounds(308, 16, 93, 20);
		LocationPanel.add(lblBoatName);
		
		BoatLocationNametextField = new JTextField();
		BoatLocationNametextField.setBounds(416, 13, 146, 26);
		LocationPanel.add(BoatLocationNametextField);
		BoatLocationNametextField.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(569, 12, 90, 29);
		LocationPanel.add(btnAdd);
	}
}
