package calendario;

public class Mese {
	private String nomeMese;
	private int numeroMese;
	private int numeroGiorni;
	private Giorno giorniMese[];
	
	Mese (String nomeMese, int numeroMese, int numeroGiorni) {
		this.nomeMese = nomeMese;
		this.numeroMese = numeroMese;
		this.numeroGiorni = numeroGiorni;
		
		this.giorniMese = new Giorno[this.numeroGiorni];
		
		for (int i=0; i<this.numeroGiorni; i++) {
			giorniMese[i] = new Giorno(i, "Rosso di sera bel tempo si spera "+i);
		}	
	}

	public String getNomeMese() {
		return nomeMese;
	}

	public void setNomeMese(String nomeMese) {
		this.nomeMese = nomeMese;
	}

	public int getNumeroMese() {
		return numeroMese;
	}

	public void setNumeroMese(int numeroMese) {
		this.numeroMese = numeroMese;
	}

	public int getNumeroGiorni() {
		return numeroGiorni;
	}

	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}

	public Giorno[] getGiorniMese() {
		return giorniMese;
	}
	
	public Giorno getGiornoMese(int giornoMese) {
		return giorniMese[giornoMese];
	}

	public void setGiorniMese(Giorno[] giorniMese) {
		this.giorniMese = giorniMese;
	}
}
