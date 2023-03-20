/*public class RandomNumber {
    public static void main(String[] args) {
        int a = 3;
        int b = 18;
        double R = Math.random();
        int res = a + ((int) (R * (b - a)));
        System.out.println(res);
    }
}*/
public class RandomNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        double R = Math.random();
        int x = a + ((int) (R * (b - a)));
        R = Math.random();
        int y = a + ((int) (R * (b - a)));
        System.out.println(x+y);
    }
}
