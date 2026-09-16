public class checkifallwordsarepalindrome {
    public static void main(String[] args) {
         String str = "madam eye nitin";

        char[] ch = str.toCharArray();

        int left = 0;

        for(int i = 0; i <= ch.length; i++) {

            if(i == ch.length || ch[i] == ' ') {

                int right = i - 1;

                while(left < right) {

                    if(ch[left] != ch[right]) {
                        System.out.println("Not palindrome");
                        return;
                    }

                    left++;
                    right--;
                }

                // Next word ka starting point
                left = i + 1;
            }
        }

        System.out.println("Palindrome");
    }
}
