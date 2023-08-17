
/**
 * Write a description of class Formatter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formatter
{
    public static void main(String[] args)
    {
        int num = 16;
        float fnum = 11.3f;
        double dnum = 17.3;
        System.out.println(String.format("the int is %3d",num));
        System.out.println(String.format("the int is %x",num));
        System.out.println(String.format("the float is %.2f",fnum));
        System.out.println(fnum);
        System.out.println(dnum);

    }
}
