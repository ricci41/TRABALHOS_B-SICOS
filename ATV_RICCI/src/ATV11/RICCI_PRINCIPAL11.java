/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV11;
import javax.swing.JOptionPane;
public class RICCI_PRINCIPAL11 {
    public static void main(String[] args) {
        
        
        try {
            String modelo = JOptionPane.showInputDialog("Digite o modelo do Seu Carro: ");
            double capacidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a Capacidade Dele: "));
            double consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite o Consumo do Veiculo: "));
            VEICULO37104RICCI veiculo = new VEICULO37104RICCI(modelo, capacidade, consumo);
            double autonomia = veiculo.calcularAutonomia();
            
            JOptionPane.showMessageDialog(null,"Modelo: " + veiculo.modelo() + "Autonomia:" + autonomia + "Kilometros:");
            
            
        } catch (Exception erro) {
             JOptionPane.showMessageDialog(null, "Entrada Invalida");
        }finally{
             JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
        }
    }
    
}
