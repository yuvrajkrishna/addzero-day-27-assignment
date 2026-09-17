public class checkiftwostringpermutingornot {
    public static void main(String[] args) {

        String str1 = "aabc";
        String str2 = "abca";

        int freq[] = new int[26];

        if (str1.length() != str2.length()) {
            System.out.println("Not Permutting");
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("Not Permutting");
                return;
            }
        }

        System.out.println("Permutting");
    }
}