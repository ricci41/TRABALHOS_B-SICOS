/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV9;
import javax.swing.JOptionPane;

public class RICCI_PRINCIPAL9 {
    public static void main(String[] args) {
       
        try{
           double valorReais = Double.parseDouble(JOptionPane.showInputDialog("Digite Quanto Voce Quer Converter: "));
           CONVERSOR conv = new CONVERSOR();
        }catch (Exception erro){
             JOptionPane.showMessageDialog(null, "INVALIDO: ");
        }finally{
            JOptionPane.showMessageDialog(null,"PROGRAMA ENCERRADO: ");
    
        }
    }
}