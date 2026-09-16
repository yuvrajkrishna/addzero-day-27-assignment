public class removedupfromchar {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";
        int freq[] = new int [128];
        for(int i = 0 ; i < str.length(); i++){
            int ascii = str.charAt(i);
            freq[ascii]++;
        }
        for(int i = 0 ; i < freq.length; i++){
            if(freq[i] == 1){
                result += (char)i;
            }
        }
        System.out.println(result);
    }
}
