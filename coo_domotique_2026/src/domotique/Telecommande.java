package domotique;

import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande(){
        lampes = new  ArrayList<>();
    }

    public void ajouterLampe(Lampe nouvelleLampe){
        throw new Error("code non écrit");
    }

    public void activerLampe(int indiceLampe){
        throw new Error("code non écrit");
    }

    public void desactiverLampe(int indiceLampe){
        throw new Error("code non écrit");
    }

    public void activerTout(){
        throw new Error("code non écrit");
    }

    public String toString(){
        throw new Error("code non écrit");
    }

    public Lampe getLampe(int indiceLampe){
        throw new Error("code non écrit");
    }
}
