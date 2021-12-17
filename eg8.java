
class eg8
{
public static void main(String[] args)
{
double vol;
box b1=new box(10,9,8);
box b2;
b2=new box(30,3,0.3);
vol= b1.volume();
System.out.println("The volume is 2:"+vol); 
vol= b2.volume();
System.out.println("The volume is 2:"+vol);
}
}
class box
{
double width;
double length;
double height;

box(double width,double length,double height)
{
this.width=width;
this.length=length;
this.height=height;
}
double volume()
{
return width*length*height;
}
}