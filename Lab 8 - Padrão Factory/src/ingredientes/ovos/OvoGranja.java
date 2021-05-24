package ingredientes.ovos;

public class OvoGranja implements Ovo{
	
	private String ovoGranja;

    public OvoGranja(String ovoGranja) {
        this.ovoGranja = ovoGranja;
    }

    public String getOvoGranja() {
		return ovoGranja;
	}

	public void setOvoGranja(String ovoGranja) {
		this.ovoGranja = ovoGranja;
	}

	@Override
    public Ovo adicionarOvo(String ovoGranja) {
        return new OvoGranja(ovoGranja);
    }
	
	@Override
	public String toString() {
		return ovoGranja;
	}
    
    

}