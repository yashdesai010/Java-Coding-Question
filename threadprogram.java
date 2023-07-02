class threadprogram implements Runnable{
   public void run(){
        System.out.println("Running");
    }
 public static void main(String[] args) {
    threadprogram tp=new threadprogram();
    Thread t=new Thread(tp);
    t.start();
 }
}
