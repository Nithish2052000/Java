class Q{
	int n;
	boolean isValue=false;
	public synchronized void put(int n){
		while(isValue){
		try{wait();}catch(Exception e){}
		}
		System.out.println("Put : "+n);
		this.n=n;
		isValue=true;
		notify();
	}
	public synchronized void get(){
		while(!isValue){
        try{wait();}catch(Exception e){}
        }
   		System.out.println("Get : "+n);
		isValue=false;
        notify();
	}
}
class Producer implements Runnable{
	Q q;
	public Producer(Q q){
		this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
	}
	public void run(){
     int i=0;
		while(true){
			q.put(i++);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
		
	}
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q){
    	this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
	public void run(){
		while(true){
        q.get();
        try{Thread.sleep(1000);}catch(Exception e){}   
        }
    }
}
class a7{
	public static void main(String[] args) {
	Q q=new Q();
	new Producer(q);
	new Consumer(q);
	}
}