public class printwordinreverse {
    public static void main(String[] args) {

        String str = "good evening";

        char[] ch = str.toCharArray();

        int left = 0;

        for(int i = 0; i <= ch.length; i++) {

            if(i == ch.length || ch[i] == ' ') {

                int right = i - 1;

                while(left < right) {

                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;

                    left++;
                    right--;
                }

                left = i + 1;
            }
        }

        System.out.println(ch);
    }
}