package mypack;
class ex8{
	public static void main(String[] args) {
		balance b1[]=new balance[3];
		b1[1]=new balance("Alan turing",123.25);
		b1[2]=new balance("rathore",35.33);
		b1[3]=new balance("sharma",55.45);
		for (int i=0;i<3 ;i++) {
			b1[i].show();
		 	
		 } 
	}
}
class balance{
	String name;
	double bal;
	balance(String n,double b){
		name = n;
		bal = b;
		}
		void show(){
			System.out.println(name+" : $"+bal);
			}
}
