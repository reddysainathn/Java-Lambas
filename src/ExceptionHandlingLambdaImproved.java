import java.util.function.BiConsumer;

public class ExceptionHandlingLambdaImproved {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 0};
        int key = 2;
        process(numbers, key, wrapperLambda((i1, key1) -> System.out.println(i1 / key1)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> integerConsumer) {
        for (int i : numbers) {
            integerConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> integerBiConsumer) {
        return (v,k)->{
            try{
                integerBiConsumer.accept(v, k);
            }catch (ArithmeticException e){
                System.out.println(e.getCause());
            }

        };
    }
}
