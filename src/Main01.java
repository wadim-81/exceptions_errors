import java.util.Random;

public class Main01 {
    public static void main(String[] args) {
        //Создать 2 новых вида исключений
//Один "проверяемый"
//Один "непроверяемый"

//Решить две задачи:

//Написать метод. В него вводится целое число - он выводит сумму всех чисел от 1 до этого числа.
//Если сумма вышла больше 10_000, то бросьте непроверяемое исключение.

//Написать метод. В него вводится 2 числа. Метод ничего не возвращает, но если второе число больше первого,
//то бросьте проверяемое исключение.

//Если это необходимо - используйте try-catch


//** Числа для методов считайте из файла. Оформите его чтение правильным образом



         int number = 100;
            try {
                int sum = calculate(number);
                System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        public static int calculate(int number) {
            int sum = 0;
            for (int i = 1; i <= number; i++)
                sum += i;
            if (sum > 10_000) {
                throw new RuntimeException("Сумма превышает 10 000");
            }return sum;

            }}