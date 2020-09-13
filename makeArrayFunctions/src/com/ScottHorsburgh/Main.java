package com.ScottHorsburgh;

public class Main {

    public static void main(String[] args) {
        //Initial random number array
        int[] randomNumbers = {3,2,4,5,6,1,8,9,32,20};
        //object created for ChapterSeven class
        ArrayFuncs arrFuncs = new ArrayFuncs(randomNumbers);

        System.out.printf("\nEvery element at an even index:%4s", "");
        arrFuncs.elementAtEvenIndex();
        System.out.printf("\nEvery even element: %15s", "");
        arrFuncs.everyEvenElement();
        System.out.printf("\nElements in reverse: %13s", "");
        arrFuncs.elementsReverseOrder();
        arrFuncs.firstAndLastElements();


    }
}
