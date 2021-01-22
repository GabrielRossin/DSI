package br.edu.ifsp.tela;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaConsultar extends JFrame {
	
	private JSpinner txtID;
	private JButton btnConsultar;
	private JLabel lbl_Idade;
	private JLabel lblNome;

	
	public TelaConsultar() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 31, 79, 29);
		getContentPane().add(lblNewLabel);
		
		txtID = new JSpinner();
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtID.setBounds(89, 31, 104, 29);
		getContentPane().add(txtID);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 84, 79, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IDADE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(21, 134, 62, 20);
		getContentPane().add(lblNewLabel_2);
		
		
		lblNome = new JLabel("");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(89, 87, 302, 20);
		getContentPane().add(lblNome);
		
		lbl_Idade = new JLabel("");
		lbl_Idade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_Idade.setBounds(89, 133, 104, 29);
		getContentPane().add(lbl_Idade);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConsultar.setBounds(136, 193, 135, 29);
		getContentPane().add(btnConsultar);
		
		
		
	}


	public JSpinner getTxtID() {
		return txtID;
	}


	public void setTxtID(JSpinner txtID) {
		this.txtID = txtID;
	}


	public JButton getBtnConsultar() {
		return btnConsultar;
	}


	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}


	public JLabel getLbl_Idade() {
		return lbl_Idade;
	}


	public void setLbl_Idade(JLabel lbl_Idade) {
		this.lbl_Idade = lbl_Idade;
	}


	public JLabel getLblNome() {
		return lblNome;
	}


	public void setLblNome(JLabel lblNome) {
		this.lblNome = lblNome;
	}
	
	


	
	
	
}
