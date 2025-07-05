/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV10;

import javax.swing.JOptionPane;

public class RICCI_PRINCIPAL10 {
    public static void main(String[] args) {
      try{
          String produto = JOptionPane.showInputDialog("Digite O Nome do Produto: ");
          double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco do Produto: "));
          int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite A Quantidade: "));
          int op; 
          PRODUTO prod = new PRODUTO(produto,preco,quant,0);
          do{
              op = Integer.parseInt(JOptionPane.showInputDialog(
                      "== MENU ==" +
                      "1. Adicionar ao Estoque" +
                      "2. Remover do Estoque" + 
                      "3. Ver Produto" +
                      "4. Sair" + 
                      "Escolha a Opcao ai:"
              
              
              ));
              switch (op) {
                  case 1:
                       int add = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade que Deseja adicionar: "));
                  prod.adi_Est(add);
                      break;
                  case 2:
                       int rem = Integer.parseInt(JOptionPane.showInputDialog("Quanto quer Remover"));
                  prod.re_Est(rem);
                      
                      break;
                  case 3:
                        JOptionPane.showMessageDialog(null, prod.toString());
                      break;
                  case 4:
                        JOptionPane.showMessageDialog(null, "Opcao Invalida");
                          
                       break;
              }
                           
          } while (op != 4);
          
      } catch(Exception erro) {
          JOptionPane.showMessageDialog(null, "Entrada Invalida");
          
      } finally{
          JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
          
      }
        
    }
    
}
