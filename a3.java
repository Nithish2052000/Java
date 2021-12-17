class test{
  int a;
  int b;
  test(int x,int y){
    a=x;
    b=y;
  }
  void setdata(int i,int j){
    a=i;
    b=j;
  }
  void show(int c){
    System.out.println("This is the : "+c+"-"+a+":"+b);
  }
}
class a3{
public static void main(String args[]){
test[] obj=new test[10];//array of reference
test obj1=new test(10,20);
for (int i=0;i<10;i++) {
  obj[i]=obj1;
  obj[i].setdata(10,20);
  obj[i].show(1);
}
}
}
/*
First : {
Second :{
Third : {
if(true)
break Second;
       }
System.out.println("2");
       }
System.out.println("1");
       }
*/
/*
class test{
  int a,b;
  test(int a,int b){
    this.a=a;
    this.b=b;
  }
  void show1(test obj1){
    obj1.a*=2;
    obj1.b/=2;
  }
  test show2(test obj2){
         obj2.a=a;
         obj2.b=b;
         return obj2;
  }
  void display(){
    System.out.println(":"+a+":"+b);
  }

}
test t1=new test(10,30);
test t2;
t2=t1.show2(t1);
t1.show1(t1);
t2.display();
System.out.println("The values are"+t1.a+":"+t1.b);

*/
