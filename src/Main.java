public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1");

        int[] expenses = {1500, 2300, 1200, 800, 3000};
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        System.out.println("Задача№2");

        int[] expenses1 = {1500, 2300, 1200, 800, 3000};
        int minExpense = expenses[0];
        int maxExpense = expenses[0];
        for (int expense : expenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        System.out.println("Задача№3");

        int[] expenses2 = {1500, 2300, 1200, 800, 3000};
        int total1 = 0;
        for (int expense : expenses) {
            total1 += expense;
        }
        double average = total1 / 5.0;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        System.out.println("Задача№4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            // Меняем местами символы
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(reverseFullName));
    }
}