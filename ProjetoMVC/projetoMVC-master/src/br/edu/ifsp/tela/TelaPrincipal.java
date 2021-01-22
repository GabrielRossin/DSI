package br.edu.ifsp.tela;

//import java.awt.BorderLayout;



//import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.edu.ifsp.controlador.ConsultarPessoaController;
import br.edu.ifsp.controlador.ConsultarTodosController;
import br.edu.ifsp.controlador.EditarPessoaController;
import br.edu.ifsp.controlador.InserePessoaController;
import br.edu.ifsp.controlador.RemoverPessoaController;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktop;
	public TelaPrincipal() {
		
		 desktop = new JDesktopPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		
		JMenuItem menu_Listar = new JMenuItem("ADICIONAR");
		 menu_Listar.addActionListener(this::abrirADD);
		mnNewMenu.add(menu_Listar);
		
		JMenuItem menu_Editor = new JMenuItem("EDITAR");
		menu_Editor.addActionListener(this:: abirEditar );
		mnNewMenu.add(menu_Editor);
		
		JMenuItem menu_remover = new JMenuItem("REMOVER");
		menu_remover.addActionListener(this:: abirRemover );
		mnNewMenu.add(menu_remover);
		
		JMenuItem menu_consultar = new JMenuItem("CONSULTAR");
		menu_consultar.addActionListener(this:: abirConsultar );
		mnNewMenu.add(menu_consultar);
		
		JMenuItem menu_consultarTd = new JMenuItem("CONSULTAR TODOS");
		menu_consultarTd.addActionListener(this:: abirConsultarTd );
		mnNewMenu.add(menu_consultarTd);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().add(desktop);
		
	}
	
	 private void carregarJanelaADD(JFrame janela1)

	 {
	        
		 	janela1.setVisible(true);
		 	//desktop.add(janela1);
	        //desktop.moveToFront(janela1);
	        
	 }
	
	 private void abrirADD(ActionEvent e) 
	 {
	        TelaADD tela_add = new TelaADD();
	        InserePessoaController ipc = new InserePessoaController(tela_add);
	        carregarJanelaADD(tela_add);
	  }
	 
	 
	 private void carregarJanelaEditar(JFrame janela2)
	 {
	        
		 	janela2.setVisible(true);
		 	
	        
	 }
	 
	 
	 private void abirEditar(ActionEvent e) 
	 {
	        TelaEditar tela_editar = new TelaEditar();
	        EditarPessoaController epc = new EditarPessoaController(tela_editar);
	        carregarJanelaEditar(tela_editar);
	  }
	 
	 
	
	 private void carregarJanelaRemover(JFrame janela3)
	 {
	        
		 	janela3.setVisible(true);
		 	
	        
	 }
	 
	 
	 private void abirRemover(ActionEvent e) 
	 {
	        TelaRemover tela_remover = new TelaRemover();
	        RemoverPessoaController rpc = new RemoverPessoaController(tela_remover);
	       carregarJanelaRemover(tela_remover);
	 }
	 
	 private void carregarJanelaConsultar(JFrame janela4)
	 {
	        
		 	janela4.setVisible(true);
		
	        
	 }
	 
	 
	 private void abirConsultar(ActionEvent e) 
	 {
	        TelaConsultar tela_consultar = new TelaConsultar();
	        ConsultarPessoaController cpc = new ConsultarPessoaController(tela_consultar);
	       carregarJanelaConsultar(tela_consultar);
	 }
	 
	 private void carregarJanelaConsultarTodos(JFrame janela4)
	 {
	        
		 	janela4.setVisible(true);
		 	
	        
	 }
	 
	 
	 private void abirConsultarTd(ActionEvent e) 
	 {
	        TelaConsultarTodos tela_consultar_todos = new TelaConsultarTodos();
	        ConsultarTodosController cpc = new ConsultarTodosController(tela_consultar_todos);
	       carregarJanelaConsultarTodos(tela_consultar_todos);
	 }
}
