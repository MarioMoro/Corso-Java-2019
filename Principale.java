package calendario;


public class Principale {
	public static void main (String [] args) {
		
		Calendario mioCalendario = new Calendario(2019,12);
		
		Mese mioMese = mioCalendario.getMeseCalendario(1);
		
		Giorno mioGiorno = mioMese.getGiornoMese(10);
		
		System.out.println(mioGiorno.getProverbio());

	}

}
