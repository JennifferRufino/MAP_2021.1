package sanduiches;

import fabrica.SanduichePadraoFactory;
import ingredientes.ovos.Ovo;
import ingredientes.ovos.OvoGranja;
import ingredientes.paes.Pao;
import ingredientes.paes.PaoBola;
import ingredientes.presuntos.Presunto;
import ingredientes.presuntos.PresuntoPeru;
import ingredientes.queijos.Queijo;
import ingredientes.queijos.QueijoCheddar;
import ingredientes.tomates.Tomate;
import ingredientes.tomates.TomateItaliano;

public class SanduicheCheddarNatural extends SanduichePadraoFactory{

	@Override
    public Pao adicionarPao(String pao) {
        return new PaoBola(pao);
    }

	@Override
    public Ovo adicionarOvo(String ovo) {
        return new OvoGranja(ovo);
    }

	@Override
    public Presunto adicionarPresunto(String presunto) {
        return new PresuntoPeru(presunto);
    }

	@Override
    public Queijo adicionarQueijo(String queijo) {
        return new QueijoCheddar(queijo);
    }
	
	@Override
    public Tomate adicionarTomate(String tomate) {
        return new TomateItaliano(tomate);
    }

	@Override
	public Sanduiche criaSanduiche() {
    	Sanduiche novoSanduiche = new Sanduiche();
    	novoSanduiche.setOvo(adicionarOvo("Granja"));
    	novoSanduiche.setPao(adicionarPao("Pao Bola"));
    	novoSanduiche.setPresunto(adicionarPresunto("Presunto Peru"));
    	novoSanduiche.setQueijo(adicionarQueijo("Cheddar"));
    	novoSanduiche.setTomate(adicionarTomate("Italiano"));
    	
    	return novoSanduiche;
	}

}