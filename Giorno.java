package calendario;

public class Giorno {
	private int numeroGiorno;
	private String proverbio;
	
	Giorno (int numeroGiorno, String proverbio) {
		this.numeroGiorno = numeroGiorno;
		this.proverbio = proverbio;
	}

	public int getNumeroGiorno() {
		return numeroGiorno;
	}

	public void setNumeroGiorno(int numeroGiorno) {
		this.numeroGiorno = numeroGiorno;
	}

	public String getProverbio() {
		return proverbio;
	}

	public void setProverbio(String proverbio) {
		this.proverbio = proverbio;
	}
	
	

}
