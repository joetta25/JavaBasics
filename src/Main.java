
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

        String myString = " hello my name is  joetta";
        myString = myString + " I am a software developer";
        System.out.println(" my string is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println(" my string is equal to " + myString);
        String myStringNumber = " 244.95";
        myStringNumber = myStringNumber + " 764.900";
        System.out.println(myStringNumber);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;

        System.out.println(" Laststring is equal to " + lastString);

    }
}
