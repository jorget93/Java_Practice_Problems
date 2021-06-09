import org.junit.Assert;
import org.junit.Test;

public class countOccurrenceTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void countOccurrencesTest1(){
        //arrange
        String someString = "aaacccbbb";
        char charToCount = 'a';

        //action
        int expected = 3;
        int actual = practice.countOccurrence(someString, charToCount);
        //assert
        Assert.assertEquals(expected, actual);
    }
}
