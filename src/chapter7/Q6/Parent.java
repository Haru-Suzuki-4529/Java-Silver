package chapter7.Q6;

public interface Parent {
    default void sample() {
        System.out.println("Hello");
    }
}