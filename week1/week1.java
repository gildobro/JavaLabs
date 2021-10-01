package week1;

public class week1 {
    public static void main(String[] args) {
        // -----------Integers---------------
        byte a = 127; // 1 byte ( 8bits) Max capacity= 127
        short b = 32767; // 2 bytes Max capacity = 32767
        int c = 2147483647; // 4 bytes Max capacity is that <--
        long d = 2140000000; // 8 bytes
        // -----------Decimal----------------
        float e = 1.234567F; // can hold up to 7 decimal places
        double f = 1.2345678910111213; // can hold up to 14 decimal places
        // ------------Other Variables-------------------------
        boolean g = true;
        char h = 'H'; // single quotations**
        String i = "I am a student"; // double quotations**
        // java is an object oriented language....
        // any variables have its own class
        double x;
        Double x2;
        float f2;
        Float f4;
        int dd;
        Integer dd2;

        final double TORONTO_SALES_TAX = 0.13; // the constant version of java; cannot be changed

        // strings are not variable in java!
        String name = "Gil"; // not a variable, its a class
        String lastName = new String("Dobrovinsky"); // same result ^

        System.out.println(name + " " + lastName);

    }
}
