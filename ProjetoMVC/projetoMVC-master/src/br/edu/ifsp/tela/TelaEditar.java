package br.edu.ifsp.tela;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class TelaEditar extends JFrame {

	public JTextField txtNome;
	public JButton btnEditar;
	private JSpinner txtIdade;
	private JSpinner txtID;


	public TelaEditar() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOVO NOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(27, 26, 144, 33);
		getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(197, 34, 191, 23);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NOVA IDADE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(27, 82, 115, 33);
		getContentPane().add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("BUSCAR POR ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(27, 155, 144, 23);
		getContentPane().add(lblNewLabel_2);
		
		txtIdade = new JSpinner();
		txtIdade.setModel(new SpinnerNumberModel(1, 1, 200, 1));
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtIdade.setBounds(197, 92, 136, 23);
		getContentPane().add(txtIdade);
		
		txtID = new JSpinner();
		txtID.setModel(new SpinnerNumberModel(1, 1, 5000, 1));
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtID.setBounds(197, 160, 136, 23);
		getContentPane().add(txtID);
		
		
		

		
		btnEditar = new JButton("EDITAR");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEditar.setBounds(144, 204, 122, 33);
		getContentPane().add(btnEditar);
		
		
		
		
	}



	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JSpinner getTxtIdade() {
		return txtIdade;
	}

	public void setTxtIdade(JSpinner txtIdade) {
		this.txtIdade = txtIdade;
	}

	public JSpinner getTxtID() {
		return txtID;
	}

	public void setTxtID(JSpinner txtID) {
		this.txtID = txtID;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	

	
	
	
	
	
	
}
