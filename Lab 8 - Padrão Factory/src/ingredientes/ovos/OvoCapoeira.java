package ingredientes.ovos;

public class OvoCapoeira implements  Ovo{

	private String ovoCapoeira;
	
	public OvoCapoeira(String ovoCapoeira) {
		super();
		this.ovoCapoeira = ovoCapoeira;
	}

	public String getOvoCapoeira() {
		return ovoCapoeira;
	}

	public void setOvoCapoeira(String ovoCapoeira) {
		this.ovoCapoeira = ovoCapoeira;
	}

	@Override
	public Ovo adicionarOvo(String ovo) {
		return new OvoCapoeira(ovo);
	}
	
	@Override
	public String toString() {
		return ovoCapoeira;
	}
}