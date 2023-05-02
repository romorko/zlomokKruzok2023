public class Main
{
    public static void main(String[] args)
    {
        Zlomok Z1 = new Zlomok(4,8);
        Zlomok Z2 = new Zlomok(8,10);
        System.out.printf("%s + %s = %s\n",Z1,Z2,Z1.plus(Z2));
        System.out.printf("%s - %s = %s\n",Z1,Z2,Z1.minus(Z2));
        System.out.printf("%s * %s = %s\n",Z1,Z2,Z1.krat(Z2));
        System.out.printf("%s : %s = %s\n",Z1,Z2,Z1.deleno(Z2));
        System.out.println(new Point(Z1,Z2));
        //System.out.println(Z1);
        //System.out.println(Z2);
    }
}