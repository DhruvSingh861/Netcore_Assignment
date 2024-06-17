import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableExample {
    public static void main(String[] args) {
        CallableThread ct=new CallableThread();
        FutureTask message=new FutureTask(ct);
        Thread th=new Thread(message);
        th.start();
        try{
            System.out.println(message.isDone());
            Object o=message.get();
            System.out.println(o);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class CallableThread implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println("Thread Started");
        Thread.sleep(2000);
        return "Thread Ended";
    }
}
