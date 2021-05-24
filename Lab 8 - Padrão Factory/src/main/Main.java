package main;

import fabrica.Fabrica;
import sanduiches.Sanduiche;
import sanduiches.SanduicheTipoEnum;

public class Main {

    public static void main(String[] args) {
    	
    	// Para nao precisar instanciar cada classe (SanduicheIntegral, SanduicheCaipira, SanduicheCheddarNatural)
    	// Foi criada uma classe Fabrica que retorna o sanduiche criado a partir de um enum
    	Fabrica fabrica = new Fabrica();

    	// new SanduicheIntegral().criaSanduiche();
    	Sanduiche s1 = fabrica.criaSanduiche(SanduicheTipoEnum.INTEGRAL);
    	System.out.println("Sanduíche integral: " + s1.toString());

        Sanduiche s2 = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);
        System.out.println("Sanduiche cheddar: " +  s2.toString());

        Sanduiche s3 = fabrica.criaSanduiche(SanduicheTipoEnum.CAIPIRA);
        System.out.println("Sanduiche caipira: " + s3.toString());
    }
}