package domotique;

public class AdapterCheminee implements Appareil {

	/**
	 * l'objet qu'on adapte
	 */
	private Cheminee chemineeAControler;

	public AdapterCheminee(Cheminee origine) {
		this.chemineeAControler = origine;
	}

	
	@Override
	public void allumer() {
		this.chemineeAControler.changerIntensite(this.chemineeAControler.getIntensite()+10);
	}

	@Override
	public void eteindre() {
		this.chemineeAControler.changerIntensite(0);
	}

	
	public String toString()
	{
		return(""+chemineeAControler.toString());
	}
}
