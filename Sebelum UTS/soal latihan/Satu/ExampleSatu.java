package Satu;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ExampleSatu {
    public static void main(String[] args) {
        int[] numbers = IntStream.range(0, 11).toArray();

        System.out.println("Print Even Numbers");
        Arrays.stream(numbers)
                .filter(i -> isEven(i))
                .forEach(System.out::println);

        System.out.println("Print Odd Numbers");
        Arrays.stream(numbers)
                .filter(i -> !isEven(i)) //odd
                .forEach(System.out::println);

        System.out.println("Print Numbers multiplied by 2");
        Arrays.stream(numbers)
                .map(i -> i * 2)
                .forEach(System.out::println);

       System.out.println("Print Numbers divided by 2");
        Arrays.stream(numbers)
                .mapToDouble(i -> (double)i)
                .map(i -> i / 2.0)
                .forEach(System.out::println);
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
