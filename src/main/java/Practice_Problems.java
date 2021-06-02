public class Practice_Problems {

    //Write a method to check if a given string is a palindrome.
    public boolean palindromeCheck(String someString){
        boolean stringCheck = false;
        int length = someString.length() - 1;
        for(int i = 0, j = length; i <= length; i++){
            if(someString.charAt(i) != someString.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }



}
