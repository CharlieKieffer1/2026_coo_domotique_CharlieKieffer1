package domotique;

/**
 * classe qui permet de modeliser un variateur de lumiere
 * a adapter pour l'utiliser avec la telecommande 
 *
 */
public class Lumiere {
	
	/**
	 * intensite de la lumiere modulable par le variateur
	 * valeur comprise entre 0 et 100;
	 */
	private int intensite;
	
	/**
	 * constructeur par defaut
	 * un variateur eteint
	 */
	public Lumiere()
	{
		this.intensite=0;
	}

	/**
	 * permet de changer l'intensite du variateur
	 * @param i nouvelle intensite du variateur
	 */
	public void changerIntensite(int i)
	{
		if (i>=0&&i<=100)
		this.intensite=i;		
	}
	
	/**
	 * retourne l'intensite du variateur
	 * @return intensite de la lumiere
	 */
	public int getLumiere()
	{
		return this.intensite;
	}
	
	/**
	 * methode toString, affiche lumiere et la valeur intensite
	 * @return description de l'objet this
	 */
	public String toString()
	{
		return("lumiere: "+intensite);
	}	
}
