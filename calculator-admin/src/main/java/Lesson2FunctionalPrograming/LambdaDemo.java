package Lesson2FunctionalPrograming;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class LambdaDemo {

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }

    public void printNum(IntPredicate predicate) {
        int[] arr = {1,2,3,4,5,6};
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
//        new Thread(() -> {System.out.println("wanna stay");}).start();
//        int i = calculateNum((left, right) -> left * right);
//        System.out.println(i);
        LambdaDemo ld = new LambdaDemo();
        ld.printNum(value -> value%2==0);
    }
}
