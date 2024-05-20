package Question3;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {
            System.out.println("Square of " + number + " is " + (number * number));
        }
    }
}

