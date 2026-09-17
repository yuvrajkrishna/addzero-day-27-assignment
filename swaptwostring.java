public class swaptwostring {
    public static void main(String[] args) {
        String one = "hello";
        String two = "world";
        char first [] = one.toCharArray();
        char second [] = two.toCharArray();
        for(int i = 0 ; i < first.length; i++){
            char temp = first[i];
            first[i] = second[i];
            second[i] = temp;
        }
        one = new String(first);
        two = new String(second);
        System.out.println(one);
        System.out.println(two);
    }
}
