package com.company;

public class Main {

    public static void main(String[] args) {

//        //In has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//
//        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = "+myTotal);
//
//        // byte has a width of 8
//        byte myByteValue = -128;
//
//        byte myNewByteValue = (byte)(myByteValue/2);
//        System.out.println("myNewByteValue = "+myNewByteValue);
//
//        //short has a width of 16
//        short myShortValue = 32767;
//
//        short myNewShortValue = (short) (myShortValue/2);
//        System.out.println("myNewShortValue = "+myNewShortValue);
//
//        //long has a width of 64
//        long myLongValue = 100L;

//        ********************************************************************************
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int
//        ********************************************************************************


        byte myByteVaue = 124;
        short myShortValue = 24636;
        int myIntValue = 25938854;
        long myLongValue = 50000+(myByteVaue+myShortValue+myIntValue)*10;
        System.out.println("myLongValue = "+myLongValue);

    }
}
