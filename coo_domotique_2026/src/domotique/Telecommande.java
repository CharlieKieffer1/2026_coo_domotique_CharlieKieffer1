package domotique;

import java.util.ArrayList;
import java.util.List;

/**
 * classe pour gerer une telecommande universelle
 *
 */
public class Telecommande {

    /**
     * il s'agit desormais d'une liste d'appareils -> il faut changer la classe
     * (a la main) -> il faut changer le nom (refactoring)
     */
    private List<Appareil> appareils;

    /**
     * le construceur bouge un peu
     */
    public Telecommande() {
        appareils = new ArrayList<Appareil>();
    }

    /**
     * la methode doit changer puisqu'on ajouter des appareil changer le nom de
     * la methode en refactoring
     *
     * @param p
     *            appareil a ajouter
     */
    public void ajouterAppareil(Appareil p) {
        appareils.add(p);
    }

    /**
     * renommer la methode en activerAppareil
     *
     * @param i
     *            indice de l'appareil a modifier
     */
    public void activerAppareil(int i) {
        try {
            appareils.get(i).allumer();
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Hors liste, on ne fait rien");
        }

    }

    /**
     * renommer en activerAppareil
     *
     * @param i
     *            indice de l'appareil a desactiver
     */
    public void desactiverAppareil(int i) {
        appareils.get(i).eteindre();
    }

    /**
     * ne change pas
     */
    public void activerTout() {
        for (int i = 0; i < appareils.size(); i++)
            // reutiliser du code existant
            activerAppareil(i);
    }

    /**
     * ne change pas implique de redefinir tostring dans les classes concretes
     * issues de appareil
     */
    public String toString() {
        String r = "";
        for (int i = 0; i < appareils.size(); i++) {
            r = r + appareils.get(i) + "\n";
        }
        return (r);
    }

    /**
     *
     * @param i
     * @return l'appareil à l'indice i
     */
    public Appareil getAppareil(int i) {
        return appareils.get(i);
    }

    /**
     *
     * @return la liste d'appareils
     */
    public List<Appareil> getAppareils() {
        return appareils;
    }

}
