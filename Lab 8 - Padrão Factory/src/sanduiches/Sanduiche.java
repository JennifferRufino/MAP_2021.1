package sanduiches;

import ingredientes.ovos.Ovo;
import ingredientes.paes.Pao;
import ingredientes.presuntos.Presunto;
import ingredientes.queijos.Queijo;
import ingredientes.tomates.Tomate;

public class Sanduiche {

    private Pao pao;
    private Ovo ovo;
    private Presunto presunto;
    private Queijo queijo;
    private Tomate tomate;

    public Sanduiche() {
    }

    public Pao getPao() {
        return pao;
    }

    public void setPao(Pao pao) {
        this.pao = pao;
    }

    public Ovo getOvo() {
        return ovo;
    }

    public void setOvo(Ovo ovo) {
        this.ovo = ovo;
    }

    public Presunto getPresunto() {
        return presunto;
    }

	public Queijo getQueijo() {
		return queijo;
	}

	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}

	public Tomate getTomate() {
		return tomate;
	}

	public void setTomate(Tomate tomate) {
		this.tomate = tomate;
	}

	public void setPresunto(Presunto presunto) {
		this.presunto = presunto;
	}

	@Override
	public String toString() {
		return "[pao=" + pao + ", ovo=" + ovo + ", presunto=" + presunto + ", queijo=" + queijo + ", tomate="
				+ tomate + "]";
	}

}