package command;


public class Client {

    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("-------Turn on the light Button-----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("------Turn off the light Button----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----Undo Button is Pushed----------");
        remoteController.undoButtonWasPushed();


        System.out.println("");

        TVReceiver tvReceiver = new TVReceiver();

        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("-------Turn On TV Button-----------");
        remoteController.onButtonWasPushed(1);
        System.out.println("------Turn Off TV Button-----------");
        remoteController.offButtonWasPushed(1);
        System.out.println("------Undo Button----------");
        remoteController.undoButtonWasPushed();

    }

}
