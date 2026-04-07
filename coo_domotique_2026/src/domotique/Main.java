package domotique;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();


		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);

		/****** A COMPLETER ******/
		// TODO Etudiant
		Lampe l2=new Lampe("Lampe2");
		t.ajouterAppareil(l2);

		Lampe l3=new Lampe("Lampe3");
		t.ajouterAppareil(l3);

		Hifi hifi=new Hifi();
		t.ajouterAppareil(hifi);

		Lumiere lumiere=new Lumiere();
		AdapterLumiere adpt=new AdapterLumiere(lumiere);
		t.ajouterAppareil(adpt);
		// FinTODO

		TelecommandeGraphique tg=new TelecommandeGraphique(t);



	}

}
