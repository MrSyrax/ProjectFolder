package Intro;
class HelloWorld {
    public static void main(String[] args) {
        // Printing out hello tim
        System.out.println("Hello, Tim");
        // firstmath problems and assigning variables
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        // explaning properties (integer has a property called MIN_VALUE)
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        // explaining contatination
        System.out.println("Integer Min Value is = " + myMinIntValue);
        System.out.println("Integer Max Value is = " + myMaxIntValue);
        System.out.println("Integer Value Range (" + myMinIntValue + " to " + myMaxIntValue + ")");
        System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        System.out.println("Short Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        System.out.println("A long has a width of " + Long.SIZE);
        // explaning type casting
        myTotal = (myMinIntValue /2);
        System.out.println(myTotal);
        System.out.println("------------------------------------");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);
        System.out.println("------------------------------------");
        int myMinShortValue = Short.MIN_VALUE;
        short myNewShortValue = (short )(myMinShortValue / 2);
        System.out.println(myNewShortValue);
        // First Challenge
        byte myBitByte = -10;
        short myShortyShort = -100;
        int myIntyInt = 100;
        long myLongestLong = 50000L + 10L * (myBitByte + myShortyShort + myIntyInt);
        System.out.println(myLongestLong);
        // float and double pritives
        System.out.println("Double Value Range (" + Double.MIN_VALUE +" to "+ Double.MAX_VALUE+" )");
        int myIntvalue = 5; float myFloatValue = 5f; double myDoubleValue = 5d;
        System.out.println(myIntvalue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
        float myOtherFloatVlue = (float) 5.25;
        // float challenge
        System.out.println(myOtherFloatVlue);
        double myLbs = 20d;
        double kiloGramConversionNumber = 0.45359237;
        double myKilograms = (double) myLbs * kiloGramConversionNumber;
        System.out.println(myKilograms);
        // Char and Boolean
        //Char
        char myChar = 'D';
        char myCharUnicode = '\u0044';
        char myCharIntergerValue = 68;
        System.out.println("MyChar 'D' Value = " +myChar+"\nMyCharInterger '68' Value = "+myCharIntergerValue+"\nMyCharUnicode need a backslash first then u'u004' Value = " + myCharUnicode);
        // Char Challenge
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 9829;
        System.out.println("My Simple Char '?' = "+mySimpleChar+"\nMy Unicode Char '003F' = "+myUnicodeChar+"\nmy Decimal Char '63' = "+myDecimalChar);
        // Boolean
        // can only be true or false
        // String
        String myString = "this is a string";
        System.out.println("myString is eual to "+myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is eual to "+myString);
        String mySecondString = "I wish I had \u00241,000,000.00!!";
        System.out.println(mySecondString);
    }

};