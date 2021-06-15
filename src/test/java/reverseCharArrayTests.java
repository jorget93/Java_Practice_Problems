import org.junit.Assert;
import org.junit.Test;

public class reverseCharArrayTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void reverseCharArrayTest1() {
        //arrange
        char[] someArray = { 'a', 'b', 'c', 'd'};

        //action
        char[] expected = { 'd', 'c', 'b','a' };
        char[] actual = practice.reverseCharArray(someArray);

        //assert
        Assert.assertArrayEquals(expected, actual);
    }
}
