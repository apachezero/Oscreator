package Lesson1;

public class PrintAnything <T>{
    T anything;
    public PrintAnything(T anything) {
        this.anything = anything;
    }
    public void print() {
        System.out.println(this.anything);
    }
}
