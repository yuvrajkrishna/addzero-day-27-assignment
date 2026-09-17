public class stringtinteger {
    public static void main(String[] args) {

        String s = "123";

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;
        }

        System.out.println(num);
    }
}