public class ClosuresExample {

    public static void main(String[] args) {
        int i = 10;
        int j = 10;
       /* doProcess(i, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i + j);
            }
        });*/
        doProcess(i, (i1) -> System.out.println(i + j));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}