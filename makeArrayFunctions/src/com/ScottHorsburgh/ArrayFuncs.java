package com.ScottHorsburgh;

public class ArrayFuncs {

    int[] randomNumbers;

    /**
     * Default Constructor.
     * @param initialValues to set randomNumbers array elements
     */
    public ArrayFuncs(int[] initialValues){
        //initializes randomNumber values;
        randomNumbers = initialValues;
    }

    /**
     * Method loops through randomNumber array and outputs elements in an even index.
     */
    public void elementAtEvenIndex(){

        //loops through randomNumber array to find even index
        for(int i = 2; i < randomNumbers.length; i += 2){
            System.out.print("  index[" + i + "]: " + randomNumbers[i] + "  ");
        }
        System.out.println();
    }

    /**
     * Method loops through randomNumber array and outputs elements that are an even number.
     */
    public void everyEvenElement(){

        //loops through randomNumber array to find all elements that are even
        for(int i = 0; i < randomNumbers.length; i++){
            if(randomNumbers[i] % 2 == 0){
                System.out.print("  index[" + i + "]: " + randomNumbers[i] + "  ");
            }
        }
        System.out.println();
    }

    /**
     * Method loops through randomNumber array and outputs the index of array in reverse order.
     */
    public void elementsReverseOrder(){

        //loops through array from the last index to the first( in reverse)
        //randomNumbers.length - 1 is to make sure no out of bounds exceptions when looping through array
        for(int i = randomNumbers.length - 1; i >= 0; i--){
            System.out.print("   index[" + i + "]: " + randomNumbers[i]);
        }
        System.out.println();
    }

    /**
     * Method stores first and last index of array in variables and shows output of element in those index.
     */
    public void firstAndLastElements(){
        //string with first index from randomNumbers array
        String firstIndex = "\nElement in the first index: " + randomNumbers[0];
        //string with last index using randomNumbers.length - 1 to get last index
        String lastIndex = "    Element in the last index: " + randomNumbers[randomNumbers.length - 1];
        System.out.print( firstIndex + "    " + lastIndex);
        System.out.println();
    }
}
