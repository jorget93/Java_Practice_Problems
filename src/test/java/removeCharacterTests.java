import org.junit.Assert;
import org.junit.Test;

public class removeCharacterTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void removeCharacterTests(){
        //arrange
        String someString = "cats";
        char characterToRemove = 's';
        //action
        String expected = "cat";
        String actual = practice.removeCharacter(someString, characterToRemove);
        //assert
        Assert.assertEquals(expected, actual);
    }
}
