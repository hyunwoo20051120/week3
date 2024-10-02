import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("과목 1을 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("과목 2을 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("과목 3을 입력해주세요 : ");
        int num3 = sc.nextInt();
        System.out.print("과목 4을 입력해주세요 : ");
        int num4 = sc.nextInt();

        double avg = (double) (num1 + num2 + num3 + num4) / 4;

        if(avg >= 60){
            System.out.print("합격");
        }else{
            System.out.print("불합격");
        }
    }
}