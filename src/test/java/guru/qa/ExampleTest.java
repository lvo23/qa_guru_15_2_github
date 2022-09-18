package guru.qa;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Vlad Litvinov
 */
public class ExampleTest {

    @Test
    void exampleTestTrue() {

        Assertions.assertTrue(2 >= 10);
    }

    @Test
    void exampleTestTrue1() {

        Assertions.assertTrue(3 >= 2);
    }

}
