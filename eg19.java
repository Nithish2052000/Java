class eg19
{
public static void main(String args[])
{
Outer oi= new Outer();
oi.test();
}
}
class Outer
	{
int x=100;
void test()
 {
Inner in=new Inner();
in.display();
 }
class Inner
 	{
void display()
 {
System.out.println("The value of X:"+x);
 }
	}
}
