class eg10
{
public static void main(String args[])
{
int x;
double y;
test t1=new test();
test t2;
t2=new test();
t1.test();
t2.test();
x=t1.test(10);
System.out.println("The variables are"+x);
x=t2.test(20);
System.out.println("The variables are"+x);
y=t1.test(0.20,0.30);
System.out.println("The variables are"+y);
y=t2.test(0.20,0.30);
System.out.println("The variables are"+y);
}
}

class test
{
void test()
{
System.out.println("The are no parameters");
}
int test(int a)
{
return a*a;
}
double test(double a,double b)
{
System.out.println("The two no.s product is:");
return a*b;
}
}


