class Counter{
  int count;
  public synchronized void increment(){
    count++;
  }
}
 class a6{
  public static void main(String args[]) throws Exception{
    Counter c=new Counter();
    Runnable o1=new hi();
    Runnable o2=new hello();
    Thread t1=new Thread(new Runnable(){
      public void run(){
      for(int i=0;i<1000;i++){
        c.increment();
      }
      }
    });
    Thread t2=new Thread(new Runnable(){
      public void run(){
        for(int i=0;i<1000;i++){
        c.increment();
     }
   }
      });
      t1.start();
      t2.start();
    t1.join();
    t2.join();
    System.out.println("The Value is : "+c.count);
  }
}
