package domotique;

public class AdapterLumiere implements Appareil {

	/**
	 * l'objet qu'on adapte
	 */
	private Lumiere lumiereAControler;

	public AdapterLumiere(Lumiere origine) {
		this.lumiereAControler = origine;
	}

	
	@Override
	public void allumer() {
		int lumiere = this.lumiereAControler.getLumiere() + 10;
		this.lumiereAControler.changerIntensite(lumiere);
	}

	@Override
	public void eteindre() {
		this.lumiereAControler.changerIntensite(0);
	}

	
	public String toString()
	{
		return(""+lumiereAControler);
	}
}
