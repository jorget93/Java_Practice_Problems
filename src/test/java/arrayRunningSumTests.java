import org.junit.Assert;
import org.junit.Test;

public class arrayRunningSumTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void arrayRunningSumTest1() {
        //arrange
        int[] someArray = { 1, 2, 3, 4, 5 };

        //action
        int expected = 15;
        int actual = practice.arrayRunningSum(someArray);
        //assert
        Assert.assertEquals(expected, actual);
    }
}
