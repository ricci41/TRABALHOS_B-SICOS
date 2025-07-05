/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV10;

import javax.swing.JOptionPane;

public class PRODUTO {
    private String nome;
    private double preco;
    private int quant;
   
    
    public PRODUTO(String nome ,  double preco, int quant, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
        
    }
      
    public void adi_Est (int qtd){
        this.quant += qtd;
        JOptionPane.showInputDialog(
                "1. Nome " + nome + 
                "2. Preco " + preco +
                "3. Quantidade no Estoque " + quant
        );
        }
          public void re_Est (int qtd){
              if (qtd <= quant) {
                  this.quant -= qtd; 
                  JOptionPane.showMessageDialog(null,
                "3. REMOVER :Quantidade no Estoque" + 
                        "Estoque Novo Sera De :" + quant );
              } else {
                  JOptionPane.showMessageDialog(null, "A quantidade que Tenta remover eh maior q a quantidade do Estoque;");
              }
    } 
          public String toString(){
              return
                     "Produto" + nome + 
                     "Preco:R$" + preco +
                     "Quantidade:" + quant;
                 
                      
                      
          }
    
}
