package edu.br.ifsp.main;
import br.edu.ifsp.tela.TelaPrincipal;


public class ConexaoInsert {

	public static void main(String[] args)  {
		

		
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
            public void run() 
            {
    			TelaPrincipal tp = new TelaPrincipal();
    			tp.setVisible(true);
            }
        });
			
		
	}

}
