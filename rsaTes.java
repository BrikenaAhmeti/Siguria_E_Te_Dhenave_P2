package keygenerator;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class rsaTes extends JFrame {

	private JPanel contentPane;
	private JTextField txtP;
	private JTextField txtQ;
	private JTextField txtN;
	private JTextField txtPhi;
	private JTextField txtE;
	private JTextField txtD;
	private JTextField txtPublik;
	private JTextField txtPrivat;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rsaTes frame = new rsaTes();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
