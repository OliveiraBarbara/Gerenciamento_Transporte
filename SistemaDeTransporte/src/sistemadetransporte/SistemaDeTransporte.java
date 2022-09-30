/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadetransporte;


import telas.Login;

/**
 *
 * @author barbara
 */
public class SistemaDeTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        criarGUI();
    }
    public static void criarGUI() {

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Login().setVisible(true);
	    }
	});
    }
}
