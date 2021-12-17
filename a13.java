import java.util.*;
class stack{
  int item;
  int s[]=new int[100];
  int top;
  int x;
  int size;
  stack(){
    top=-1;
  }
  void push(int item,int size){
    if(top>=size){
    System.out.println("The stack is overflowing");
    }else{
    s[++top]=item;
    }
  }
  int pop(){
    if(top<=-1){
    System.out.println("The stack is underflow");
    return 0;
  }else{
    x=s[top];
    top--;
    return x;
  }
  }
  void display(){
   System.out.println("The elements of the stack are : ");
   for (int i=0;i<=top;i++){
     System.out.println(s[i]);
   }
  }
}
class a13{
  public static void main(String args[]){
    stack st=new stack();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the stack : ");
    int a=sc.nextInt();
    char ch;
    do{
      System.out.println("Enter your choice : ");
      int b=sc.nextInt();
      switch(b){
        case 1 :System.out.println("Enter the number to be pushed : ");
                int x=sc.nextInt();
                st.push(x,a);
                break;
        case 2 :int t=st.pop();
                System.out.println("The number popped is : "+t);
                break;
        case 3:st.display();
                break;
      }
      System.out.println("Do u want to continue (y/n)");
      ch=sc.next().charAt(0);
    }while(ch=='y');
  }
}
