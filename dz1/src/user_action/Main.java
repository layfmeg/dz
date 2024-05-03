package user_action;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAction[] userActions = new UserAction[]{
                new CircleSquare(scanner),
                new RectangleSquare(scanner)
        };

        for (int i = 0; i < userActions.length; i++) {
            System.out.println(i+1 + " " + userActions[i].getName());
        }

        System.out.println("Виберіть пункт меню");
        int choice = scanner.nextInt() - 1;

        if (choice >=0 && choice < userActions.length){
            userActions[choice].doAction();
        } else {
            System.out.println("Ви вибрали невірний пункт меню");
        }






    }
}
