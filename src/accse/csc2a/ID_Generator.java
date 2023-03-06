package accse.csc2a;

public class ID_Generator {
    public static String Generate(String Prefix, int numberOfDigits, int ID_no) throws ID_NO_ERR {
        StringBuilder generatedID = new StringBuilder(Prefix);
        String ID_noString = String.valueOf(ID_no);

        int NoOfDigitsInMessageNo = ID_noString.length();
        int filler = numberOfDigits - NoOfDigitsInMessageNo;
        //Generating ID
        generatedID.append("0".repeat(filler));
        generatedID.append(ID_noString);

        return generatedID.toString();
    }
}
