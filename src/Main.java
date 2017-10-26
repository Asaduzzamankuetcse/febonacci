public class Main {

    static long sum=0;
    public static void main(String[] args) {
        fib(1,1,1);
        System.out.println("Sum : "+ sum);
    }

    static long fib(long term, long val, long prev)
    {
        if(val%2==0)
            sum +=val;
        if(val > 4000000) return val;
        return fib(term + 1, val+prev, val);
    }
}
