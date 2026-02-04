import java.util.Scanner;

public class JavaTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу (1-4):");
        System.out.println("1 - Приветствие с условием");
        System.out.println("2 - Сумма и среднее в массиве");
        System.out.println("3 - Простейший калькулятор");
        System.out.println("4 - Обратный отсчет и поиск числа");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }

    // Задача 1: Приветствие с условием
    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.next();

        System.out.print("Введите текущий час (0-24): ");
        int hour = scanner.nextInt();

        if (hour >= 6 && hour <= 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 13 && hour <= 17) {
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour <= 22) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }

        scanner.close();
    }

    // Задача 2: Сумма и среднее в массиве
    public static void task2() {
        int[] numbers = {2, 5, -3, 10, 1};

        // Вывод массива
        System.out.print("Массив: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Сумма элементов
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма элементов: " + sum);

        // Среднее арифметическое
        double average = (double) sum / numbers.length;
        System.out.println("Среднее арифметическое: " + average);

        // Максимальный элемент
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }

    // Задача 3: Простейший калькулятор
    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean error = false;

        switch(operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    error = true;
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция!");
                error = true;
        }

        if (!error) {
            System.out.println("Результат: " + num1 + " " + operation + " " + num2 + " = " + result);
        }

        scanner.close();
    }

    // Задача 4: Обратный отсчет и поиск числа
    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число N (для выхода введите 0 или меньше): ");
            int n = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            if (n <= 0) {
                System.out.println("Программа завершена.");
                break;
            }

            System.out.println("Обратный отсчет:");
            for (int i = n; i >= 1; i--) {
                System.out.println(i);
            }

            System.out.print("Хотите найти числа, кратные 3 в этом диапазоне? (да/нет): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("да")) {
                System.out.print("Числа, кратные 3: ");
                for (int i = n; i >= 1; i--) {
                    if (i % 3 == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println(); // перенос строки
            }
            System.out.println(); // пустая строка для разделения
        }

        scanner.close();
    }
}
