/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV12;

import javax.swing.JOptionPane;
public class RICCI_PRINCIPAL12 {
    public static void main(String[] args) {
        try {
            String nomeCliente = JOptionPane.showInputDialog("Digite o Seu Nome: ");
            int numQuarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Quarto: "));
            double dias = Double.parseDouble(JOptionPane.showInputDialog("Digite os Dias q Vai Ficar:"));
            double preco_diaria = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco Da Diaria: "));
            RESERVAHOTEL37104RICCI reserva = new RESERVAHOTEL37104RICCI(nomeCliente, numQuarto, numQuarto, preco_diaria);
            JOptionPane.showMessageDialog(null, 
                    "Nome:" +  nomeCliente + 
                    "Numero do Seu Quarto" + numQuarto + 
                    "Quantos Dias vc vai Ficar: " + dias + 
                    "Qual foi preco da sua diaria" + preco_diaria
                    );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"entrada invalida");
        } finally {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
        }
    }
    
}
