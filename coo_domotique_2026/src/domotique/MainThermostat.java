package domotique;

import thermos.Thermostat;




public class MainThermostat {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		
		/****** A COMPLETER ******/
		// TODO Etudiant 
		Lampe l2=new Lampe("Lampe2");
		t.ajouterAppareil(l2);
		
		Hifi hifi=new Hifi();
		t.ajouterAppareil(hifi);
		
		Cheminee lumiere=new Cheminee();
		AdapterCheminee adpt=new AdapterCheminee(lumiere);
		t.ajouterAppareil(adpt);
		
		AdapterThermostat adThermo=new AdapterThermostat(new Thermostat());
		t.ajouterAppareil(adThermo);
		// FinTODO
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);	
	}
	
}
