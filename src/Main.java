import accse.csc2a.Message;
import accse.csc2a.Ship;

public class Main {
    public static void main(String[] args) {
        Message[] messageSet1 = {
                new Message(
                    "English", "This is my english message",
                    Message.Planet.Earth, Message.Planet.Mars
                ),
                new Message(
                        "Spanish", "Me no hable espanol",
                        Message.Planet.Mercury, Message.Planet.Jupiter
                ),
                new Message()
        };

        Message[] messageSet2 = {
             new Message(
                     "Shona", "Zvirisei sha?",
                     Message.Planet.Uranus, Message.Planet.Jupiter
             ),
             new Message(
                     "Afrikaans", "Goeie more meneer, hoe gang dit?",
                     Message.Planet.Pluto, Message.Planet.Venus
             )  ,
             new Message(
                     "Shona", "low key Friday paden, chilling namomz vangu",
                     Message.Planet.Saturn, Message.Planet.Earth
             )
        };

        Message[] messageSet3 = {
                new Message(
                        "Setswana", "Ke kopa dijo monna",
                        Message.Planet.Earth, Message.Planet.Mercury
                ),
                new Message(
                        "Jiberish", "asdwee fdver sdl",
                        Message.Planet.Venus, Message.Planet.Saturn
                )
        };

        Ship TheBlackPearl = new Ship("The Black Pearl", messageSet1);
        Ship TheFortuner = new Ship("The Fortuner", messageSet2);
        Ship TheHilux = new Ship("The Hilux", messageSet3);

        TheBlackPearl.printMessages();
        TheFortuner.printMessages();
        TheHilux.printMessages();
    }
}