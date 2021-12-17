class box{
	double width;
	double height;
	double length;
 box()
 {
 	width=-1;
 	height =-1;
 	length =-1;
 }
 box(double w,double l,double h)
 {
 	width=w;
 	height=h;
 	length=l;
 }	
 double volume()
 {
   return width*length*height;
 }
}
class ex3{
	public static void main(String[] args) {
	box b1=new box();
	box b2=new box(12,12,12);
	double vol1,vol2;
	vol1=b1.volume();
	vol2=b2.volume();
	System.out.println("The volume is : "+vol1);				
	System.out.println("The volume is : "+vol2);
		
	}
}
