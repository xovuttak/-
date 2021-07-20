import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("ведите первое число" );
        float a =Scanner.nextInt();
        System.out.println(a + "первое число");
        System.out.println("ведите второе число");
        float b =Scanner.nextInt();
        float c = a / b;
        System.out.println("ответ:" + c);

    }
}
