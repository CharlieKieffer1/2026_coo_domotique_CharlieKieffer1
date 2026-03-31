package domotique;

import java.util.ArrayList;

public class Telecommande {

    /**
     * @lampes : liste des lampes de la télécommande
     */
    private ArrayList<Lampe> lampes;

    /**
     * @hifis : liste des hifis de la télécommande
     */
    private ArrayList<Hifi>  hifis;

    /**
     * @construstor class télécommande
     */
    public Telecommande(){
        lampes = new  ArrayList<>();
        hifis = new  ArrayList<>();
    }

    /**
     * Ajout d'une lampe dans lampes
     * @param nouvelleLampe
     */
    public void ajouterLampe(Lampe nouvelleLampe){
        this.lampes.add(nouvelleLampe);
    }

    /**
     * Ajout d'une hifi dans hifis
     * @param nouvelleHifi
     */
    public void ajouterHifi(Hifi nouvelleHifi){
        this.hifis.add(nouvelleHifi);
    }

    /**
     * Active la lampe à l'indice indiceLampe dans lampes
     * @param indiceLampe
     */
    public void activerLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            this.lampes.get(indiceLampe).allumer();
    }

    /**
     * Active l'Hifi à l'indice IndiceHifi dans hifis
     * @param indiceHifi
     */
    public void activerHifi(int indiceHifi){
        if(indiceHifi < this.hifis.size())
            this.hifis.get(indiceHifi).allumer();
    }

    /**
     * Désactive la lampe à l'indice indiceLampe dans lampes
     * @param indiceLampe
     */
    public void desactiverLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            this.lampes.get(indiceLampe).eteindre();
    }

    /**
     * Désactive l'Hifi à l'indice IndiceHifi dans hifis
     * @param indiceHifi
     */
    public void desactiverHifi(int indiceHifi){
        if (indiceHifi < this.hifis.size())
            this.hifis.get(indiceHifi).eteindre();
    }

    /**
     * Active toutes les lampes et tout les hifis
     */
    public void activerTout(){
        for (int i = 0; i < this.lampes.size(); i++)
            // reutiliser du code existant
            this.activerLampe(i);
        for (int i = 0; i < this.hifis.size(); i++)
            this.activerHifi(i);
    }

    /**
     *
     * @return la description de la télécommande
     */
    public String toString(){
        String descriptif = "";
        for (int i = 0; i < this.lampes.size(); i++) {
            descriptif += i + "-" + this.lampes.get(i) + "\n";
        }
        for (int i = 0; i < this.hifis.size(); i++) {
            descriptif += i + "-" + this.hifis.get(i) + "\n";
        }
        return (descriptif);
    }

    /**
     * Retourne la lampe à l'indice indiceLampe dans lampes
     * @param indiceLampe
     * @return Retourne la lampe à l'indice indiceLampe dans lampes
     */
    public Lampe getLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            return (this.lampes.get(indiceLampe));
        else
            return(null);
    }

    /**
     * Retourne l'Hifi à l'indide indiceHifi dans hifis
     * @param indiceHifi
     * @return Retourne l'Hifi à l'indide indiceHifi dans hifis 
     */
    public Hifi getHifi(int indiceHifi){
        if (indiceHifi < this.hifis.size())
            return (this.hifis.get(indiceHifi));
        else
            return(null);
    }
}
