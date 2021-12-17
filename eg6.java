class eg6
{
public static void main(String args[])
{
box b1=new box();
box b2;
b2=new box();
b1.l=10.65;
b1.b=10;
b1.h=20.66;
b2.l=0.1;
b2.b=0.2;
b2.h=0.3;
b1.volume();
b2.volume();
}
}
class box
{
double l;
double b;
double h;
void volume()
{
double vol;
vol=l*b*h;
System.out.print("The volume is :");
System.out.println(l*b*h);
System.out.print("The volume is :"+vol);
}
}


