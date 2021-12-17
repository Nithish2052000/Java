package p2;
import java.util.Scanner;
public class runner extends linkedList{
  public static void main(String args[]){
    linkedList l=new linkedList();
    char ch='y';
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("Please enter the value : ");
    int n=sc.nextInt();
    l.insert(n);
    System.out.println("Do you want to enter more!!!");
    ch=sc.next().charAt(0);
    }while(ch=='y');
    l.show();
  }
}
