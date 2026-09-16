public class checkifallwordsarepalindrome {
    public static void main(String[] args) {
        String str = "madaim eye nitin";
        String words[] = str.split(" ");
        for(int i = 0 ; i < words.length ; i++){
            boolean result = isPalindrome(words[i]);
            if(result == false){
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    public static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while(left < right){
            if(word.charAt(left) == word.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            } 
            
        }
        return true;
    }
}
