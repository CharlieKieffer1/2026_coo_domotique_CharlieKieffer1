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
        assertEquals("il devrait y avoir une lampe",telecommande.getAppareil(0),nouvelleLampe);
    }

    /**
     * verifie qu'on peut ajouter une lampe
     */
    @Test
    public void testVide() {
        Telecommande telecommande=new Telecommande();
        assertEquals("il ne devrait y avoir rien",telecommande.getAppareils().size(),0);
    }

    /**
     * verifie qu'on peut allumer une lampe
     */
    @Test
    public void testAllumer() {
        Telecommande telecommande=new Telecommande();
        telecommande.ajouterAppareil(new Lampe("test"));
        telecommande.activerAppareil(0);
        Lampe lampe = (Lampe) telecommande.getAppareil(0);
        boolean lampeAllumee = lampe.isAllume();
        assertTrue("la lampe devrait etre allumee",lampeAllumee);
    }

    /**
     * verifie qu'on peut allumer une lampe hors du tableau
     */
    @Test
    public void testAllumerHorsTableau() {
        Telecommande telecommande=new Telecommande();
        telecommande.ajouterAppareil(new Lampe("test"));
        telecommande.activerAppareil(1);
        Lampe lampe = (Lampe) telecommande.getAppareil(0);
        boolean lampeAllumee = lampe.isAllume();
        assertTrue("la lampe devrait rester eteinte",!lampeAllumee);
    }


}
