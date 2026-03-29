package domotique;

import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi>  hifis;

    public Telecommande(){
        lampes = new  ArrayList<>();
        hifis = new  ArrayList<>();
    }

    public void ajouterLampe(Lampe nouvelleLampe){
        this.lampes.add(nouvelleLampe);
    }

    public void ajouterHifi(Hifi nouvelleHifi){
        this.hifis.add(nouvelleHifi);
    }

    public void activerLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            this.lampes.get(indiceLampe).allumer();
    }

    public void activerHifi(int indiceHifi){
        if(indiceHifi < this.hifis.size())
            this.hifis.get(indiceHifi).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            this.lampes.get(indiceLampe).eteindre();
    }

    public void desactiverHifi(int indiceHifi){
        if (indiceHifi < this.hifis.size())
            this.hifis.get(indiceHifi).eteindre();
    }

    public void activerTout(){
        for (int i = 0; i < this.lampes.size(); i++)
            // reutiliser du code existant
            this.activerLampe(i);
        for (int i = 0; i < this.hifis.size(); i++)
            this.activerHifi(i);
    }

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

    public Lampe getLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            return (this.lampes.get(indiceLampe));
        else
            return(null);
    }

    public Hifi getHifi(int indiceHifi){
        if (indiceHifi < this.hifis.size())
            return (this.hifis.get(indiceHifi));
        else
            return(null);
    }
}
