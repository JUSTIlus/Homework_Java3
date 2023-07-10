package homework;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(minus(1, 2));
        System.out.println(multi(1, 2));
        System.out.println(div(1, 2));
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float minus(float a, float b) {
        return a - b;
    }

    public static float multi(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

}
