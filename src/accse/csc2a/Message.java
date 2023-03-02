package accse.csc2a;

import accse.csc2a.ID_Generator;
public class Message{
    private static int MessageNo = 0;

    public static enum Planet {
        Mercury,
        Venus,
        Earth,
        Mars,
        Jupiter,
        Saturn,
        Uranus,
        Neptune,
        Pluto
    };

    public String ID;
    private String Language;
    private String Message;
    private Planet SourcePlanet;
    private Planet DestinationPlanet;

    public static String DEFAULT_LANGUAGE = "Eng";
    public static String DEFAULT_MESSAGE = "Hello World";
    public static Planet DEFAULT_SOURCE_PLANET = Planet.Earth;
    public static Planet DEFAULT_DESTINATION_PLANET = Planet.Mars;

    //CONSTRUCTORS
    public Message(){
        this.init(
                DEFAULT_LANGUAGE,
                DEFAULT_MESSAGE,
                DEFAULT_SOURCE_PLANET,
                DEFAULT_DESTINATION_PLANET
        );
    }

    public Message(String Language, String Message, Planet SourcePlanet, Planet DestinationPlanet){
        this.init(Language, Message, SourcePlanet, DestinationPlanet);
    }

    //PUBLIC METHODS
    public final String getID(){ return this.ID; }
    public final String getLanguage(){ return this.Language; }
    public final String getMessage() { return this.Message; }
    public final Planet getSourcePlanet() {return this.SourcePlanet; }
    public final Planet getDestinationPlanet() { return this.DestinationPlanet; }


    //UTILITY FUNCTIONS
    private void init(String Language, String Message, Planet SourcePlanet, Planet DestinationPlanet){
        //Setting properties
        this.ID = ID_Generator.Generate("MSG", 6, MessageNo);
        MessageNo++;

        this.Language = Language;
        this.Message = Message;
        this.SourcePlanet = SourcePlanet;
        this.DestinationPlanet = DestinationPlanet;
    }

    public static String getPlanetString(Planet Planet){
        return switch(Planet){
            case Mercury -> "Mercury";
            case Venus -> "Venus";
            case Earth -> "Earth";
            case Mars -> "Mars";
            case Jupiter -> "Jupiter";
            case Saturn -> "Saturn";
            case Uranus -> "Uranus";
            case Neptune -> "Neptune";
            case Pluto -> "Pluto";
            default -> "Unknown Planet";
        };
    }
}