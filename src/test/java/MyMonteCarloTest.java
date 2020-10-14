import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class MyMonteCarloTest {

    @Test
    public void numberOfDuplicates0() {
        // AAA

        //Arrange
        MonteCarlo mc = new MyMonteCarlo();

        // Act = call method
        int actual = mc.numberOfDuplicates(new ArrayList<>());

        // Assert
        assertEquals(0, actual);
    }
    @Test
    public void numberOfDuplicates3() {
        // AAA

        //Arrange
        MonteCarlo mc = new MyMonteCarlo();

        // Act = call method
        int actual = mc.numberOfDuplicates(Arrays.asList(4,4,5,6,5,5));

        // Assert
        assertEquals(3, actual);
    }
}