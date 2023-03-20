public class Trigonometry {
    public static void main(String[] args) {
        double f = Math.PI;
        double sinf = Math.sin(f);
        double cosf = Math.cos(f);
        double trig = Math.pow(sinf,2) + Math.pow(cosf,2);
        boolean b = trig == 1;
        System.out.println(trig + " " + b + " " + cosf);
    }
}
