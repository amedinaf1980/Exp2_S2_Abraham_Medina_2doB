package bankboston;


import managers.BancoManager;
import utilidades.Grafico;
public class BankBoston {

	public static void main(String[] args) {

		Grafico.formatoSaludo("\n         !!! BIENVENID@S A BANK BOSTON !!!         \n");

		// ************* COMENTAR SI NO QUIERO DATOS AL INICIO *************
        BancoManager.getInstancia().cargarDatosIniciales();
        
		Menu menu = new Menu();
		menu.mostrarMenu();
	}
}