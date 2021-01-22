package br.edu.ifsp.tela;



import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class TelaRemover extends JFrame {

	
	private  JSpinner txtID;
	private JButton btnRemover;


	public TelaRemover() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 111, 122, 36);
		getContentPane().add(lblNewLabel);
		
		txtID = new JSpinner();
		txtID.setModel(new SpinnerNumberModel(1, 1, 5000, 1));
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtID.setBounds(100, 117, 105, 24);
		getContentPane().add(txtID);
		
		btnRemover = new JButton("REMOVER");
		btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRemover.setBounds(141, 178, 142, 36);
		getContentPane().add(btnRemover);
	}


	public JSpinner getTxtID() {
		return txtID;
	}


	public void setTxtID(JSpinner txtID) {
		this.txtID = txtID;
	}


	public JButton getBtnRemover() {
		return btnRemover;
	}


	public void setBtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}
	
	
}
