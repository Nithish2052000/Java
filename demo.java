class demo
{
public static void main(String args[])
{
rect r=new rect(10,20);
tri t=new tri(10,20);
figure ref;
ref=r;
System.out.println(" arae is "+ref.area());
ref=t;
System.out.println(" arae is "+ref.area());
}
}
abstract class figure
{
double a,b;
figure(double i,double j)
{
a=i;
b=j;
}
abstract double area();
}
class rect extends figure
{
rect(double i,double j)
{
super(i,j);
}
double area()
{
return a*b;
}
}
class tri extends figure
{
tri(double i,double j)
{
super(i,j);
}
double area()
{
return a*b/2;
}
}
