package ui;

import model.Reminder;
import java.util.ArrayList;
import java.util.Scanner;


public class todoList {
    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Hello, would you like to create a reminder? (y/n)");
        String answer = userinput.nextLine();

        if(answer.equals("y") || answer.equals("Y")|| answer.equals("yes")){

            Reminder reminder1 = new Reminder();
            reminder1.createReminder();


        }

        else{
            System.out.println("Good Bye!");
        }












        Reminder.showReminders();





    }
}
