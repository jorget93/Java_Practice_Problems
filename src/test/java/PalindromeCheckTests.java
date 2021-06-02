import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckTests {
    Practice_Problems practice = new Practice_Problems();

    @Test
    public void palindromeCheckTest1(){
        //arrange
        String someString = "aba";
        //action
        boolean palindromeCheck = practice.palindromeCheck(someString);
        //assert
        Assert.assertTrue(palindromeCheck);
    }

    @Test
    public void palindromeCheckTest2(){
        //arrange
        String someString = "aaba";
        //action
        boolean palindromeCheck = practice.palindromeCheck(someString);
        //assert
        Assert.assertFalse(palindromeCheck);
    }

    @Test
    public void palindromeCheckTest3(){
        //arrange
        String someString = "abbbbaa";
        //action
        boolean palindromeCheck = practice.palindromeCheck(someString);
        //assert
        Assert.assertFalse(palindromeCheck);
    }

    @Test
    public void palindromeCheckTest4(){
        //arrange
        String someString = "xyzyx";
        //action
        boolean palindromeCheck = practice.palindromeCheck(someString);
        //assert
        Assert.assertTrue(palindromeCheck);
    }

    @Test
    public void palindromeCheckTest5(){
        //arrange
        String someString = "abcdefgfedcba";
        //action
        boolean palindromeCheck = practice.palindromeCheck(someString);
        //assert
        Assert.assertTrue(palindromeCheck);
    }
}
