/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV6;
import javax.swing.JOptionPane;

public class RICCI_CALC6 {
    private double valor;
    private double total;
    
    public RICCI_CALC6(double valor){

        this.valor = valor;
    }
    public void vista(){
        total =  valor * 0.90;
    }
    public void par2x(){
        total = valor;
    }
    public void par3x(){
        total = valor * 1.05;
    }
    public double getTotal(){
        return total;
    }
    
   
}
