package multithread;

public class multiMain {
    public static void main(String[] args){
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());
        ThreadDemo.show();
    }
}
