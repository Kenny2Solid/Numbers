import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class app {
    public static void main(String[] args) {
        // Create a stream of numbers
        var evens = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(t -> t % 2 != 0) // Filter out even numbers
                .collect(Collectors.toList()); // Collect the remaining numbers into a list

        // Print the resulting list
        System.out.println(evens);
    }
}