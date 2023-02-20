package kr.re.kitri.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleClassifier {

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> condition) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (condition.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(150, "red"), new Apple(130, "blue"),
                new Apple(180, "red"), new Apple(150, "red"),
                new Apple(160, "blue"), new Apple(120, "red"),
                new Apple(130, "red"), new Apple(160, "blue"),
                new Apple(140, "blue"), new Apple(170, "red")
        );

        // 150그램 이상의 사과를 필터링
        List<Apple> result = filterApples(apples, apple -> apple.getColor().equals("red"));
        System.out.println(result);


        // 150그램 이상의 사과를 필터링
//        List<Apple> filteredApples = new ArrayList<>();
//        for (Apple apple : apples) {
//            if (apple.getWeight() >= 150 && apple.getColor().equals("red")) {
//                filteredApples.add(apple);
//            }
//        }
//        System.out.println(filteredApples);



    }
}


