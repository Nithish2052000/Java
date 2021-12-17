class Box{
  int width;
  int height;
  int length;
  Box(){
    width=10;
    height=10;
    length=20;
  }
  void show(){
    System.out.println(":"+width+":"+length+":"+height);
  }
}
class a8{
  public static void main(String args[]){
    Box b1=new Box();
    Box b[]=new Box[5];
    for(int i=0;i<5;i++){
      b[i]=b1;
      b[i].show();
    }
  }
}
