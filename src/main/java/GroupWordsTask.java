import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<String, Long> groupIt(List<String> arr) {
        return arr
                .stream()
                .collect(Collectors.groupingBy(x -> String.valueOf(x.charAt(0)),
                        Collectors.summingLong(x -> x
                                .chars()
                                .filter(c -> c == x.charAt(0))
                                .count())));
    }
}
