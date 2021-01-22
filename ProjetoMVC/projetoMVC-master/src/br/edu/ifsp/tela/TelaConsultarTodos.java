package br.edu.ifsp.tela;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;


public class TelaConsultarTodos extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
    
    private JTable table;
    private DefaultTableModel defaultModel;
    private JScrollPane scroll;
    private JButton btnConsultar;
  
 
    
    
    public TelaConsultarTodos() {
        criarComponentes();
        configurarJanela();
    }
    
    private void criarComponentes() {
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "CONSULTAR DADOS"));
        
        defaultModel = new DefaultTableModel();
        table = new JTable();
        table.setModel(defaultModel);
        table.setFillsViewportHeight(true);
       
        defaultModel.addColumn("ID");
        defaultModel.addColumn("NOME");
        defaultModel.addColumn("IDADE");
        
        
        scroll = new JScrollPane();
        scroll.setViewportView(table);

        scroll.setPreferredSize(new Dimension(300, 300));
       
        btnConsultar = new JButton("EXIBIR");
        btnConsultar.setBounds(29, 190, 68, 23);
        getContentPane().add(btnConsultar);
        panel.add(btnConsultar);
        panel.add(scroll);
        add(panel);
    }
    
    private void configurarJanela() {
        setVisible(true);

        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}


	public void exibirDados(ActionEvent e) 
	{
		defaultModel.setRowCount(0);
		defaultModel.setNumRows(0);
		
        PessoaDAO pessoaDao = new PessoaDAO();
        List<Pessoa> pessoas = pessoaDao.consultarTodos();
        
        for(Pessoa p: pessoas) 
        {

        	Object[] array = {p.getId(), p.getNome(), p.getIdade()};
        	defaultModel.addRow(array);
        }
        
    }
    

	
}
