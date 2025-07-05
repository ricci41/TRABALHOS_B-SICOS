/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV7;

import javax.swing.JOptionPane;

public class RICCI_CALC7 {
    
    private int n;
    
    public void setN(int n){
        this.n = n;
    } 
    public int getN(){
        return this.n;
    }
    public void Fibonacci(){
        int a = 0 , b = 1 , c;
           String resultado = "Sequencia de Fibonacci:" + a + b ;
       
                for (int i = 2; i < n; i++) {
                    c = a + b;
                    resultado += " " + c;
                    a = b;
                    b = c;
        }
                JOptionPane.showMessageDialog(null, resultado);
               
                
    }
}

