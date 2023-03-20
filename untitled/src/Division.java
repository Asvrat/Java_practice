public class Division {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean bool = a % b == 0;
        bool = bool || (b % a == 0);
        System.out.println(bool);
    }
}
