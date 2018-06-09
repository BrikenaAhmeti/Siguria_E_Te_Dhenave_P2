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
boolean isPrime(int n) 
        {
            //kontrollojm nese numri i dhene modul me 2 eshte 0(atehere eshte qift)
            if (n%2==0 && n > 2) return false;
            //nese eshte tek atehere fillojm te kerkoj nese ka plotpjestues(nese eshte prim)
            for(int i=3;i*i<=n;i+=2) {
                if(n%i==0)
                    return false;
            }
            return true;
        }
public rsaTes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtP = new JTextField();
		txtP.setBounds(137, 29, 475, 26);
		contentPane.add(txtP);
		txtP.setColumns(10);
		
		JLabel lblP = new JLabel("Numri p:");
		lblP.setBounds(24, 32, 98, 20);
		contentPane.add(lblP);
	
		txtQ = new JTextField();
		txtQ.setColumns(10);
		txtQ.setBounds(137, 93, 475, 26);
		contentPane.add(txtQ);
		
		JLabel lblq = new JLabel("Numri q:");
		lblq.setBounds(24, 96, 78, 20);
		contentPane.add(lblq);
		
		txtN = new JTextField();
		txtN.setColumns(10);
		txtN.setBounds(129, 219, 475, 26);
		contentPane.add(txtN);
		
		JLabel lblN = new JLabel("Numri N:");
		lblN.setBounds(24, 225, 78, 14);
		contentPane.add(lblN);
		
		JLabel lblPhi = new JLabel("Numri phi:");
		lblPhi.setBounds(24, 275, 78, 20);
		contentPane.add(lblPhi);
		
		txtPhi = new JTextField();
		txtPhi.setColumns(10);
		txtPhi.setBounds(129, 272, 475, 26);
		contentPane.add(txtPhi);
		
		JLabel lblE = new JLabel("Numri e:");
		lblE.setBounds(24, 339, 78, 14);
		contentPane.add(lblE);
		
		txtE = new JTextField();
		txtE.setColumns(10);
		txtE.setBounds(129, 333, 475, 26);
		contentPane.add(txtE);
		
		JLabel lblD = new JLabel("Numri d:");
		lblD.setBounds(24, 393, 104, 20);
		contentPane.add(lblD);
		
		txtD = new JTextField();
		txtD.setColumns(10);
		txtD.setBounds(129, 390, 475, 26);
		contentPane.add(txtD);
	
	       JLabel lblPublic = new JLabel("Celesi publik:");
		lblPublic.setBounds(10, 496, 105, 20);
		contentPane.add(lblPublic);
		
		txtPublik = new JTextField();
		txtPublik.setColumns(10);
		txtPublik.setBounds(131, 493, 473, 26);
		contentPane.add(txtPublik);
		
		JLabel lblPrivat = new JLabel("Celesi privat:");
		lblPrivat.setBounds(10, 547, 118, 20);
		contentPane.add(lblPrivat);
		
		txtPrivat = new JTextField();
		txtPrivat.setColumns(10);
		txtPrivat.setBounds(131, 544, 473, 26);
		contentPane.add(txtPrivat);
		
