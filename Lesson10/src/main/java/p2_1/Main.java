package p2_1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.getMessenger().sendMessage();
        client.getMessenger().getMessage();

        Smartphone smartphone = new Smartphone();
        smartphone.getApplication().info();
    }
}
