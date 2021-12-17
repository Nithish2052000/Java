import java.util.*;

class eg27
{
public static void main(String args[])
{
int c;
int i=0;
System.out.println("Enter the numbers : ");
Scanner eg27=new Scanner(System.in);
int a= eg27.nextInt();
int b= eg27.nextInt();
try{
System.out.println("Enter the no. 1 for addidtion and 2 for multiplication");
i=eg27.nextInt();
}catch(Exception e)
{
System.out.println("Enter a valid one");
}
switch(i)
{
case 0:System.out.println("Enter the no. 1 for addidtion and 2 for multiplication");
       break;
case 1: c=a+b;
        System.out.println("The sum of the given numbers is :"+c);
        break;
case 2: c=a*b;
        System.out.println("The multiplication of the given numbers is :"+c);
        break;
default:System.out.println("Enter the no. 1 for addidtion and 2 for multiplication");
 }
}
}
