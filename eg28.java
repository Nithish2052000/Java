class eg28
{
public static void main(String args[])
{
student s1=new student(10,20);
s1.sum();
s1.mul();
}
}
abstract class teacher
{
int a,b,e;
static int c=10,d=10,f;
abstract void sum();
static void mul()
{
f=c*d;
System.out.println("The mul output is : "+f);
}
}
class student extends teacher
{
student(int i,int j)
{
a=i;
b=j;
}
void sum()
{
e=a+b;
System.out.println("The sum output is : "+e);
}
}
