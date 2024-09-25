public class operation {
    public static void main(String[] args) {

        int result = (5 + 3) * 2; //16

        int x = 5;
        int y = ++x;  // x는 먼저 증가하고, y에 6이 저장됨

        System.out.println("y = "+ y); //6

        int z = ++x;
        System.out.println("z = "+ z); //7

        boolean flag = false;
        boolean notFlag = !flag;  // flag가 false일 때, notFlag는 true가 됨

        System.out.println("notFlag = " + notFlag); //true
        boolean flag2 = !notFlag;
        System.out.println("flag2 = " + flag2); //false

        int a = 10;
        int b = 3;
        int product = a * b;   // 곱셈, 결과: 30
        int quotient = a / b;  // 나눗셈, 결과: 3
        int remainder = a % b; // 나머지, 결과: 1

        int bit1 = 4 << 2;  // 왼쪽으로 2비트 이동, 결과: 16
        int bit2 = 16 >> 2; // 오른쪽으로 2비트 이동, 결과: 4

        System.out.println("bit1 = " + bit1);
        System.out.println("bit2 = " + bit2);


        boolean isLess = (5 < 10);  // 결과: true
        boolean isGreaterOrEqual = (10 >= 10);  // 결과: true

        boolean isEqual = (5 == 5);  // 결과: true
        boolean isNotEqual = (5 != 3);  // 결과: true

        boolean andAnd = (true && false);  // AND 연산, 결과: false
        boolean orOr = (true || false);  // OR 연산, 결과: true

        int variable = ( a > b ) ? a - b : b - a;  // (a>b) 가 treu 면 a-b , false 면 b-a
        int xx = 5;
        xx += 3;  // x에 3을 더한 후 저장 xx = xx + 3, 결과: 8
        xx *= 2;  // x에 2를 곱한 후 저장 xx = xx * 2, 결과: 16
        xx <<= 1; // x를 왼쪽으로 1비트 이동 후 저장 xx = xx << 3, 결과: 32
    }
}