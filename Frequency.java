public class Frequency {
    public static void main(String[] args) {

        String str = "hello how are you";

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' ') {
                continue;
            }

            boolean alreadyCounted = false;

            for(int k = 0; k < i; k++) {
                if(str.charAt(k) == str.charAt(i)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted) {
                continue;
            }

            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " = " + count);
        }
    }
}