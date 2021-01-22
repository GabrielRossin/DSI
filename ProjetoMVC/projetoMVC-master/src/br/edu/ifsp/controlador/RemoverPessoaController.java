package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
//import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.TelaRemover;

public class RemoverPessoaController implements ActionListener {

	private TelaRemover tela;
	

	public RemoverPessoaController(TelaRemover fp) {
		this.tela = fp;
		this.tela.getBtnRemover().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnRemover()) {
			
			
			int i = Integer.parseInt(this.tela.getTxtID().getValue().toString());
			PessoaDAO dao = new PessoaDAO();
			dao.removerPessoaPorId(i);
		
			JOptionPane.showMessageDialog(null, "Pessoa removida com Sucesso");
			
		} 
	}

}
