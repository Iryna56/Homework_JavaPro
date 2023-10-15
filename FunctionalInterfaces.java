import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {


        Function<String, Integer> lengthSomeString = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Consumer<Integer> number = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                for (int i = 0; i < integer; i++) {
                    System.out.println("Привет");
                }
            }
        };

        Supplier<Integer> random = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random1 = new Random();
                return random1.nextInt(10);
            }
        };
        BinaryOperator<String> twoStrings = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s.concat(s2);
            }
        };



        System.out.println(lengthSomeString.apply("cat"));
        number.accept(5);
        System.out.println(random.get());
        System.out.println(twoStrings.apply("Hello", "world"));

    }
}
