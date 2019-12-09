
public class Main {

    public static void main (String[] args) {

//        int myMinValue = Integer.MIN_VALUE;
//        int myMaxValue = Integer.MAX_VALUE;

//        System.out.println("My max value = " + myMaxValue);
//        System.out.println("My min value = " + myMinValue );
//        char myFirstCharValue = 'D';
//        char mySecondCharValue = '\u0044';
//
//        System.out.println(myFirstCharValue);
//        System.out.println(mySecondCharValue);
//
//        String myString = " hello my name is  joetta";
//        myString = myString + " I am a software developer";
//        System.out.println(" my string is equal to " + myString);
//        myString = myString + " \u00A9 2019";
//        System.out.println(" my string is equal to " + myString);
//        String myStringNumber = " 244.95";
//        myStringNumber = myStringNumber + " 764.900";
//        System.out.println(myStringNumber);
//        String lastString = "10";
//        int myInt = 50;
//        lastString = lastString + myInt;
//        System.out.println("LastString is equal to " + lastString);
//        double doubleNumber = 120.47d;
//        lastString = lastString + doubleNumber;
//
//        //----if-then statements


//        boolean isAlien = false;
//
//        if( isAlien == false){
//
//            System.out.println( "Its not an alien");
//
//        }
//
//        int topScore = 100;
//        if (topScore < 100 ) {
//            System.out.println("Top score is less than 100");
//        }
//
//        int secondTopScore = 95;
//        if ((topScore > secondTopScore) && (topScore < 100)) {
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//        if ((topScore > 90) || (secondTopScore <= 90 ) ) {
//            System.out.println(" it works");

//        boolean isCar = false ;
//
//        if(isCar == true) {
//            System.out.println("This is true");
//        }
//
//        isCar = true;
//
//        boolean wasCar = isCar ? true : false;
//        if(wasCar) {
//            System.out.println("woow this is true ");
//        }

        double myFirstNumber = 20.00d;
        double mySecondNumber = 80.00d;
        double sumOfTheNumbers = (myFirstNumber + mySecondNumber) * 100.00d;
        System.out.println("the sum of the two numbers = " + sumOfTheNumbers);
       double myTotalValue = sumOfTheNumbers % 40.00d;
        System.out.println("the remainder is  =" + myTotalValue);

        boolean theNewSum = (myTotalValue == 0) ? true : false;
        System.out.println(" isNoRemainder = " + theNewSum);

        if( !theNewSum ) {
            System.out.println("Got some remainder");
        }

    }
}
