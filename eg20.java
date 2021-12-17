import java.lang.*;
class eg20
{
public static void main(String args[])
{
String str1="First String";
String str2="Second String";
String str3=str1;
if(str1.equals(str2))
{
System.out.println("Hi");
}
else
{
System.out.println("Hey : "+str1.length());
}
System.out.println("The letter @4"+str1.charAt(3));
}
}