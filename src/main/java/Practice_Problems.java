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

    //Write a method which will remove any given character from a String
    public String removeCharacter(String someString, char someChar){
        String newString = "";
        for(int i = 0; i < someString.length(); i++){
            if(someString.charAt(i) != someChar){
                newString += someString.charAt(i);
            }
        }
        return newString;
    }

    //Write a program to sort any given array from smallest to largest
    public int[] bubbleSort( int[] unsortedArray ){
        int holder;
        for(int i = 0; i < unsortedArray.length; i++){
            for(int j = 0; j < unsortedArray.length - 1; j++){
                if(unsortedArray[j] > unsortedArray[j + 1]){
                    holder = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = holder;
                }
            }
        }
        return unsortedArray;
    }

}
