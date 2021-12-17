class eg11
{
public static void main(String args[])
{
cbv c2=new cbv(15,20);
cbr c3=new cbr(15,20);
c2.method(15,20);
c3.method(c3);
System.out.println("The values after call by value :"+c2.a+c2.b);
System.out.println("The values after call by reference :"+c3.a+c3.b);
}
}
class cbv
{
int a,b;
cbv(int i,int j)
{
a=i;
b=j;
}
void method (int i,int j)
	{
i*=2;
j/=2;
	}
}
class cbr
{
int a,b;
cbr(int i,int j)
	{
a=i;
b=j;
	}
void method(cbr c1)
	{
c1.a*=2;
c1.b/=2;
	}
}
