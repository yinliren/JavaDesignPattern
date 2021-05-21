package memento.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Caretaker {

    //If only save one state
    private Memento  memento;

    // If wish to save multiple states
    //private ArrayList<Memento> mementos;

    // If wish to save multiple characters in the game and save multiple states
    //private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }


}
