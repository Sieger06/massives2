public class Main {

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1 - 3");
        //Задача 1
        int sum = 0;
        var arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        //Задача 2
        int minSpending = arr[0];
        int maxSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxSpending){
                maxSpending = arr[i];
            }
            if (minSpending > arr[i]){
                minSpending = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составляет " + maxSpending + " рублей.");
        System.out.println("Минимальная сумма трат за день составлет " + minSpending + " рублей.");

        //Задача 3
        double averageSpending = sum / 30;
        System.out.println("Средняя трата за день составит " + averageSpending + " рублей.");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}