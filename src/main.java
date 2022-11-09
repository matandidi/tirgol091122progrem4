import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.println("please enter a number N: ");
            num = scanner.nextInt();

        } while (num<0);
        for (int i = 1; i<=num;i++){
            if (num / i == num || i%2 ==0){
                sum =+1;
                System.out.println(i);

            }
        }

    }
}
