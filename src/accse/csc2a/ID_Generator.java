package accse.csc2a;

public class ID_Generator {
    public static String Generate(String Prefix, int numberOfDigits, int ID_no){
//        if(ID_no > numberOfDigits)

        StringBuilder generatedID = new StringBuilder("MSG");
        String MessageNumberString = String.valueOf(ID_no);

        int NoOfDigitsInMessageNo = MessageNumberString.length();

        //Generating ID
        generatedID.append("0".repeat(numberOfDigits - NoOfDigitsInMessageNo));
        generatedID.append(MessageNumberString);

        return generatedID.toString();
    }
}
