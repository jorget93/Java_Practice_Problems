import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class bubbleSortTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void bubbleSortTest1(){
        //arrange
        int[] unsortedArray = { 4, 3, 2, 7, 1 };

        //action
        int[] expected = { 1, 2, 3, 4, 7 };
        int[] actual = practice.bubbleSort(unsortedArray);

        //assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSortTest2(){
        //arrange
        int[] unsortedArray = { 4, 3, 2, 2, 7, 1, 1, 1 };

        //action
        int[] expected = { 1, 1, 1, 2, 2, 3, 4, 7 };
        int[] actual = practice.bubbleSort(unsortedArray);

        //assert
        Assert.assertArrayEquals(expected, actual);
    }
}
