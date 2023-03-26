public class Reverse {
    public static void main(String[] args) {

        int num = 123;
        System.out.println(recursiveReverse(num, 0));
        System.out.println(iterativeReverse(57));
        System.out.println(iterativeReverse(19924));
        System.out.println(iterativeReverse(3456789));
        System.out.println(fibonacciRecursive(3));
        System.out.println(fibonacciRecursive(8));
        System.out.println(fibonacciRecursive(10));

    }

    public static int recursiveReverse(int num, int revNum) {



        if (num==0) {
            return revNum;

        }
        else {
            int remainder = num%10;
            revNum = revNum * 10 + remainder;
            return recursiveReverse(num/10, revNum);

        }
    }
    public static int iterativeReverse(int num) {
        int reverse = 0;
        while(num>0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;

        }
        return reverse;
    }
    public static int fibonacciRecursive(int num) {
        if (num <= 1) {
            return num;
        }
        else {
            return fibonacciRecursive(num-2) + fibonacciRecursive(num - 1);
        }
    }



}
