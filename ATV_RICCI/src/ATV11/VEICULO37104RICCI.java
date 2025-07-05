/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV11;

import javax.swing.JOptionPane;

public class VEICULO37104RICCI {
    private String modelo;
    private double capacidade;
    private double consumo;
   
    
   
public VEICULO37104RICCI(String modelo, double capacidade, double consumo){
    this.capacidade = capacidade;
    this.consumo = consumo;
    this.modelo = modelo;
}
public double calcularAutonomia(){
    return capacidade * consumo;
    
}
public String modelo(){
    return modelo;
}
    
    
}
