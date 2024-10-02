import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("첫번째 연산자(+, -, *, /): ");
        String operation1 = sc.next();

        System.out.print("두번째 숫자를 입력해주세요 : ");
        int second = sc.nextInt();

        System.out.print("두번째 연산자(+, -, *, /): ");
        String operation2 = sc.next();
        System.out.print("세번째 숫자를 입력해주세요 : ");
        int third = sc.nextInt();

        double result = 0.0;

        switch (operation1){
            case "*":
                switch(operation2){
                    case "*":
                        result = (first*second)*third;
                        break;
                    case "/":
                        result = (first*second)/third;
                        break;
                    case "+":
                        result = (first*second)+third;
                        break;
                    case "-":
                        result = (first*second)-third;
                        break;
                }
                break;
            case "/":
                switch(operation2){
                    case "*":
                        result = (first/second)*third;
                        break;
                    case "/":
                        result = (first/second)/third;
                        break;
                    case "+":
                        result = (first/second)+third;
                        break;
                    case "-":
                        result = (first/second)-third;
                        break;
                }
                break;
            case "+":
                switch(operation2){
                    case "*":
                        result = first+(second*third);
                        break;
                    case "/":
                        result = first/(second/third);
                        break;
                    case "+":
                        result = first+(second+third);
                        break;
                    case "-":
                        result = first-(second-third);
                        break;
                }
                break;
            case "-":
                switch(operation2){
                    case "*":
                        result = first*(second*third);
                        break;
                    case "/":
                        result = first/(second/third);
                        break;
                    case "+":
                        result = first+(second+third);
                        break;
                    case "-":
                        result = first-(second-third);
                        break;
                }
                break;
        }
        System.out.println(result);
    }
}
