import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandlingLambda {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 0};
        int key = 0;
        process(numbers, key, (i1, key1) ->
                {
                    try {
                        System.out.println(i1 / key1);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                }
        );
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> integerConsumer) {
        for (int i : numbers) {
            integerConsumer.accept(i, key);
        }
    }
}
