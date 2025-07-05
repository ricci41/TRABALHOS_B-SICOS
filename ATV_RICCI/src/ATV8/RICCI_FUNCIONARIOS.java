/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATV8;
import javax.swing.JOptionPane;

public class RICCI_FUNCIONARIOS {
    private String nome;
    private String cargo;
    private double salarioBase;
    private int horas;
    private double salariototal;
    
    public RICCI_FUNCIONARIOS(String nome,String cargo , double salarioBase,int horas){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horas = horas ;
    }
    public void calcularSalarioTotal(){
        salariototal = salarioBase + (horas * 20);
        JOptionPane.showMessageDialog(null,
                "Nome:" + nome +
                "\nCargo" + cargo +
                "\nSalario Base" + salarioBase +
                "\nHoras Extras" + horas +
                "\nSalario Total" + salariototal
                );
        
    }
            
            

}
