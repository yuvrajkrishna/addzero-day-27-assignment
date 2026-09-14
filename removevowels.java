public class removevowels {
    public static void main(String[] args) {

        String str = "Yuvraj";

        char[] ch = str.toCharArray();

        int j = 0;

        for(int i = 0; i < ch.length; i++) {

            if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' &&
               ch[i] != 'o' && ch[i] != 'u') {

                ch[j] = ch[i];
                j++;
            }
        }

        String result = new String(ch, 0, j);

        System.out.println(result);
    }
}