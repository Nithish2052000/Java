abstract class calcArea 
{
abstract void findTriangle(double b, double h);
{
double area = (b*h)/2;
System.out.println("Area of Triangle: "+area);
}
void findRectangle(double l, double b)
{
double area = l*b;
System.out.println("Area of Rectangle: "+area);
}
static void findSquare(int s)
{
double area = s*s;
System.out.println("Area of Square: "+area);
}
static int s=4;
}
		
public class area1 extends calcArea 
{
public static void main(String args[])
{
double l=4,b=3,h=2;
System.out.print("\nEnter Base & Vertical Height of Triangle: ");
area.findTriangle(b, h);
System.out.print("\nEnter Length & Breadth of Rectangle: ");
area.findRectangle(l, b);
System.out.print("\nEnter Side of a Square: ");
area.findSquare(s);
}
}