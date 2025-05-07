package task02;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(1L, "ACTIVE", 1234567890L, "Ivan", "Jackson", "ivan@example.com", "Saint-Petersburg", "+7-123-456-78-90");
        String filename = "client.ser"
        ClientSaver.saveClient(client, filename);
        Client loadedClient = ClientLoader.loadClient(filename);
        System.out.println("Загруженный клиент: " + loadedClient);
    }
}