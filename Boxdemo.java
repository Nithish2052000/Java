class Boxdemo
{
public static void main(String args[])
{
box mybox1=new box();
box mybox2=new box(60,70,80);
box mybox3=mybox1;
double vol;
vol=mybox1.volume();
System.out.println("The volume by default constructor :"+vol);
vol=mybox2.volume();
System.out.println("The volume by default constructor :"+vol);
}
}
class box
{
double width;
double height;
double length;
box()
{
width=10;
height=20;
length=30;
}
box(double w,double h,double l)
{
width=w;
height=h;
length=l;
}
protected void finalize()
{
System.out.println("Say Hi");
}
double volume()
{
return width*height*length;
}
}
