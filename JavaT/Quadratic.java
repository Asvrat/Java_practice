public class Quadratic
{
    public static void main(String[] args)
    {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b*b - 4*c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2);
        System.out.println((-b - d) / 2);
    }
}