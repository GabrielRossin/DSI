package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.TelaEditar;

public class EditarPessoaController implements ActionListener {

	private TelaEditar tela;
	private Pessoa modelo;

	public EditarPessoaController(TelaEditar fp) {
		this.tela = fp;
		modelo = new Pessoa();
		this.tela.getBtnEditar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnEditar()) {
			
			modelo.setNome(this.tela.getTxtNome().getText());
			modelo.setIdade(Integer.parseInt(this.tela.getTxtIdade().getValue().toString()));
			int i = Integer.parseInt(this.tela.getTxtID().getValue().toString());
			modelo.setId(i);
		
			PessoaDAO dao = new PessoaDAO();
			dao.editarPessoaPorId(i , modelo);
		
			JOptionPane.showMessageDialog(null, "Pessoa alterada com Sucesso");
			
		} 
	}

}
