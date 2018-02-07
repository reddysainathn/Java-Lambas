
public class RunnableExample {

    public static void main(String[] args){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World from Thread!");
            }
        });
        thread.run();
        Thread myLambda = new Thread(()-> System.out.println("Hello World from inline thread as Lambda!"));
        myLambda.run();

    }
}
