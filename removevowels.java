public class removevowels {
    public static void main(String[] args) {

        String str = "Yuvraj";

        str = str.replace("a", "");
        str = str.replace("e", "");
        str = str.replace("i", "");
        str = str.replace("o", "");
        str = str.replace("u", "");

        System.out.println(str);
    }
}