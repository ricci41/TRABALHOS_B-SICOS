/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV2BIMRICCI;
/*FACA UM PROGRAMA QUE SOLICITE AO USUARIO O TIPO DE FUNCIONARIO:
1 administrativo (salario liquido + vale refeição)
2 – professor (salario liquido + adicional)
3 – terceirizado (salario liquido + vale transporte + vale refeição)
 Vale refeicção
De acordo com a carga horaria do funcionário
(i – integral – R$500  / p – meio período – R$ 250)
Adicional
30% do salario liquido
Vale transporte 
Por dia trabalhado adiciona R$15 ao salario liquido
Salario liquido : salario bruto descontado 14% de inss

*/
import javax.swing.JOptionPane;

public class RICCI_PRINCIPAL2BIM {
    public static void main(String[] args) {
        try {
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Seu Salario"));
            String carga = JOptionPane.showInputDialog("Digite a Sua Carga Horaria");
            int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite os Dias que Voce Trabalha"));
            
            int cargo;
            cargo =  Integer.parseInt(JOptionPane.showInputDialog(
            "=MENU="
                    + "1. Admnistrativo"
                    + "2. Professor"
                    + "3. Terceirizado"
                    + "=Escolha Uma Opção="
                    
            ));
            ExericioPolimorfismoConst func = new ExericioPolimorfismoConst(dias, salario, carga);
            double salarioLiquido = func.SalarioLiquido();
            double salarioTotal = 0.0;
             if (cargo == 1){
             salarioTotal = salarioLiquido + func.SalarioLiquido();
                
            } else if (cargo == 2) {
                   salarioTotal = salarioLiquido + func.adicional();
            } else if (cargo == 3){
                double valer = func.valeR();
                        double valet = func.valeT();
                       
                     salarioTotal = salarioLiquido + valer + valet;
                     
                     } else {
                JOptionPane.showMessageDialog(null, "INVALIDO");
                return;
            }
             JOptionPane.showMessageDialog(null, 
                     "Salario Liquido: R$" + salarioLiquido +
                             "Salario Total : R$" + salarioTotal
                     
                     );
           
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "inVALIDO");
            
        } finally{
            
        }
        
    }
    
}
