import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzz(int n) {
        List<Integer> arr = IntStream
                .range(1, n+1)
                .boxed()
                .collect(Collectors.toList());
        return arr
                .stream()
                .map(x -> {
            if (x % 3 == 0 && x % 5 == 0) {
                return "FizzBuzz";
            }
            if (x % 3 == 0) {
                return "Fizz";
            }
            if (x % 5 == 0) {
                return "Buzz";
            }
            return String.valueOf(x);
        })
                .collect(Collectors.toList());
    }
}
