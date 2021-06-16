import org.junit.Assert;
import org.junit.Test;

public class findSecondHighestIntegerTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void findSecondHighestIntegerTest1(){
        //arrange
        Integer[] someArray = { 2, 1, 5, 6, 4, 9};

        //action
        Integer expected = 6;
        Integer actual = practice.findSecondHighestInteger( someArray );

        //assert
        Assert.assertEquals( expected, actual);
    }

}
