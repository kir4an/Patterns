package ChainOfResponsibility;

public class Level2Support extends SupportHandler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("complex issue")) {
            System.out.println("Level 2 Support: Handling complex issue");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}