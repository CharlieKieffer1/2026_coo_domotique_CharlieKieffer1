package domotique;

/**
 * Main qui ajoute des Appareils distincts
 *
 */
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();

		//ajoute trois lampes
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		Lampe l2=new Lampe("Lampe2");
		t.ajouterAppareil(l2);
		Lampe l3=new Lampe("Lampe3");
		t.ajouterAppareil(l3);

		//ajoute Hifi
		Hifi hifi=new Hifi();
		t.ajouterAppareil(hifi);

		t.activerAppareil(1);
		t.activerAppareil(3);
		t.activerAppareil(3);
		t.activerAppareil(3);
		System.out.println(t);
		t.desactiverAppareil(3);
		System.out.println(t);


	}

}
