public class MyRunnable implements  Runnable {

	public void run(){
	
	   for(int i=1;i<=5;i++){
	     System.out.println("Enter run method ::"+Thread.currentThread().getName()+ " :-->"+i );
	  } 
	  System.out.println("Finsihed with MyThread.");
	}
	public static void main(String[] args) {
      
	   for(int i=1;i<=5;i++){
	     System.out.println("Enter main method ::"+Thread.currentThread().getName()+ " :-->"+i );
	  }
        MyRunnable r=new MyRunnable();
		Thread thread=new Thread(r);
		thread.start();
	}
}
