import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(234);
        numbers.add(33);
        numbers.add(4);
        numbers.add(59);
        numbers.add(60);
        numbers.add(17);

        numbers.stream()
                .forEach(x -> System.out.println(Math.pow(x, 2)));


        ArrayList<String> arrays = new ArrayList<>();
        arrays.add("pupil");
        arrays.add("sky");
        arrays.add("flowers");
        arrays.add("information");
        arrays.add("beautiful");
        arrays.add("cross-stitch");
        arrays.add("bear");

        arrays.stream()
                .filter(x -> x.length() > 5)
                .forEach(System.out::println);


        int maxValue = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println(maxValue);



        String longestWord = arrays.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse(null);
        System.out.println(longestWord);



    }
}





/*
Задача 1: Условие: Напишите программу, которая используя Stream API находит сумму квадратов чисел из массива.

Задача 2: Условие: Напишите программу, которая используя Stream API выводит строки из массива, длинна которых больше 5.

Задача 3: Условие: Напишите программу, которая используя Stream API находит наибольшее число в массиве.

Задача 4: Условие: Напишите программу, которая используя Stream API находит самое длинное слово из массива.


 */

//    public static void handler (int number){
//        double result = Math.pow(number, 2);
//        System.out.println(result);
//    }




//        for (Integer number:numbers) {
//    handler(number);
//        }

//        Stream<Integer> stream = numbers.stream();
////        stream.forEach(Main::handler);
//        stream.forEach(x-> System.out.println(Math.pow(x,2)));
//        }
//
//        numbers.stream()
//                .forEach(x -> System.out.println(Math.pow(x, 2)));

//        numbers.stream()
//                .filter(x->x % 2 == 0)
//                .forEach(System.out::println);


//        numbers.stream()
//                .map(x-> Math.pow(x,2))
//                .forEach(System.out::println);

//        int result = numbers.stream().
//                reduce(0, (acc, elem)->{
//                    System.out.printf("acc: %d elem: %d%n", acc, elem);
//                    return acc+elem;
//                });
//        System.out.println(result);



//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new PartTimeEmployee("Анатолий", "fffff", 40.5, 5));
//        employees.add(new PartTimeEmployee("ffff", "tttt", 40.5, 59));
//        employees.add(new FullTimeEmployee("Анатолий", "fffff", 40.5));
//        employees.add(new FullTimeEmployee("rrrrrr", "ssss", 4.5)) ;
//        employees.add(new PartTimeEmployee("eeeeee", "aaaaa", 40, 51)) ;
//
//        double totalSalary = 0.0;
//
//        for (Employee employee: employees) {
//            totalSalary+=employee.getSalary();
//
//
//        }
//        System.out.println(totalSalary);
//    }

