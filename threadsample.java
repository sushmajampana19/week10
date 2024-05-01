public class threadsample extends Thread{
    String name;
    threadsample(String name){
        this.name=name;

    }
    public void run(){
        System.out.println("hi "+name);
    }
    public static void main(String[] args) {
        threadsample obj=new threadsample("madhu");
        threadsample obj1=new threadsample("king");
        threadsample obj2=new threadsample("yash");
        obj.start();
        obj1.start();
        obj2.start();
    }
}

