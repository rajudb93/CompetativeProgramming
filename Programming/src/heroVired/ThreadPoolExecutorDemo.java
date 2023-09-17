package heroVired;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnableEx implements Runnable{
    private String name;

    public MyRunnableEx(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println("Start Thread: "+name);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){

        }
        System.out.println("Ended Thread: "+name);
    }
}
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int i=1;i<=10;i++){
            Runnable runnable=new MyRunnableEx("myWorkerThread"+i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
/*        while(!executorService.isTerminated()){
            System.out.println("All requests completed successfully");
        }*/


    }
}
