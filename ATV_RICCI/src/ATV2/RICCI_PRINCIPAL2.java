/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV2;
import javax.swing.JOptionPane;

public class RICCI_PRINCIPAL2 {
    public static void main(String[] args) {
        RICCI_CALC2 objSenha = new RICCI_CALC2();
        int cont = 0;
        do{
            String tentativa = JOptionPane.showInputDialog(null,"DIGITE A SENHA: ");
            cont++;
                    
                    if(tentativa.equals(objSenha.getSenha())){
                        JOptionPane.showMessageDialog(null, "Senha CORRETA!!  LIBERADO!! ");
                        cont = 4;
                    } else {
                        JOptionPane.showMessageDialog(null, "SENHA INCORRETA: ");
                    }
                    
                    if(cont == 3){
                        JOptionPane.showMessageDialog(null, "ACESSO BLOQUEADO: ");
                    }
                    
        }while (cont < 3);
        
    }
    
}
       
        
          
                
                    
             
        
    

    

