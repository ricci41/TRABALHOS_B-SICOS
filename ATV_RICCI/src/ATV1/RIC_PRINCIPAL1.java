/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV1;

import javax.swing.JOptionPane;

public class RIC_PRINCIPAL1 {
    public static void main (String[] args) {
           int valor;
           try{
               valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Valor Desejado: "));
               RICCI_CALC objCalc = new RICCI_CALC();
               objCalc.setBase(valor);
               
               for (int i = 0; i < 10; i++) {
                   System.out.println(objCalc.getBase()+ "X" + i + "=" + objCalc.Multiplica(i));
              
          }
                 
           }catch(Exception erro){
               JOptionPane.showMessageDialog(null, "INVALIDO: ");
           }finally{
               JOptionPane.showMessageDialog(null,"PROGRAMA ENCERRADO: ");
               
       }
    }
}
