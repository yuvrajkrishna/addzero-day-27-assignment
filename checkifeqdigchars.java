public class CheckIfEqDigChars {
    public static void main(String[] args) {

        String str = "he0llo1234";

        int count = 0;
        int digcount = 0;

        for(int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))) {
                digcount++;
            }
            else {
                count++;
            }
        }

        if(count == digcount) {
            System.out.println("character == digits");
        }
        else {
            System.out.println("character != digits");
        }
    }
}