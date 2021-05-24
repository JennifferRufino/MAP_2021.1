package sanduiches;

import fabrica.SanduichePadraoFactory;
import ingredientes.ovos.Ovo;
import ingredientes.ovos.OvoCapoeira;
import ingredientes.paes.Pao;
import ingredientes.paes.PaoFrances;
import ingredientes.presuntos.Presunto;
import ingredientes.presuntos.PresuntoFrango;
import ingredientes.queijos.Queijo;
import ingredientes.queijos.QueijoMussarela;
import ingredientes.tomates.Tomate;
import ingredientes.tomates.TomateCereja;


public class SanduicheCaipira extends SanduichePadraoFactory {
    
	@Override
	public Pao adicionarPao(String pao) {
        return new PaoFrances(pao);
    }

	@Override
    public Ovo adicionarOvo(String ovo) {
        return new OvoCapoeira(ovo);
    }

	@Override
    public Presunto adicionarPresunto(String presunto) {
        return new PresuntoFrango(presunto);
    }

	@Override
    public Queijo adicionarQueijo(String queijo) {
        return new QueijoMussarela(queijo);
    }

	@Override
    public Tomate adicionarTomate(String tomate) {
        return new TomateCereja(tomate);
    }

    @Override
    public Sanduiche criaSanduiche(){
    	Sanduiche novoSanduiche = new Sanduiche();
    	novoSanduiche.setOvo(adicionarOvo("Capoeira"));
    	novoSanduiche.setPao(adicionarPao("Pao Francês"));
    	novoSanduiche.setPresunto(adicionarPresunto("Presunto Frango"));
    	novoSanduiche.setQueijo(adicionarQueijo("Mussarela"));
    	novoSanduiche.setTomate(adicionarTomate("Cereja"));
    	
    	return novoSanduiche;
    }
}