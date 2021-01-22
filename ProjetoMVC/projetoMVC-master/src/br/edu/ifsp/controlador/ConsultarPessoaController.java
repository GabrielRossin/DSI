package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.TelaConsultar;

public class ConsultarPessoaController implements ActionListener {

	private TelaConsultar tela;
	private Pessoa resultado;

	public ConsultarPessoaController(TelaConsultar fp) {
		this.tela = fp;
		//resultado = new Pessoa();
		this.tela.getBtnConsultar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnConsultar()) {
			
			
			int i = Integer.parseInt(this.tela.getTxtID().getValue().toString());
			//modelo.setId(i);
		
			PessoaDAO dao = new PessoaDAO();
			resultado = dao.consultarPessoaPorId(i);
			
			tela.getLblNome().setText(resultado.getNome());
			tela.getLbl_Idade().setText(" "+ resultado.getIdade());
			
			//JOptionPane.showMessageDialog(null, "Pessoa alterada com Sucesso");
			
		} 
	}

}