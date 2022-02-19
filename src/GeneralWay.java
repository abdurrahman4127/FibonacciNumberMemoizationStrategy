/*
        will be too slow
  #th fibonacci number
      f(n) = f(n-1) + f(n-2)
      0 1 1 2 3 5 8 13 21 34 35
 */

public class GeneralWay {
    public static void main(String[] args)
    {
        long start = 0, end = 0;
        int n = 10;

        // printing the nth fibonacci number
        System.out.println(n + " no. fibonacci number : " + fibonacci(n));

        // counting the time to print fibonacci numbers up until n
        System.out.println("fibonacci number up until " + n + " are : ");
        for(int i=0; i<=n; i++)
        {
            start = System.nanoTime();  // time counting starting

            System.out.println(fibonacci(i));

            end = System.nanoTime();   // time counting finishing
        }

        System.out.println("execution time : " + (end - start) + " nano-seconds");
    }

    private static long fibonacci(int n) {
        if(n <= 1){
            return n;
        }

        return (fibonacci(n-1) + fibonacci(n-2));
    }
}

/*   approximate test outcomes (in nanoseconds) for n numbers [NOT LOOP ; for line no. 23]
           2 - 361200
           5 - 622400
           10 - 374400
           15 - 1272500
           20 - 2629300
           25 - 5011000
           30 - 11770400
           35 - 116938100
     conclusion : it's a very slow algorithm
 */
