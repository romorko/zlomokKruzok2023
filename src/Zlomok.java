import java.util.Scanner;

public class Zlomok
{
    private int cit;
    private int men;


    Zlomok(int pCit, int pMen)
    {
        cit=pCit;
        men=pMen;
    }

    Zlomok(int pCit)
    {
        cit=pCit;
        men=1;
    }

    Zlomok()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadaj citatel:");
        cit = sc.nextInt();
        System.out.print("Zadaj menovatel:");
        men = sc.nextInt();
    }

    public Zlomok plus(Zlomok other)
    {
        return new Zlomok(cit*other.men+ other.cit*men,men* other.men);
    }

    public static int Nsd(int nom, int den)
    {
        int t;
        while (den != 0) {
            t = den;
            den = nom % den;
            nom = t;
        }
        return nom;
    }



    @Override
    public String toString()
    {
      return (men!=0)?cit+"/"+men:Integer.toString(cit);
    }
}
