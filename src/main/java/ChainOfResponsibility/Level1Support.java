package ChainOfResponsibility;

public class Level1Support extends SupportHandler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("simple issue")) {
            System.out.println("Level 1 Support: Handling simple issue");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
