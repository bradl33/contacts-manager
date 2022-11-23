package UdacityJavaOOP;

public class StringToTitleCase{

    //Iterates characters in original text and converts text to Title Case
    //Reference: https://www.baeldung.com/java-string-title-case
    public static String convertToTitleCaseIteratingChars(String originalText){
        if (originalText == null || originalText.isEmpty()){
            return originalText;
        }

        StringBuilder convertedText = new StringBuilder();

        boolean convertNext = true;

        for (char ch : originalText.toCharArray()){
            if (Character.isSpaceChar(ch)){
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else{
                ch = Character.toLowerCase(ch);
            }
            convertedText.append(ch);
        }
        return convertedText.toString();
    }
}
