public class checkifeqchar {
    public static void main(String[] args) {

        String str = "he0llo1234";

        char[] ch = str.toCharArray();

        int count = 0;
        int digcount = 0;

        for(int i = 0; i < ch.length; i++) {

            if(Character.isDigit(ch[i])) {
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