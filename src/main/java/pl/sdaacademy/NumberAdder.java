package pl.sdaacademy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberAdder {

    public int addNumbers (String string) {

        String[] splittedWord = input.split("[A-Za-z]");
        int accumulator = 0;
        for (String word : splittedWord) {
            if (!word.isEmpty()) {
                accumulator += Integer.parseInt(word);
            }
        }

        return accumulator;
    }

    private final String input;

    public NumberAdder(String input) {
        this.input = input;
    }

    public String shortenSms() {
        String[] words = input.split("[A-Za-z]");

        return Arrays.stream(words)
                .map(String::trim)
                .filter(trimmed -> !trimmed.isEmpty())
                .collect(Collectors.joining());
    }
}
