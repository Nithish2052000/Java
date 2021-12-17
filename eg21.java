class eg21
{
public static void main(String args[])
{
B sub=new B();
A sup=new A();
sub.display(20,15);
sup.show();
}
}
class A
{
int i;
void show()
{
System.out.println("The value of I :"+i);
}
}
class B extends A
{
int i;
void display(int a,int b)
{
super.i=a;
i=b;
System.out.println("The value of in superclass is :"+super.i);
System.out.println("The value of in subclass is :"+i);
}
}
 