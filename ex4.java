class test{
	int a,b;
	test(int x,int y)
	{
		x=a;
		y=b;
	}
    void equals(test o){
    	if(o.a==a&&o.b==b){
    		System.out.println("The objects are equal");
    	}
    	else{
           System.out.println("The objects are not equal");
    	}
    }
}

class ex4{
	public static void main(String[] args) {
		test o1=new test(2,3);
		test o2=new test(2,3);
		o1.equals(o2);
       
	}
}