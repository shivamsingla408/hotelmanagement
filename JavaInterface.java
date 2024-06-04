import java.util.*;

interface AdvancedArithmetic
{
    public int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int sum = 0;
        for(int i = 1; i<=n; i++)
        {
            if( n % i == 0) sum +=i;
        }

        return sum;
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        
        MyCalculator cal = new MyCalculator();
        System.out.println("Enter the Number to find Divisor Sum: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = cal.divisor_sum(n);
        System.out.println(sum);
        sc.close();
    }
}
