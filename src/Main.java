import java.util.Arrays;

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

    public static <T extends Number> double finAverage(T[] arr) {
        double result = 0;
        for (T num : arr) {
            result += num.doubleValue();
        }
        return result / arr.length;
    }

    public static <T extends Comparable<T>> T findMaxArray(T[] arr) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
    public static <T extends Comparable<T>> T findMinArray(T[]arr){
        T min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].compareTo(min)<0){
                min=arr[i];
            }
        }
        return min;
    }
    public static <T extends Comparable<T>>void sortArray(T[]arr){
       for (int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j].compareTo(arr[j+1])>0){
                   T tmp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=tmp;
               }
           }
       }
    }

    public static void main(String[] args) {
        Integer max = getMax(10, 185, 310);
        System.out.println("Max number= " + max);
        Integer min = getMIn(10, 251, 5, 48, 66);
        System.out.println("Min number= " + min);
        Integer[] integers = {2, 4, 8, 7, 4, 7, 4, 6, 1};
        System.out.println("Average array= " + finAverage(integers));
        Integer[] integers1 = {45, 8, 4252, 48, 99, 995643, 45, 28};
        Double[] doubles={4.5,45.2,98.1};
        String[]strings={"21","4555","65"};
        System.out.println("Max in array= " + findMaxArray(integers1));
        System.out.println("Min in array= "+findMinArray(doubles));
        System.out.println("Min in array= "+findMinArray(integers1));
        System.out.println("Min in array= "+findMinArray(strings));
        sortArray(integers1);
        System.out.println("Sorted array  "+Arrays.toString(integers1));


    }
}