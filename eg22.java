class eg22
{
public static void main(String args[])
{
boxweight bw1 =new boxweight (20,12,15,3);
boxweight bw2 =new boxweight ();
boxweight bw3 =new boxweight (bw1);
System.out.println("The volume1 is : "+bw1.volume());
System.out.println("The volume2 is : "+bw2.volume());
System.out.println("The volume3 is : "+bw3.volume());
}
}
class box
{
private double width;
private double length;
private double height;
box()
{
width=-1;
length=-1;
height=-1;
}
box(double width,double height, double length)
{
this.width=width;
this.length=length;
this.height=height;
}
box(box ob)
{
width=ob.width;
length=ob.length;
height=ob.height;
}
double volume()
{
return length*width*height;
}
}
class boxweight extends box
{
double weight;
boxweight(boxweight ob)
{
super(ob);
weight=ob.weight;
}
boxweight(double width,double height, double length,double weight)
{
super(width,height,length);
this.weight=weight;
}
boxweight()
{
super();
weight=-1;
}
}
