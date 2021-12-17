import java.util.*;
class sbox1{
int hextobin(char ch){
int bin=(int)ch-48;
int pbin=1;
int rbin=0;
for(int i=0;i<=4;i++){
rbin=rbin+(bin%2)*pbin;
bin=bin/2;
pbin=pbin*10;
}
return rbin;
}
String polydivide(int []A1,int []A2,int []A3,int []B1,int []B2,int []B3){
  String t1="hi";
  for(int i=0;i<8;i++){
    System.out.print(B3[i]);
  }
  return t1;
}
}
class sbox2{

}
class sbox3{

}
class a14{
  public static void main(String args[]){
    sbox1 sb1=new sbox1();
    sbox2 sb2=new sbox2();
    sbox3 sb3=new sbox3();
    int arr1[]=new int[10];arr1[0]=1;
    int arr2[]=new int[10];arr2[0]=0;
    int arr3[]=new int[10];
    int arr4[]=new int[10];arr4[0]=0;
    int arr5[]=new int[10];arr5[0]=1;
    int arr6[]=new int[10];
    System.out.println("Enter the value of the ");
    Scanner sc =new Scanner(System.in);
    String s=sc.nextLine();
    char a=s.charAt(0);
    char b=s.charAt(1);
    int a1,b1;
    int A=1010;
    int B=1011;
    int C=1100;
    int D=1101;
    int E=1110;
    int F=1111;
    switch(a){
      case 'A':a1=A;
               break;
      case 'B':a1=B;
               break;
      case 'C':a1=C;
               break;
      case 'D':a1=D;
               break;
      case 'E':a1=E;
               break;
      case 'F':a1=F;
               break;
      default :a1=sb1.hextobin(a);
               break;
    }
    switch(b){
      case 'A':b1=A;
               break;
      case 'B':b1=B;
               break;
      case 'C':b1=C;
               break;
      case 'D':b1=D;
               break;
      case 'E':b1=E;
               break;
      case 'F':b1=F;
               break;
      default :b1=sb1.hextobin(b);
               break;
    }
    //System.out.println("The binary equivalent is : "+(a1*10000)+b1);
    long c=(a1*10000)+b1;
    //System.out.println(c);
    for(int i=7;i>=0;i--){
      arr6[i]=(int)c%10;
      c=c/10;
      }
      //for(int k=0;k<8;k++){
      //System.out.print(arr[k]);
      //}
    System.out.print("The polynomial form is : ");
    String s1="x^7+x^6+x^5+x^4+x^3+x^2+x^1+x^0";
    String s2=" ";
    for(int j=0;j<8;j++){
      if(arr6[j]==1){
        //System.out.println(s2);
       s2=s2.concat(s1.substring(j*4,j*4+3)).concat("+");
      }
    }
    int l=s2.length();
    String s3=s2.substring(1,(l-1));
    System.out.println(s3);
    char c1;
    String s4="x^8+x^4+x^3+x^1+x^0";
    for(int i=0;i<5;i++){
      arr3[i]=1;
    }
    for(int j=5;j<8;j++){
      arr3[j]=0;
    }
    arr3[8]=1;
    String s5=sb1.polydivide(arr1,arr2,arr3,arr4,arr5,arr6);
}
}
