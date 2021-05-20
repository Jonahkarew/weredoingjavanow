/* 
you take a loan from a friend and need to calculate how much you will owe him after 3 months
you are going to pay him back 10% of the remaining loan each month
*/

import java.util.Scanner;

public class Interest 
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i < 3; i++){
          double dubAmount = Math.floor(amount * 0.9);
            amount = (int)dubAmount;
        }

        scanner.close();
        System.out.println(amount);
    }
}