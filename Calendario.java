package calendario;

public class Calendario {
	private int anno;
	private boolean bisestile;
	private int numeroMesi;
	private Mese mesiCalendario[];
	
	Calendario (int anno, int numeroMesi) {
		
		this.anno = anno;
		if (anno%4 == 0) this.bisestile = false;
		else this.bisestile = true;
		
		this.numeroMesi=numeroMesi;
		
		mesiCalendario = new Mese[this.numeroMesi];
		
		for (int i=0; i<numeroMesi; i++) {
			switch (i) {
				case 0:
					mesiCalendario[i] = new Mese("Gennaio", i+1, 31);
					break;
				case 1:
					if (this.bisestile=false) mesiCalendario[i] = new Mese("Febbraio", i+1, 28);
					else mesiCalendario[i] = new Mese("Febbraio", i+1, 29);
					break;
				case 2:
					mesiCalendario[i] = new Mese("Marzo", i+1, 31);
					break;
				case 3:
					mesiCalendario[i] = new Mese("Aprile", i+1, 30);
					break;
				case 4:
					mesiCalendario[i] = new Mese("Maggio", i+1, 31);
					break;
				case 5:
					mesiCalendario[i] = new Mese("Giugno", i+1, 30);
					break;
				case 6:
					mesiCalendario[i] = new Mese("Luglio", i+1, 31);
					break;
				case 7:
					mesiCalendario[i] = new Mese("Agosto", i+1, 31);
					break;
				case 8:
					mesiCalendario[i] = new Mese("Settembre", i+1, 30);
					break;
				case 9:
					mesiCalendario[i] = new Mese("Ottobre", i+1, 31);
					break;
				case 10:
					mesiCalendario[i] = new Mese("Novembre", i+1, 30);
					break;
				case 11:
					mesiCalendario[i] = new Mese("Dicembre", i+1, 31);
					break;
			}	
		}
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getNumeroMesi() {
		return numeroMesi;
	}

	public void setNumeroMesi(int numeroMesi) {
		this.numeroMesi = numeroMesi;
	}

	public Mese[] getMesiCalendario() {
		return mesiCalendario;
	}
	
	public Mese getMeseCalendario(int numeroMese) {
		return mesiCalendario[numeroMese];
	}

	public void setMesiCalendario(Mese[] mesiCalendario) {
		this.mesiCalendario = mesiCalendario;
	}

	
	

}
