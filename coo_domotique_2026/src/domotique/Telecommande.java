package domotique;

import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande(){
        lampes = new  ArrayList<>();
    }

    public void ajouterLampe(Lampe nouvelleLampe){
        this.lampes.add(nouvelleLampe);
    }

    public void activerLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            this.lampes.get(indiceLampe).eteindre();
    }

    public void activerTout(){
        for (int i = 0; i < this.lampes.size(); i++)
            // reutiliser du code existant
            this.activerLampe(i);
    }

    public String toString(){
        String descriptif = "";
        for (int i = 0; i < this.lampes.size(); i++) {
            descriptif += i + "-" + this.lampes.get(i) + "\n";
        }
        return (descriptif);
    }

    public Lampe getLampe(int indiceLampe){
        if (indiceLampe < this.lampes.size())
            return (this.lampes.get(indiceLampe));
        else
            return(null);
    }
}
