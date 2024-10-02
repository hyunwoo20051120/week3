import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int second = sc.nextInt();
        System.out.print("세번째 숫자를 입력해주세요 : ");
        int third = sc.nextInt();

        int max = 0;

        if(first > second) {
            if(first > third){
                max = first;
            }else{
                max = third;
            }
        }else{
            if(second > third){
                max = second;
            }else{
                max = third;
            }
        }
        System.out.print("가장 큰 수는 : ");
        System.out.println(max);
    }
}
