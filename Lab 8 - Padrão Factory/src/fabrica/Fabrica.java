package fabrica;

import java.util.HashMap;
import java.util.Map;

import sanduiches.Sanduiche;
import sanduiches.SanduicheCaipira;
import sanduiches.SanduicheCheddarNatural;
import sanduiches.SanduicheIntegral;
import sanduiches.SanduicheTipoEnum;

public class Fabrica {
	
	private Map<SanduicheTipoEnum, SanduichePadraoFactory> fabricasConcretas;
	
	public Fabrica() {
		fabricasConcretas = new HashMap<>();
		fabricasConcretas.put(SanduicheTipoEnum.INTEGRAL, new SanduicheIntegral());
		fabricasConcretas.put(SanduicheTipoEnum.CHEDDAR_NATURAL, new SanduicheCheddarNatural());
		fabricasConcretas.put(SanduicheTipoEnum.CAIPIRA, new SanduicheCaipira());
	}
	
	public Sanduiche criaSanduiche(SanduicheTipoEnum sanduicheTipo) {
		// Vai retornar uma extensão da classe factory (integral, cheddar ou caipira)
		//Tipo.INTEGRAL
		SanduichePadraoFactory fabrica= fabricasConcretas.get(sanduicheTipo);
		return fabrica.criaSanduiche();
	}

}
