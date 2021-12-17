public class aray1
{
public static void main(String[] arguments)
{
int b[]={ 1,2,3,4,5,6,7,8,9,10};
double c[];
c= new double[10];
double a=0.8,d=.09;
for (int i=0;i<10;i++)
{
c[i]=b[i]*a+d;
}
for (int i=0;i<10;i++)
{
System.out.println("The array c is "+ c[i]);
}
}
}