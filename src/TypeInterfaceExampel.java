public class TypeInterfaceExampel {

    public static void main(String[] args) {

        StringLengthLambda stringLengthLambda = (s) -> s.length();
        System.out.println(stringLengthLambda.getLength("Hello"));

        StringLengthLambda1 stringLengthLambda1 = (s1, s2) -> {
            s1 = s1 + s2;
            return s1.length();
        };
        System.out.println(stringLengthLambda1.getLength("Hello", " World!"));


        printLamda(stringLengthLambda);

    }


    interface StringLengthLambda {
        int getLength(String s);
    }

    interface StringLengthLambda1 {
        int getLength(String s, String s1);
    }


    public static void printLamda(StringLengthLambda stringLengthLambda) {
        System.out.println(stringLengthLambda.getLength("Hello World from printLambda()"));
    }
}
