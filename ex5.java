class box{
	double width;
	double height;
	double length;
	box(double w,double h,double l){
		width=w;
		height=h;
		length=l;
	}

    box volume(box b)
    {
    	b.width*=4;
		b.height*=4;
		b.length*=4;
        return b;
    }
}

class ex5{
	public static void main(String[] args) {
   box b2;
    box b1=new box(2,3,4);
    
    b2=b1.volume(b1);
    System.out.println("The new dimennsion is :"+b2.width+" "+b2.height+" "+b2.length);


    }
}