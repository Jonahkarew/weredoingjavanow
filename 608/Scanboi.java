import java.util.Scanner;

public class Scanboi {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // can crash if wrong input is sent
        // System.out.println("type an integer");
        // int x = sc.nextInt();
        // System.out.println("this is work now " + x);
        // NotCrash(args);
        Conditions(args);
    }

    public static void NotCrash(String[] args){
        System.out.println("type an integer");
        boolean x = sc.hasNextInt();
        System.out.println(x);
    }

    public static void Conditions(String[] args){
        System.out.println("type an integer");
        boolean x = sc.hasNextInt();
        if(x){
            System.out.println("the condition was successful");
        }
        else{
            System.out.println("the condition was NOT successful");
        }
    }
}
