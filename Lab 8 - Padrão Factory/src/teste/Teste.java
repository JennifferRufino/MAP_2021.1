package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ingredientes.paes.*;
import ingredientes.presuntos.*;
import ingredientes.queijos.*;
import ingredientes.tomates.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fabrica.Fabrica;
import ingredientes.ovos.*;
import sanduiches.*;

public class Teste {
	
	private Fabrica fabrica;
	
	@BeforeEach
	void setUp() {
		fabrica = new Fabrica();		
	}
	
    @Test
    void testGetSanduicheIntegral() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.INTEGRAL);

        assertEquals(sanduiche.toString(), new SanduicheIntegral().criaSanduiche().toString());

        assertNotEquals(sanduiche.toString(), new SanduicheCheddarNatural().criaSanduiche().toString());
    }

    @Test
    void testGetSanduicheCaipira() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CAIPIRA);

        assertEquals(sanduiche.toString(), new SanduicheCaipira().criaSanduiche().toString());

        assertNotEquals(sanduiche.toString(), new SanduicheCheddarNatural().criaSanduiche().toString());
    }

    @Test
    void testGetSanduicheCheddarNatural() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);

        assertEquals(sanduiche.toString(), new SanduicheCheddarNatural().criaSanduiche().toString());

        assertNotEquals(sanduiche.toString(), new SanduicheCaipira().criaSanduiche().toString());
    }


    @Test
    void testOvoCapoeiraSanduicheIntegral() {
    	Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.INTEGRAL);

    	assertTrue(sanduiche.getOvo() instanceof OvoCapoeira);
    }
    
    @Test
    void testOvoGranjaSanduicheCheddar() {
    	Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);

    	assertTrue(sanduiche.getOvo() instanceof OvoGranja);
    }
    
    @Test
    void testOvoGranjaSanduicheCaipira() {
    	Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);

    	assertTrue(sanduiche.getOvo() instanceof OvoGranja);
    }
    
    @Test
    void testPaoIntegral() {
    	Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.INTEGRAL);

    	assertTrue(sanduiche.getPao() instanceof PaoIntegral);
    }

    @Test
    void testPaoBola() {
	    Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);

        assertTrue(sanduiche.getPao() instanceof PaoBola);
    }

    @Test
    void testPaoFrances() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CAIPIRA);

        assertTrue(sanduiche.getPao() instanceof PaoFrances);
    }

    @Test
    void testTomateCerejaSanduicheIntegral() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.INTEGRAL);

        assertTrue(sanduiche.getTomate() instanceof TomateCereja);
    }


    @Test
    void testTomateItaliano() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);

        assertTrue(sanduiche.getTomate() instanceof TomateItaliano);
    }

    @Test
    void testTomateCerejaSanduicheCaipira() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CAIPIRA);

        assertTrue(sanduiche.getTomate() instanceof TomateCereja);
    }

    @Test
    void testPresuntoFrango() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CAIPIRA);

        assertTrue(sanduiche.getPresunto() instanceof PresuntoFrango);
    }

    @Test
    void testPresuntoPeruSanduicheCheedarNatural() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);

        assertTrue(sanduiche.getPresunto() instanceof PresuntoPeru);
    }

    @Test
    void testPresuntoPeruSanduicheIntegral() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.INTEGRAL);

        assertTrue(sanduiche.getPresunto() instanceof PresuntoPeru);
    }

    @Test
    void testQueijoCheddar() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CHEDDAR_NATURAL);

        assertTrue(sanduiche.getQueijo() instanceof QueijoCheddar);
    }

    @Test
    void testQueijoPrato() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.INTEGRAL);

        assertTrue(sanduiche.getQueijo() instanceof QueijoPrato);
    }

    @Test
    void testQueijoMussarela() {
        Sanduiche sanduiche = fabrica.criaSanduiche(SanduicheTipoEnum.CAIPIRA);

        assertTrue(sanduiche.getQueijo() instanceof QueijoMussarela);
    }

}
