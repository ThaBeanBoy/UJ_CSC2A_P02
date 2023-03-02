import accse.csc2a.Message;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Message(
                "English",
                "This is my english message",
                Message.Planet.Earth,
                Message.Planet.Mars
        );

        System.out.printf("Language: %s", Message.getPlanetString(m1.getSourcePlanet()));
    }
}