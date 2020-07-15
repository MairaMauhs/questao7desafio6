/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7desafio6;

import javax.swing.JOptionPane;

/**
 *
 * @author AliraMaria
 */
public class Questao7desafio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //somaNega = somaNega + numero;
        
        
        int numero, somaNega;
        somaNega = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um"
                    + " número ou digite 0 (zero) para sair:\n"
                    + "Digite"));
            if (numero != 0) {
                if (numero < 0) {
                    somaNega += numero;

                } else {
                    JOptionPane.showMessageDialog(null, "Números positivos não são"
                            + " contabilizados!!");
                }
            }

        } while (numero != 0);//fim do loop

        JOptionPane.showMessageDialog(null, "A soma dos números negativo é: "
                + somaNega);

    }
    
}
