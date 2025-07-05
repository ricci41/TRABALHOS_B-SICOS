/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV7;
import javax.swing.JOptionPane;


public class RICCI_PRINCIPAL7 {
    public static void main(String[] args) {
         RICCI_CALC7 objCalc = new RICCI_CALC7();
           int valor;
           
           try{
               valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Valor Desejado: "));
               objCalc.setN(valor);
               objCalc.Fibonacci();
           }catch(Exception erro){
               JOptionPane.showMessageDialog(null, "INVALIDO: ");
           }finally{
               JOptionPane.showMessageDialog(null,"PROGRAMA ENCERRADO: ");
               
       }
    }
}
    
    

