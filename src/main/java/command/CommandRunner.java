package command;

public class CommandRunner {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOffLight = new TurnOffLight(light);
        Command turnOnLight = new TurnOnLight(light);

        RemoteInvoker invoker = new RemoteInvoker();
        invoker.setCommand(turnOffLight);
        invoker.pressButton();

        invoker.setCommand(turnOnLight);
        invoker.pressButton();
    }
}
