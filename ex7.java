class ex7{
	public static void main(String[] args) {
		Box b1=new Box(2.0,3.0,5.0);
		BoxWeight b2= new BoxWeight(3.0,4.0,5.0,6.0);
		b2.show();
		b1.show();
		}
}
class Box{
	double width;
	double height;
	double length;
	Box(){
		width=-1;
		height=-1;
		length=-1;
	}
	Box(double w,double h,double l){
		width=w;
		length=l;
		height=h;
	}
	void show(){
		System.out.println("width :"+width+"height"+height+"length"+length);
	}
}
class BoxWeight extends Box{
	double weight;
	BoxWeight(){
		super();
		weight=-1;
	}
	BoxWeight(double w,double h,double l,double w1){
     super(w,h,l);
     weight=w1;
	}
	void show(){
		super.show();
		System.out.println("width :"+width+"height"+height+"length"+length+"Weight"+weight);
	}
}
