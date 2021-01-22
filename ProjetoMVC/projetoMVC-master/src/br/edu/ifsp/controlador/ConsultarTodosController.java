package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.edu.ifsp.tela.TelaConsultarTodos;

public class ConsultarTodosController implements ActionListener {

	private TelaConsultarTodos tela;

	public ConsultarTodosController(TelaConsultarTodos fp) {
		this.tela = fp;
		this.tela.getBtnConsultar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnConsultar()) {
			tela.exibirDados(e);
			
		} 
	}

}
