import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력");
        int a = sc.nextInt();

        if ( a % 3 == 0 && a % 5 == 0){
            System.out.println("3과 5의 배수입니다");
        }
        else if (a % 3 == 0 && a % 5 != 0){
            System.out.println("3의 배수입니다");
        }
        else if (a % 3 != 0 && a % 5 == 0){
            System.out.println("5의 배수입니다");
        }
        else if (a % 3 != 0 && a % 5 != 0){
            System.out.println("해당 조건을 만족하지 않습니다");
        }
    }
}
