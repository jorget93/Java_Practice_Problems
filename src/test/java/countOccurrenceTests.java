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

    @Test
    public void countOccurrencesTest2(){
        //arrange
        String someString = "aaacccaaabbbaaa";
        char charToCount = 'a';

        //action
        int expected = 9;
        int actual = practice.countOccurrence(someString, charToCount);
        //assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrencesTest3(){
        //arrange
        String someString = "aaacccbbb123 aabb/ cc. aaa";
        char charToCount = 'a';

        //action
        int expected = 8;
        int actual = practice.countOccurrence(someString, charToCount);
        //assert
        Assert.assertEquals(expected, actual);
    }
}
