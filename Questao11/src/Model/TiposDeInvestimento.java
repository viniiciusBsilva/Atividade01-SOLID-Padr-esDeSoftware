package Model;

import java.util.Random;

public class TiposDeInvestimento {

    public double conservador(double valor){
        return valor*0.008;
    }
    public double moderado(double valor){
        Random gerador = new Random();
        if (gerador.nextDouble(101)>50){
            return valor*0.025;
        }else {
            return valor*0.07;
        }
    }
    public double arrojado(double valor){
        Random gerador = new Random();
        double porcentagemGerada = gerador.nextDouble(101);
        if(porcentagemGerada>50){
            return valor * 0.006;
        } else if (porcentagemGerada<30&&porcentagemGerada>20) {
            return valor * 0.03;
        }
        return valor * 0.05;
    }

}
