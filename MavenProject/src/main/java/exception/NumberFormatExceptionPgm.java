package exception;

public class NumberFormatExceptionPgm {

    public static void main(String[] args) {
        String name = "ammu";
        try {
            int i = Integer.parseInt(name);
        } catch (NumberFormatException q) {
            System.out.println("over come");
        } finally {
            System.out.println("print");
        }
    }
}
