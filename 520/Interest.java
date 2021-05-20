/* 
you take a loan from a friend and need to calculate how much you will owe him after 3 months
you are going to pay him back 10% of the remaining loan each month
*/

import java.util.Scanner;

public class Interest 
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        for (int i = 0; i < 3; i++){
           amount = amount- amount *0.1;
        }


        System.out.println(amount);
    }
}