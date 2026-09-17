public class sumoftwostring {
    public static void main(String[] args) {
        char ch [] =  {'5', '2', '3'};
        char ch2 [] = {'1','6','2'};
        int sum = 0;
        for(int i = 0 ; i < ch.length ; i++){
            int digit1 = ch[i] - '0';
            int digit2 = ch2[i] - '0';
            int currsum = digit1+digit2;
            sum = sum*10 + currsum;
        }
        System.out.println(sum);
    }
}
