package chainOfResponsibility;

public abstract class SupportHandler {
    protected SupportHandler successor;

    public void setSuccessor(SupportHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}
