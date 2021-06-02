import org.junit.Assert;
import org.junit.Test;

public class removeCharacterTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void removeCharacterTest1(){
        //arrange
        String someString = "cats";
        char characterToRemove = 's';
        //action
        String expected = "cat";
        String actual = practice.removeCharacter(someString, characterToRemove);
        //assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterTest2(){
        //arrange
        String someString = "casts";
        char characterToRemove = 's';
        //action
        String expected = "cat";
        String actual = practice.removeCharacter(someString, characterToRemove);
        //assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterTest3(){
        //arrange
        String someString = "doggos";
        char characterToRemove = 's';
        //action
        String expected = "doggo";
        String actual = practice.removeCharacter(someString, characterToRemove);
        //assert
        Assert.assertEquals(expected, actual);
    }
}
