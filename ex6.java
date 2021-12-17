
class ex6{
	public static void main(String[] args) {
    stat.meth(10);	
	}
}
class stat{
	static int a;
	static void meth(int i)
	{
       a=i;
       System.out.println("The value of the variable is : "+a);

	}
}
