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

        Assertions.assertTrue(new Random().nextInt() > 1);
    }

    @Test
    void exampleTestTrue1() {

        Assertions.assertTrue(new Random().nextInt() > 2);
    }

}
