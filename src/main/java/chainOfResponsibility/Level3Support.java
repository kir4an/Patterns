package chainOfResponsibility;

public class Level3Support extends SupportHandler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("critical issue")) {
            System.out.println("Level 3 Support: Handling critical issue");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
