/**
 * Created by 6 on 21.03.2017.
 */
public class Parent {
    static {
        System.out.println("static init");
    }
    public Parent() {
        System.out.println("constructor");
    }
    public static String getString1(String message) {
        return message;
    }
}
