package model;

import java.util.Scanner;
import java.util.ArrayList;

public final class Reminder{
        /*Scanner userinput = new Scanner(System.in);
        System.out.println("What do you want me to remind you of?");

        String reminder = userinput.nextLine();
        System.out.println("Is this correct?" + reminder);*/
        static ArrayList<String> listofReminders = new ArrayList<String>();


        public Object checkReminder(String reminder){
            System.out.println("Is this correct? " + reminder);
            Scanner userinput = new Scanner(System.in);
            System.out.println("y/n");
            String answer = userinput.nextLine();

                if (answer.equals("y") ){
                    return String.valueOf(addtoList(reminder));
                }

                else{
                    return createReminder();
                }



        }

        public Object createReminder(){
            Scanner userinput = new Scanner(System.in);
            System.out.println("What do you want me to remind you of?");
            String reminder = userinput.nextLine();
            checkReminder(reminder);

            return null;
        }

        public boolean addtoList(String reminder){
            return listofReminders.add(reminder);
        }

        public static void showReminders(){
            System.out.println("Reminders: " + listofReminders);
        }



}

