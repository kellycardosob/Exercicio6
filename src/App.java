import java.util.Scanner;

public class App {

    public static void main(String[] args)  {
        System.out.println("Digite o raio da circunferencia ");

        double raio = new Scanner(System.in).nextFloat();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área da circunferencia é de: " + area);
    }
}
