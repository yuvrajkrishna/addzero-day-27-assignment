public class mergetwostring {
    public static void main(String[] args) {

        String str = "hello";
        String str2 = "world";

        int i = 0;
        int j = 0;

        String result = "";

        int turn = 1;

        while(i < str.length() && j < str2.length()) {

            if(turn % 2 == 0) {
                result += str2.charAt(j);
                j++;
            }
            else {
                result += str.charAt(i);
                i++;
            }

            turn++;
        }

        while(i < str.length()) {
            result += str.charAt(i);
            i++;
        }

        while(j < str2.length()) {
            result += str2.charAt(j);
            j++;
        }

        System.out.println(result);
    }
}