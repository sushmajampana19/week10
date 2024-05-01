public class runnableex implements Runnable {
    String name;
    runnableex(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("hi "+name);

    }
    public static void main(String[] args) {
        runnableex obj=new runnableex("air");
        runnableex obj1=new runnableex("fire");
        new Thread(obj).start();
        new Thread(obj1).start();
    }
}

