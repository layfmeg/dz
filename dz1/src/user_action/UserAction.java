package user_action;

import java.util.Scanner;

public abstract class UserAction {

    protected abstract void doAction();

    protected abstract String getName();

}

class CircleSquare extends UserAction {

    private final Scanner scanner;

    public CircleSquare(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    protected void doAction() {
        System.out.println("Введіть радіус круга");
        double radius = scanner.nextDouble();
        double square = Math.PI * Math.pow(radius,2);
        System.out.println("Площа круга дорівнює  = " + square);
    }

    @Override
    protected String getName() {
        return "Порахувати площу круга";
    }
}

class RectangleSquare extends UserAction {

    private final Scanner scanner;

    public RectangleSquare(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    protected void doAction() {
        System.out.println("Введіть довжину");
        int length = scanner.nextInt();
        System.out.println("Введіть ширину");
        int width = scanner.nextInt();
        int square = length * width;
        System.out.println("Площа прямокутника дорівнює = " + square);
    }

    @Override
    protected String getName() {
        return "Порахувати площу прямокутника";
    }
}