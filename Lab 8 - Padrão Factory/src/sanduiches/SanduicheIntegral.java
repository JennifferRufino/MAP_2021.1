package sanduiches;

import fabrica.SanduichePadraoFactory;
import ingredientes.ovos.Ovo;
import ingredientes.ovos.OvoCapoeira;
import ingredientes.paes.Pao;
import ingredientes.paes.PaoIntegral;
import ingredientes.presuntos.Presunto;
import ingredientes.presuntos.PresuntoPeru;
import ingredientes.queijos.Queijo;
import ingredientes.queijos.QueijoPrato;
import ingredientes.tomates.Tomate;
import ingredientes.tomates.TomateCereja;

public class SanduicheIntegral extends SanduichePadraoFactory {
	
	
	@Override
    public Pao adicionarPao(String pao) {
        return new PaoIntegral(pao);
    }

	@Override
    public Ovo adicionarOvo(String ovo) {
        return new OvoCapoeira(ovo);
    }

	@Override
    public Presunto adicionarPresunto(String presunto) {
        return new PresuntoPeru(presunto);
    }

	@Override
    public Queijo adicionarQueijo(String queijo) {
        return new QueijoPrato(queijo);
    }

	@Override
    public Tomate adicionarTomate(String tomate) {
        return new TomateCereja(tomate);
    }
	

	@Override
	public Sanduiche criaSanduiche() {
    	Sanduiche novoSanduiche = new Sanduiche();
    	novoSanduiche.setOvo(adicionarOvo("Capoeira"));
    	novoSanduiche.setPao(adicionarPao("Pão Integral"));
    	novoSanduiche.setPresunto(adicionarPresunto("Presunto Peru"));
    	novoSanduiche.setQueijo(adicionarQueijo("Queijo Prato"));
    	novoSanduiche.setTomate(adicionarTomate("Cereja"));
    	
    	return novoSanduiche;
	}
}