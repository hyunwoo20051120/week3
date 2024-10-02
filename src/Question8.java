import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 키: ");
        int height = sc.nextInt();
        System.out.print("Enter 몸무게: ");
        int weight = sc.nextInt();
        int BIM =  weight / ( height * height );

        if (BIM < 18.5) {
            System.out.println("저체중");
        }
        else if (BIM >= 18.5 && BIM <= 24.9) {
            System.out.println("정상");
        }
        else if (BIM >= 25 && BIM <= 29.9) {
            System.out.println("과체중");
        }
        else if (BIM >= 30) {
            System.out.println("비만");
        }
    }
}
