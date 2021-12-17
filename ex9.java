
class ex9 
{
public static void main(String args[]) 
{ 
callback c = new client();
anotherclient a= new anotherclient(); 
c.show(42); 
c=a;//another client object is getting refered 
c.show(6);
}
}

interface callback{
void show (int param);
}
class client implements callback{
public void show(int p){
System.out.println("Called back with : "+p);
}
}
class anotherclient implements callback{
	public void show(int p){
		System.out.println("square is : "+(p*p));
	}
}
