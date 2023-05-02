import java.util.Scanner;

public class Zlomok
{
    private int cit;
    private int men;


    Zlomok(int pCit, int pMen)
    {
        try
        {
            if(pMen==0) throw new ArithmeticException();
            int najSpolDel = Zlomok.Nsd(pCit, pMen);
            cit = pCit / najSpolDel;
            men = pMen / najSpolDel;
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Nula v menovateli nie je mozna!");
            men=1;
        }
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

    public Zlomok minus(Zlomok other)
    {
        return new Zlomok(cit*other.men- other.cit*men,men* other.men);
    }

    public Zlomok krat(Zlomok other)
    {
        return new Zlomok(cit*other.cit,men* other.men);
    }

    public Zlomok deleno(Zlomok other)
    {
        return new Zlomok(cit*other.men,men* other.cit);
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
