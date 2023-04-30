package Lesson1;

public class TryEverything {

    enum Person {
        F(10),
        S(20);
        int age;
        Person(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student student = Student.builder().age(11).build();
        Student student1 = Student.builder().age(11).build();
        int hashCode = student.hashCode();
        int hashCode1 = student1.hashCode();
        System.out.println(hashCode);
        System.out.println(hashCode1);
        System.out.println(student==student1);

//        PrintAnything<Long> p = new PrintAnything<>(10000L);
//        PrintAnything<Double> d = new PrintAnything<>(10000.0);
//        PrintAnything<Integer> i = new PrintAnything<>(100);
//        String  words = "English";
//        boolean engLish = words.equalsIgnoreCase("engLish");
//        System.out.println(engLish);



    }
}

