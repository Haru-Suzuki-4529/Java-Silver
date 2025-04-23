package chapter7.Q6;

public class Child implements Parent2 {
    public void sample() {
        Parent2.super.sample();
        System.out.println("Java!");
    }
}
