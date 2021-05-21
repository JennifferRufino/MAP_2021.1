package test;

import factories.SanduicheFactory;
import models.Ingrediente;
import models.ovos.OvoCapoeira;
import models.ovos.OvoGranja;
import models.paes.PaoBola;
import models.paes.PaoFrances;
import models.paes.PaoIntegral;
import models.presuntos.PresuntoFrango;
import models.presuntos.PresuntoPeru;
import models.queijos.QueijoCheddar;
import models.queijos.QueijoMussarela;
import models.queijos.QueijoPrato;
import models.sanduiches.*;
import models.tomates.TomateCereja;
import models.tomates.TomateItaliano;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Teste {
    private static SanduicheFactory sanduiche;

    @BeforeAll
    public static void setUp() {
        sanduiche = new SanduicheFactory();
    }

    @Test
    public void testGetSanduicheIntegral() {
        Sanduiche sanduicheFactory = sanduiche.getSanduiche(SanduicheTipo.INTEGRAL);
        assertEquals(sanduicheFactory, new SanduicheIntegral());

        assertNotEquals(sanduicheFactory, new SanduicheCheddarNatural());
    }

    @Test
    public void testGetSanduicheCaipira() {
        Sanduiche sanduicheFactory = sanduiche.getSanduiche(SanduicheTipo.CAIPIRA);
        assertEquals(sanduicheFactory, new SanduicheCaipira());

        assertNotEquals(sanduicheFactory, new SanduicheCheddarNatural());

    }

    @Test
    public void testGetSanduicheCheedar() {
        Sanduiche sanduicheFactory = sanduiche.getSanduiche(SanduicheTipo.CHEDDAR_NATURAL);
        assertEquals(sanduicheFactory, new SanduicheCheddarNatural());

        assertNotEquals(sanduicheFactory, new SanduicheCaipira());
    }

    @Test
    public void testGetNome() {
        assertEquals("Pão Bola", new PaoBola().getNome());
        assertEquals("Tomate Italiano", new TomateItaliano().getNome());
    }

    @Test
    public void testGetIngredientesCaipira() {
        assertArrayEquals(new Ingrediente[]{
                new PaoFrances(),
                new QueijoMussarela(),
                new PresuntoFrango(),
                new OvoCapoeira(),
                new TomateItaliano()
        }, sanduiche.getSanduiche(SanduicheTipo.CAIPIRA).getIngredientes());
    }

    @Test
    public void testGetIngredientesIntegral() {
        assertArrayEquals(new Ingrediente[]{
                new PaoIntegral(),
                new QueijoPrato(),
                new PresuntoPeru(),
                new OvoGranja(),
                new TomateCereja()
        }, sanduiche.getSanduiche(SanduicheTipo.INTEGRAL).getIngredientes());
    }

    @Test
    public void testGetIngredientesCheedar() {
        assertArrayEquals(new Ingrediente[]{
                new PaoBola(),
                new QueijoCheddar(),
                new PresuntoFrango(),
                new OvoGranja(),
                new TomateItaliano()
        }, sanduiche.getSanduiche(SanduicheTipo.CHEDDAR_NATURAL).getIngredientes());
    }
}
