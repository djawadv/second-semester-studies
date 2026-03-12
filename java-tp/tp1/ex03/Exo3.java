public class Exo3
{
    public static void main(String[] args)
    {
        Point1 a;
        a = new Point1(3, 5);
        a.abscissa();
        b.ordinate();
        a.deplace(2, 0);
        Point1 b = new Point1(6, 8);
        b.abscissa();
        b.ordinate();

    }
}

class Point1
{
    private double x; // x-coordinate
    private double y; // y-coordinate

    public Point1(int abs, int ord)
    {
        x = abs;
        y = ord;
    }

    public void deplace(int dx, int dy)
    {
        x += dx;
        y += dy;
    }

    public void abscissa(){
        System.out.println("the x-coordinate are : "+x);
    }
    public void ordinate(){
        System.out.println("the y-coordinate are : "+y);
    }
}

