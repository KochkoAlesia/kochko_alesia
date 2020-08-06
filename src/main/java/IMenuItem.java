import java.util.Arrays;
import java.util.Scanner;

public class IMenuItem {

    Scanner sc = new Scanner(System.in);

    public void printMenu() {
        System.out.println("Нажмите 1, если необходимо выполнить первое задание");
        System.out.println("Нажмите 2, если необходимо выполнить второе задание");
        System.out.println("Нажмите 3, если необходимо выполнить третье задание");
        System.out.println("Нажмите 4, если необходимо выполнить четвертое задание");
        System.out.println("Нажмите 0, если хотите выйти");
        run();
    }

    public void run() {
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    taskOne();
                    break;
                case 2:
                    taskTwo();
                    break;
                case 3:
                    taskThree();
                    break;
                case 4:
                    taskFour();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Не корретный ввод, попробуйте еще раз");
            }
        }
    }

    public void taskOne() {
        System.out.println("Введите целое число");
        int inputNumber = sc.nextInt();
        final int ORIGINAL_NUMBER = 7;
        if (inputNumber > ORIGINAL_NUMBER) {
            System.out.println("Hello");
        }else {
            System.out.println("Задача выполнена. Сделайте Ваш выбор");
        }

    }

    public void taskTwo() {
        System.out.println("Введите имя");
        String compareWord = sc.next();
        final String ORIGINAL_NAME = "Вячеслав";
        if (compareWord.equalsIgnoreCase(ORIGINAL_NAME)) {
            System.out.println("Привет " + ORIGINAL_NAME);
        } else System.out.println("Нет такого имени");
    }

    public void taskThree() {
        System.out.println("Введите размер массива");
        int[] originalArray = new int[sc.nextInt()];
        for (int i =0; i<originalArray.length; i++) {
            originalArray[i] = (int) (20 + Math.random()*40);
        }
        System.out.println(Arrays.toString(originalArray));
        for (int array : originalArray) {
            if (array % 3 == 0) {
                System.out.println(array);
            }
        }
        System.out.println("Задача решена, сделайте свой выбор");
    }

    public void taskFour() {
        String order = "[((())()(())]]";
        int first = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        char[] orderCar = order.toCharArray();
        for (int i = 0; i < orderCar.length; i++) {
            switch (orderCar[i]) {
                case '[':
                    first = first + 1;
                    break;
                case ']':
                    two = two + 1;
                    break;
                case '(':
                    three = three + 1;
                    break;
                case ')':
                    four = four + 1;
                    break;
            }
        }
        if (first == two && three == four) {
            System.out.println("Последовательность можно считать правильной");
        } else System.out.println("Последовательность является некорректной");
    }
}
