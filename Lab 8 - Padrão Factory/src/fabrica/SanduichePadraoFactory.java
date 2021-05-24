package fabrica;

import ingredientes.ovos.Ovo;
import ingredientes.paes.Pao;
import ingredientes.presuntos.Presunto;
import ingredientes.queijos.Queijo;
import ingredientes.tomates.Tomate;
import sanduiches.Sanduiche;

public abstract class SanduichePadraoFactory {
    public abstract Pao adicionarPao(String pao);

    public abstract Ovo adicionarOvo(String ovo);

    public abstract Presunto adicionarPresunto(String presunto);

    public abstract Queijo adicionarQueijo(String queijo);

    public abstract Tomate adicionarTomate(String tomate);
    
    public abstract Sanduiche criaSanduiche();

}