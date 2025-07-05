/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV12;

import javax.swing.JOptionPane;
public class RESERVAHOTEL37104RICCI {
    private String nomeCliente;
    private int numQuarto;
    private int dias;
    private double preco_diaria;
    

    public RESERVAHOTEL37104RICCI(String nomeCliente ,int numQuarto, int dias, double preco_diaria){
        this.dias = dias;
        this.nomeCliente = nomeCliente;
        this.numQuarto = numQuarto;
        this.preco_diaria = preco_diaria;
    }
    public double calcularTotal(){
        return dias * preco_diaria;
        
    }
    public String nomeCliente(){
        return nomeCliente;
    }
        
        
    

    
}
        
