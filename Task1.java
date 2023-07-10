package homework;

public class Task1 {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!"); // 1
        foo(str);
    }

    public static void foo(String text) { // 2
        System.out.println(text.charAt(text.length() - 1));// 3
        if (text.contains("Java")) { // 4
            System.out.println("Найдено");

        } else {
            System.out.println("Не найдено");
        }
        String text2 = text.replace('a', 'o'); // 5
        System.out.println(text2);
        String textU = text2.toUpperCase();
        System.out.println(textU); // 6
        String textL = text2.toLowerCase();
        System.out.println(textL); // 7
        String unJava = text.substring(14, 18);
        System.out.println(unJava); // 8
    }
}
