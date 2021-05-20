public class LogicalOperator {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c = 14;


        if (b > a && c > b){
            System.out.println("This is the and operator");
        }
        else{
            System.out.println("you shouldn't be here");
        }


        System.out.println("=========================================");


        if (a < b || c < b){
            System.out.println("this is the OR operator");
        }
        else {
            System.out.println("you shouldnt be here");
        }
    }
}
