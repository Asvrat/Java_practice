public class EuclDist {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double ED = Math.sqrt(x*x + y*y);
        System.out.println(ED);
    }
}
