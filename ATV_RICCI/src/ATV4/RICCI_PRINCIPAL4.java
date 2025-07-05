/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV4;

import javax.swing.JOptionPane;
public class RICCI_PRINCIPAL4 {
    public static void main(String[] args) {
      RICCI_CALC4 conta = new RICCI_CALC4();
        int op;
        double va;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "== Menu == \n" + 
                    "1 . Deposite\n" + 
                    "2 . Sacar\n" + 
                    "3 . Consultar Saldo\n" + 
                    "4 . Sair \n" + 
                    " Escolha Uma Opcao: " 
            ));
            
            switch (op) {
                case 1 :
                    va = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar:"));
                    conta.depositar(va);
                    break;
                
                case 2 :
                    va = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar:"));
                    conta.sacar(va);  
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, " Saldo Atual ====: " + conta.getSaldo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Saindo Do Sistema!====");
                    break;

                
                    
               
            }
        } while ( op != 4);
    }
    
}


