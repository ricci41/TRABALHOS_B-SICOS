/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV6;
import javax.swing.JOptionPane;


public class RICCI_PRINCIPAL6 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Da Sua Compra: "));
        RICCI_CALC6 calculo = new RICCI_CALC6(valor);
        
        int op = Integer.parseInt(JOptionPane.showInputDialog(
                "Selecione Aqui Sua Forma de Pagamento:\n" + 
                "1. A vista [10% de Desconto]\n" + 
                "2. Cartao em 2x [ Sem Desconto]\n" + 
                "3. Cartao em 3x ou Mais [5% de bonus]\n"
        ));
        switch (op) {
            case 1:
                calculo.vista();
                JOptionPane.showMessageDialog(null, "TOTAL COM DESCONTO " + calculo.getTotal());
                break;
            case 2:
                double parcela2 = calculo.getTotal() / 2 ;
                calculo.par2x();
                JOptionPane.showMessageDialog(null, "TOTAL SEM DESCONTO " +  calculo.getTotal());
                break;
                case 3:
                    calculo.par3x();
                    int vezes = Integer.parseInt(JOptionPane.showInputDialog("O Numero de Parcelas [No Minimo 3 delas]"));
                    if (vezes >= 3){
                        double par = calculo.getTotal() / vezes;
                        JOptionPane.showMessageDialog(null, vezes + "R$" + par + "Total: R$" + calculo.getTotal());
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Parcelas so Funcionam com Mais de Tres Esta Invalido");
                        
                    }
                    
                break;
            default:
                JOptionPane.showMessageDialog(null,"INVALIDO");
                
                break;
                
        }
                
        
       
    }
}
