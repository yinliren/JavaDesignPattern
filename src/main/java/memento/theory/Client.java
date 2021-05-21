package memento.theory;


import java.util.ArrayList;
import java.util.HashMap;

public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1, Attack: 100");

        caretaker.add(originator.saveStateMemento());

        originator.setState("State #2, Attack: 80");

        caretaker.add(originator.saveStateMemento());

        originator.setState("State #3, Attack: 50");
        caretaker.add(originator.saveStateMemento());

        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("Recovering the state back to #1........");
        System.out.println("Current State: " + originator.getState());

    }
}
