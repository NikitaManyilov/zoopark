import java.util.Scanner;

class Cat1 extends Animal {

    Cat1(double DistanceRun, double DistanceJump, double DistanceSwim) {
        super(DistanceRun, DistanceJump, DistanceSwim);
    }
}
class Cat2 extends Animal {

    Cat2(double DistanceRun, double DistanceJump, double DistanceSwim) {
        super(DistanceRun, DistanceJump, DistanceSwim);
    }
}
class Dog1 extends Animal {

    Dog1(double DistanceRun, double DistanceJump, double DistanceSwim) {
        super(DistanceRun, DistanceJump, DistanceSwim);
    }
}
class Dog2 extends Animal {

    Dog2(double DistanceRun, double DistanceJump, double DistanceSwim) {
        super(DistanceRun, DistanceJump, DistanceSwim);
    }
}
public class Zoopark {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceJump = 2;
        double distanceSwim = 0;
        Animal cat1 = new Cat1(distanceRun, distanceJump, distanceSwim);

        distanceRun = 250;
        distanceJump = 3;
        distanceSwim = 0;
        Animal cat2 = new Cat2(distanceRun, distanceJump, distanceSwim);

        distanceRun = 500;
        distanceJump = 5;
        distanceSwim = 15;
        Animal dog1 = new Dog1(distanceRun, distanceJump, distanceSwim);

        distanceRun = 600;
        distanceJump = 4;
        distanceSwim = 20;
        Animal dog2 = new Dog2(distanceRun, distanceJump, distanceSwim);


        System.out.println("Рыжик может пробежать: " + cat1.getDistanceRun() + " м. \nМурка может пробежать: " + cat2.getDistanceRun() +
                " м. \nБобик может пробежать: " + dog1.getDistanceRun() + " м. \nЧарли может пробежать: " + dog2.getDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");

        double distance = scanner.nextDouble();

        System.out.println("Рыжик пытается пробежать. Результат: " + cat1.run(distance));

        System.out.println("Мурка пытается пробежать. Результат: " + cat2.run(distance));

        System.out.println("Бобик пытается пробежать. Результат: " + dog1.run(distance));

        System.out.println("Чарли пытается пробежать. Результат: " + dog2.run(distance));

        System.out.println("\n****************\n");

        System.out.println("Рыжик может прыгнуть: " + cat1.getDistanceJump() + " м. \nМурка может прыгнуть: " + cat2.getDistanceJump() +
                " м. \nБобик может прыгнуть: " + dog1.getDistanceJump() + " м. \nЧарли может прыгнуть: " + dog2.getDistanceJump() + " м.");

        System.out.println("Введите высоту препятствия:");

        distance = scanner.nextDouble();

        System.out.println("Рыжик пытается прыгнуть. Результат: " + cat1.jump(distance));

        System.out.println("Мурка пытается прыгнуть. Результат: " + cat2.jump(distance));

        System.out.println("Бобик пытается прыгнуть. Результат: " + dog1.jump(distance));

        System.out.println("Чарли пытается прыгнуть. Результат: " + dog2.jump(distance));

        System.out.println("\n****************\n");

        System.out.println("Рыжик может проплыть: " + cat1.getDistanceSwim() + " м. \nМурка может проплыть: " + cat2.getDistanceSwim() +
                " м. \nБобик может проплыть: " + dog1.getDistanceSwim() + " м. \nЧарли может проплыть: " + dog2.getDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");

        distance = scanner.nextDouble();

        System.out.println("Рыжик пытается проплыть. Результат: " + cat1.swim(distance));

        System.out.println("Мурка пытается проплыть. Результат: " + cat2.swim(distance));

        System.out.println("Бобик пытается проплыть. Результат: " + dog1.swim(distance));

        System.out.println("Чарли пытается проплыть. Результат: " + dog2.swim(distance));
    }
}
