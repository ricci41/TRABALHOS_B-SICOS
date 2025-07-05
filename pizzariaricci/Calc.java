package pizza_heitorpazote_carlos;

import imposto_heitorpazote.*;

public class Calc {
    public double inss(double SalB){
        
    double INSS;
            if (SalB<1693.72){
                INSS=SalB*0.08;
                return INSS;
}
            if (SalB>1693.73 && SalB<2822.90){
                INSS=SalB*0.09;
                return INSS;
}
            else{
                INSS=SalB*0.11;
                return INSS;
}
            
    }
    public double ImpRenda (double SalB, double INSS) {
        
        double IR;
            if(SalB<1787.77){
                IR=0;
                 return IR;
            }
            if(SalB>1787.78 && SalB<2679.29){
                IR=((SalB-INSS) * 0.075)-134.08;
                 return IR;
    }
             if(SalB>2679.30 && SalB<3572.43){
                IR=((SalB-INSS) * 0.15)-335.03;
                 return IR;
             }
             if(SalB>3572.44 && SalB<4463.80){
                IR=((SalB-INSS) * 0.225)-602.96;
                 return IR;
             }
             if(SalB>4463.81){
                IR=((SalB-INSS) * 0.275)-826.15;
                 return IR;
             }
        return 0;
            
}
    public double SalLiq (double SalB, double INSS, double IR) {
        double SalL = SalB - INSS - IR;
                return SalL;
    }
}


