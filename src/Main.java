import accse.csc2a.Message;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Message(
                "English",
                "This is my english message",
                Message.Planet.Earth,
                Message.Planet.Mars
        );

        System.out.printf(
                //String
                """
                        ID                 : %s
                        Language           : %s
                        Message            : %s
                        Source Planet      : %s
                        Destination Planet : %s""",

                //passing
                m1.getID(),
                m1.getLanguage(),
                m1.getMessage(),
                Message.getPlanetString(m1.getSourcePlanet()),
                Message.getPlanetString(m1.getDestinationPlanet())
        );
    }
}