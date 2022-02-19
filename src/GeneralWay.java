/*
    #th fibonacci number
      f(n) = f(n-1) + f(n-2)
      0 1 1 2 3 5 8 13 21 34 35
 */

public class GeneralWay {
    public static void main(String[] args)
    {
        int n = 22;
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if(n <= 1){
            return n;
        }

        return (fibonacci(n-1) + fibonacci(n-2));
    }
}
