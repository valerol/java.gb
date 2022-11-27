import java.util.ArrayList;
import Lesson.Lesson1.*;
import Task.Task;

public class Lesson1 
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new NOperations("Задание 1", "Вычислить n-ое треугольное число и n!"));
        tasks.add(new SieveEratosthenes("Задание 2", "Вывести все простые числа от 1 до 1000"));
        tasks.add(new SimpleCalc("Задание 3","Реализовать простой калькулятор (ввод с консоли двух чисел)"));
        tasks.add(new SolveEquation("Задание 4","Задано уравнение вида q+w=e, q,w,e>0. Некоторые цифры могут быть заменены знаком вопроса, например, 2?+?5=69. Требуется восстановить выражение до верного ответа. Предложите хотя бы одно решение или сообщите, что его нет."));

        for (Task task : tasks) {
            task.printSummary();
            task.execute();
        }
    }
}






