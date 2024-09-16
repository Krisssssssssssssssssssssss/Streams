package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//        * Take a look at the file students.csv. Copy the file to the root directory of your project.
//        * Use streams to read and output the file line by line (Hint: Files.lines(Path.of("students.csv")))
//        * Remove the header
//* Convert each line into the class Student
//* Remove invalid lines and duplicates
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
            List<Integer> myNewList = myList.stream().filter(x -> x % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("My new list: " + myNewList);

            myList.stream().map(x -> x + x)
                    .sorted()
                    .forEach(System.out::println);
            int sum = myList.stream().map(x -> x + x).sorted().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}