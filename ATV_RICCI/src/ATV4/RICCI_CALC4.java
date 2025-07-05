/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV4;

import javax.swing.JOptionPane;


public class RICCI_CALC4 {
    private double sa;
    
    public RICCI_CALC4(){
        this.sa = 1000.00;
    }
    public void depositar(double va){
        if (va > 0) {
            sa += va;
            JOptionPane.showMessageDialog(null, "Deposito Foi Feito: \\nSaldo atual: R$ " + sa );
            
        }else{
       JOptionPane.showMessageDialog(null, "Valor Invalido");
    }
    }
    public void sacar(double va){
        if (va > 0 && va <= sa) {
            sa -= va;
            JOptionPane.showMessageDialog(null, "Saque Realizado:\nSaldo Atual: R$" + sa);
        }else{
       JOptionPane.showMessageDialog(null, "Valor Invalido");
    }
    }
    public double getSaldo(){
        return sa;
    }
}

