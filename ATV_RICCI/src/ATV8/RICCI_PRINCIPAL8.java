/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV8;
import javax.swing.JOptionPane;


public class RICCI_PRINCIPAL8 {
    public static void main(String[] args) {
        try{
        String nome = JOptionPane.showInputDialog("Digite o Nome do Funcionario: ");
         String cargo = JOptionPane.showInputDialog("Digite o Seu Cargo: ");
          double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario "));
           int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas extras: "));
             RICCI_FUNCIONARIOS funci = new RICCI_FUNCIONARIOS(nome, cargo, salarioBase, horas);
              funci.calcularSalarioTotal();
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "INVALIDO: ");
        }finally{
             JOptionPane.showMessageDialog(null,"PROGRAMA ENCERRADO: ");
            
        }
        


    }
  }
 