public class Main {
    //    Завдання 1:
//    Напишіть шаблонний метод, що повертає максимум із трьох переданих параметрів.
//    Завдання 2:
//    Напишіть шаблонний метод, що повертає мінімум із п’яти переданих параметрів.
//    Завдання 3:
//    Напишіть шаблонний метод для пошуку середньо арифметичного значення в масиві.
//    Завдання 4:
//    Реалізуйте шаблонний метод для пошуку максимуму в масиві.
//    Завдання 5:
//    Реалізуйте шаблонний метод для пошуку мінімуму в масиві.
//    Завдання 6:
//    Реалізуйте шаблонний метод для сортування масиву.
//    Завдання 7:
//    Реалізуйте шаблонний метод для двійкового пошуку в масиві.
    public static <T extends Comparable<T>> T getMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMIn(T a, T b, T c, T d, T e) {
        T min = a;
        if (b.compareTo(min) < 0) {
            min = b;
        }
        if (c.compareTo(min) < 0) {
            min = c;
        }
        if (d.compareTo(min) < 0) {
            min = d;
        }
        if (e.compareTo(min) < 0) {
            min = e;
        }
        return min;
    }
public static <T extends Number>double finAverage(T[]arr){
        double result=0;
        for(T num:arr){
            result+= num.doubleValue();
        }
        return result/ arr.length;
}
    public static void main(String[] args) {
        Integer max = getMax(10, 185, 310);
        System.out.println("Max number= " + max);
        Integer min=getMIn(10,251,5,48,66);
        System.out.println("Min number= "+min);
        Integer[] integers={2,4,8,7,4,7,4,6,1};
        System.out.println("Average array= "+finAverage(integers));

    }
}