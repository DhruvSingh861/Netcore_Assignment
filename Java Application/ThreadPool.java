import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Runnable t1=new MyThread("Thread 1");
        Thread t2=new Thread(new MyThread("Thread 2"));
        Runnable t3=new MyThread("Thread 3");
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.shutdown();
    }
}

class MyThread implements Runnable{
    public String name;
    public MyThread(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("Started- "+name);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Ended- "+Thread.currentThread().getName());
    }
}
