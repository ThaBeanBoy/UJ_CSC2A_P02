# Things I've Learned

## Enhanced Switch Statement

```java
public class Message{
    //Other parts of Message class
    
    public static String getPlanetString(Planet Planet){
        switch(Planet){
            case Mercury:
                return "Mercury";
                break;
            case Venus:
                return "Venus";
                break;
            case Earth : 
                return "Earth";
                break;
            case Mars :
                return "Mars";
                break;
            case Jupiter :
                return "Jupiter";
                break;
            case Saturn :
                return "Saturn";
                break;
            case Uranus :
                return "Uranus";
                break;
            case Neptune :
                return "Neptune";
                break;
            case Pluto :
                return "Pluto";
                break;
            default :
                return"Unknown Planet";
        };
    }
}
```

```java
public class Message{
    //Other parts of Message class
    
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
```

## Using Text Block

The tect block is something that made the following block look neat and concise
```java
public class Main{
    public static void main(String[] args){
        //m1 instantiated
        
        System.out.printf(
                //String
            "ID                 : %s\n" +
            "Language           : %s\n" +
            "Message            : %s\n"+
            "Source Planet      : %s\n" +
            "Destination Planet : %s",

            //passing
            m1.getID(),
            m1.getLanguage(),
            m1.getMessage(),
            Message.getPlanetString(m1.getSourcePlanet()),
            Message.getPlanetString(m1.getDestinationPlanet())
        );
        
        // Rest of code
    }
}
```
and using java text block, it looks like this
```java
public class Main{
    public static void main(String[] args){
        //m1 instantiated
        
        System.out.printf(
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
        
        // Rest of code
    }
}
```