class eg5
{
public static void main(String[] arguments)
{
shape S1=new shape();
shape S2=new shape();
double vol;
S1.length=10;
S1.breadth=20;
S1.height=30;
S2.length=100;
S2.breadth=200;
S2.height=300;
vol=S1.length*S1.breadth*S1.height;
System.out.println("The volume is :"+vol);
vol=S2.length*S2.breadth*S2.height;
System.out.println("The volume is :"+vol);
}
}
public class shape
{
double length;
double breadth;
double height;

}