public class Point
{
    private Zlomok X;
    private Zlomok Y;

    Point(Zlomok pX, Zlomok pY)
    {
        X=pX;
        Y=pY;
    }

    @Override
    public String toString()
    {
        return "[%s ; %s]".formatted(X, Y);
    }
}
