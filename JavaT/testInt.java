public class testInt
{
    public static void main(String[] args)
    {
        int integer = Integer.parseInt(args[0]);
        integer = integer + Integer.parseInt(args[1]);
        System.out.println(integer);
    }
}