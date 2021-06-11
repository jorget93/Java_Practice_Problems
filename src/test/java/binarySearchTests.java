import org.junit.Assert;
import org.junit.Test;

public class binarySearchTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void binarySearchTest1(){
        //arrange
        int[] sortedArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int low = 0, high = 20, key = 10;
        //action
        int expected = 10;
        int actual = practice.binarySearch(sortedArray, low, high, key);
        //assert
        Assert.assertEquals(expected, actual);
    }
}
