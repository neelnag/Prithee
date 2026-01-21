import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Homework1Test {


    @Test
    void splitWord() {
        String input = "unclean.";
        String [] expected = {"unclean"};
        assertArrayEquals(expected, Homework1.splitWord(input));
        String input_two = "rohit;";
        String [] expected_two = {"rohit"};
        assertArrayEquals(expected_two, Homework1.splitWord(input_two));
    }
}