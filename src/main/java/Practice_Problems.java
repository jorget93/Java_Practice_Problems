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

    //Write a function to count the occurrence of a given character in a String?
    public int countOccurrence( String someString, char charToCount){
        int counter = 0;
        for (int i = 0; i < someString.length(); i++){
            if( someString.charAt(i) == charToCount){
                counter++;
            }
        }
        return counter;
    }

    //Write a program to implement a binary search algorithm in.
    public int binarySearch(int[] sortedArray, int low, int high, int key){
        int index = 0;
        while(low <= high){
            int middle = (low + high) / 2;
            if(sortedArray[middle] < key){
                low = middle + 1;
            }
            else if (sortedArray[middle] > key){
                high = middle - 1;
            }
            else if (sortedArray[middle] == key){
                index = middle;
                break;
            }
        }
        return index;
    }

    //Take a char array, reverse the order, cannot declare another array
    public char[] reverseCharArray(char[] someArray) {
        char charHolder;
        int halfIndex = (someArray.length - 1)/ 2;
        for(int i = 0; i <= halfIndex; i++){
            charHolder = someArray[i];
            someArray[i] = someArray[someArray.length - (1 + i)];
            someArray[someArray.length - (1 + i)] = charHolder;
        }
        return someArray;
    }


    //Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    //Return the running sum of nums.
    public int arrayRunningSum (int[] someArray) {
        int arraySum = 0;
        for(int i = 0; i < someArray.length; i++){
            arraySum += someArray[i];
        }
        return arraySum;
    }


    //You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
    //Return the number of consistent strings in the array words.


    //Find common elements between 2 arrays of strings
    //Return common items of two arrays

    //Find the second highest number in an integer array?
    public Integer findSecondHighestInteger( Integer[] someArray ) {
        Integer holder;
        for (int i = 0; i < someArray.length; i++) {
            for(int j = 0; j < someArray.length - 1; j++){
                if(someArray[j] > someArray[j + 1]){
                    holder = someArray[j];
                    someArray[j] = someArray[j + 1];
                    someArray[j + 1] = holder;
                }
            }
        }
        return someArray[someArray.length - 2];
    }

}
