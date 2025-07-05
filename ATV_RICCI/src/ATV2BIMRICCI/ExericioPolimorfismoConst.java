/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV2BIMRICCI;

public class ExericioPolimorfismoConst {
    private int dia;
    private double bruto;
    private String carga;
         
    
    
    public ExericioPolimorfismoConst(int dia,double bruto,String carga){
        this.dia = dia;
        this.carga= carga;
        this.bruto = bruto;
                
    }
    public double valeR(){
        if (carga.equalsIgnoreCase("I")) {
            return 500;
        } else if (carga.equalsIgnoreCase("P")) {
                return 250;
        }
        return 0;
        }
            
    public double adicional(){
        return SalarioLiquido() * 0.30;
    }
    
    public double valeT(){
        return dia * 15;
    }
    public double SalarioLiquido(){
        return bruto - (bruto * 1.4);
    }
    
}
