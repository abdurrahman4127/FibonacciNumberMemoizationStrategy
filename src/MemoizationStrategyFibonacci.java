public class MemoizationStrategyFibonacci {

    /*
        storing this calculation result so that we can look
       'em up later instead of recalculating
     */
    private static long []fibonacciCache;

    public static void main(String[] args)
    {
        int n = 50;

        /*
               limit of long type -> 9,223,372,036,854,775,807
               we can get positive values when n<=92
         */

        fibonacciCache = new long[n + 1];  // array size should be n+1

        // printing fibonacci numbers up until n
        for(int i=0; i<=n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static long fibonacci(int n) {
        if(n <= 1){
            return n;
        }

        // if the cache array already has the value in it then ...
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        // calculated nth fibonacci number
        long nthFibonacciNumber = fibonacci(n-1) + fibonacci(n-2);

        // storing the fibonacci number in the cache array
        fibonacciCache[n] = nthFibonacciNumber;

        return (fibonacci(n-1) + fibonacci(n-2));
    }
}
