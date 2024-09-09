package ChainOfResponsibility;

public class HandlerRunner {
    public static void main(String[] args) {
        SupportHandler level3 = new Level3Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level1 = new Level1Support();

        level1.setSuccessor(level2);
        level2.setSuccessor(level3);

        String[] requests = {"simple issue", "complex issue", "critical issue", "unknown issue"};

        for (String request : requests) {
            System.out.println("\nRequest: " + request);
            level1.handleRequest(request);
        }
    }
}
