public class IfCondition {
    public static void main (String[] args){
        int a = 1;
        int b = 2;
        int c = 3;

        /*

        conditional operators include:
        <   less than
        >   greater than
        !=  not equal to
        ==  equal to
        <=  less than equal to 
        >=  greater than equal to

        */

        if (a > b){
            System.out.println(" a is greeater than b");
        }
        else {
            System.out.println("a is not greater than b");
        }


        System.out.println("==========================================================");

        if (a < b){
            if(b > c){
                System.out.println(" b is greater than c");
            }
            else{
                System.out.println("b is not greater than c");
            }
        }
        else{
            System.out.println("b is not greater than a");
        }
    }
}
