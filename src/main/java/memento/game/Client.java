package memento.game;


public class Client {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("Before combating with the Boss");
        gameRole.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("Combating with the Boss~~~~");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();

        System.out.println("After the Boss Combat, recover the state previously...");

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("After recover.....");
        gameRole.display();
    }

}