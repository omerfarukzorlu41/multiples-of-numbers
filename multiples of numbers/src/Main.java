import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();
        System.out.println("less than the entered number, powers of 4");
        for(int i =1;i<number;i*=4){
            System.out.println(i);
        }
        System.out.println("less than the entered number, powers of 5");
        for(int i =1;i<number;i*=5){
            System.out.println(i);
        }
    }
}
