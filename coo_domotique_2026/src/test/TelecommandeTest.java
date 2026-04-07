package test;

import static org.junit.Assert.*;

import domotique.Lampe;
import domotique.Telecommande;
import domotique.Appareil;
import org.junit.Test;

/**
 * classe qui permet de tester telecommande
 */
public class TelecommandeTest {

    /**
     * verifie qu'on peut ajouter une lampe
     */
    @Test
    public void testAjouter() {
        Telecommande telecommande=new Telecommande();
        Lampe nouvelleLampe = new Lampe("test");
        telecommande.ajouterAppareil(nouvelleLampe);
    }

    /**
     * verifie qu'on peut ajouter une lampe
     */
    @Test
    public void testVide() {
        Telecommande telecommande=new Telecommande();
    }

    /**
     * verifie qu'on peut allumer une lampe
     */
    @Test
    public void testAllumer() {
        Telecommande telecommande=new Telecommande();
        telecommande.ajouterAppareil(new Lampe("test"));
        telecommande.activerAppareil(0);
    }

    /**
     * verifie qu'on peut allumer une lampe hors du tableau
     */
    @Test
    public void testAllumerHorsTableau() {
        Telecommande telecommande=new Telecommande();
        telecommande.ajouterAppareil(new Lampe("test"));
    }


}
