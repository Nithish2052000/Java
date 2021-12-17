abstract class figure{
	int a;
	int b;
	figure(int i,int j){
		a=i;
		b=j;
	}
	abstract void show();
}
class rect extends figure{
	rect(int i,int j){
		super(i,j);
	}
	void show(){
		System.out.println("The area is : "+(a*b));
	}
}
class tri extends figure{
	tri(int i,int j){
		super(i,j);
	}
	void show(){
		System.out.println("The area is : "+(a*b)/2);
	}
}
class ex10{
	public static void main(String[] args) {
		rect r=new rect(10,20);
		tri t =new tri(15,30);
        figure f;
        f=r;
        f.show();
        f=t;
        f.show();
	}
}