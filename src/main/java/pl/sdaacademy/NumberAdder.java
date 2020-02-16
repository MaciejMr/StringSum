package pl.sdaacademy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberAdder {

    public int addNumbers(String string) {

        String[] splittedWord = input.split("[A-Za-z]");

        return Arrays.stream(splittedWord)
                .filter(word -> !word.isEmpty())
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);

    }

    private final String input;

    public NumberAdder(String input) {
        this.input = input;
    }
}
