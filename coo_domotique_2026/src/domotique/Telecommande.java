package domotique;

import java.util.ArrayList;
import java.util.List;

/**
 * classe pour gerer une telecommande universelle
 * @author thomas8
 *
 */
public class Telecommande {

    /**
     * il s'agit desormais d'une liste d'appareil
     * -> il faut changer la classe (a la main)
     * -> il faut changer le nom (refactoring)
     */
    private List<Appareil> appareils;

    /**
     * le construceur bouge un peu
     */
    public Telecommande()
    {
        appareils=new ArrayList<Appareil>();
    }

    /**
     * la methode doit changer puisqu'on ajouter des appareil
     * changer le nom de la methode en refactoring
     *
     * @param p appareil
     */
    public void ajouterAppareil(Appareil p)
    {
        appareils.add(p);
    }

    /**
     * renommer la methode en activerAppareil
     * @param i
     */
    public void activerAppareil(int i)
    {
        appareils.get(i).allumer();
    }


    /**
     * renommer en activerAppareil
     * @param i
     */
    public void desactiverAppareil(int i)
    {
        appareils.get(i).eteindre();
    }


    /**
     * ne change pas
     */
    public void activerTout()
    {
        for (int i=0;i<appareils.size();i++)
            //reutiliser du code existant
            activerAppareil(i);
    }



    /**
     * ne change pas
     * implique de redefinir tostring dans les classes concretes issues de appareil
     */
    public String toString()
    {
        String r="";
        for (int i=0;i<appareils.size();i++)
        {
            r=r+appareils.get(i)+"\n";
        }
        return(r);
    }

    /**
     * retourne le nombre d'appareils
     * @return
     */
    public int getNombre() {
        return this.appareils.size();
    }

}
