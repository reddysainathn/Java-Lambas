public class Greeter {

    //Advantages of Lambdas
    //Enables Function Programming
    //Readable and consise code
    //Easier to use API's and parallel Processing.

    //Function Programming vs OOPS
    //FP is more readable code than OOPS

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeting = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeting.greet(helloWorldGreeting);


        Greeting greeting1 = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World from Inner class!");
            }
        };

        greeting1.perform();

        Lambda myLambdaFunction = () -> System.out.println("Hello World from Lambda!");
        myLambdaFunction.perform();
    }

}

//Functional Interface -> Interface with only 1 Abstract Method is called Functional Interface.(@FunctionalInterface)
@FunctionalInterface
interface Lambda {
    void perform();
}
