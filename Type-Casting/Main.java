public class Main {
    public static void main(String[] args) {
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);


        // Narrowing Casting
        double aDouble = 99.99d;
        int anInt = (int) aDouble; //Manual casting: double to int
        System.out.println(aDouble);
        System.out.println(anInt);
    }
}