// import java.lang.Math;

public class ThisMath {
    public static void main(String[] args){

        // square root
        System.out.println(Math.sqrt(64));

        // find highest value of two numbers
        System.out.println(Math.max(5, 6));

        // find lowest value of two numbers
        System.out.println(Math.min(5, 6));

        // get absolute value
        System.out.println(Math.abs(-4));

        // get random value between 0 and 1
        System.out.println(Math.random());

        // get random integer
        // without a range this will always return 0, it rounds down
        System.out.println((int)Math.random());

        // get random number in range
        int d = (int)(Math.random() * 101);
        System.out.println(d);

        // cube root
        System.out.println(Math.cbrt(27));

        // returns decimal rounded up
        System.out.println(Math.ceil(9.7));

        // return 1st number to power of 2nd number
        System.out.println(Math.pow(2, 4));

        /* there are also trig functions but they don't seem 
        commonly useful so I am excluding them*/
    }
}
