public class OperatorExample2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 복합적인 수식
        int result = (++a * 2 + 3 > 10) ? 10-2 : 10+2;

        // ++a = 11
        // 11*2 = 22
        // 22+3 = 25
        // 23>10 = false
        // 10-2 = 8

        System.out.println("result: " + result);
    }
}
