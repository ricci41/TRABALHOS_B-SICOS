/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV3;

import javax.swing.JOptionPane;

public class RICCI_PRINCIPAL3 {
    public static void main(String[] args) {
        int numero;
                numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO : "));
                
                    if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Erro! Digite um número positivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
                       int fatorial = RICCI_CALC3.FAT(numero);


      
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);

                
    }
    
}
