public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задание 1");
        int[] expenses = generateRandomArray();
        int sum = 0;
        for (int i : expenses) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }


    private static void task2() {
        System.out.println("Задание 2");

        int[] expenses = generateRandomArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.printf("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println(" ");
    }

    private static void task3() {
        System.out.println("Задание 3");
        int[] expenses = generateRandomArray();
        int sum = 0;
        double averageExpense = (double) sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense);
    }

    private static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}