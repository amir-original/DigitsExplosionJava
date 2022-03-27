public class DigitsExplosion {
    public String explode(String stringNumber) {
        String result = "";
        for (int length = 0; length < stringNumber.length();length++){
            int digit = convertToInteger(stringNumber.charAt(length));
            for (int number = 1; number <= digit; number++){
                  result += stringNumber.charAt(length);
            }
        }
        return result;
    }

    private int convertToInteger(char charNumber) {
        return Integer.parseInt(String.valueOf(charNumber));
    }
}
