/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV5;
import javax.swing.JOptionPane;


public class RICCI_PRINCIPAL5 {
    public static void main(String[] args) {
        RICCI_CALC5 adivinho = new RICCI_CALC5();
        int numero = adivinho.getSecreto();
        int tentativas = 1;
        int palpite = -1;
        
        while(palpite != numero){
           palpite = Integer.parseInt(JOptionPane.showInputDialog("Tentativa " + tentativas + "Advinhe o numero de 1 a 100:  "));
                
        
        if(palpite < numero ){
            JOptionPane.showMessageDialog(null, "O numero eh Maior");
        } else if (palpite > numero){
            JOptionPane.showMessageDialog(null, "O numero eh Menor");
        } else {
            JOptionPane.showMessageDialog(null, "Acertou!!");
        }
        palpite ++;   
       }
    }
}
