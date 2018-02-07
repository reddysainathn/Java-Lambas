public class ThisReferenceExample {

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        /*thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i:" + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is anonymous inner class";
            }
        });*/


        thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i:" + i);
            //System.out.println(this); -> THis will not work because Lambda does not touch the object this.
        });

        thisReferenceExample.execute();
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i:" + i);
            System.out.println(this);
        });
    }

    //ANonymous Inner Class over-rides this reference.
}
