import java.util.*;
public class MostFrequency {

    public static int digitFrequency(int num1, int num2, int num3, int num4 )
    {
        int mostFrequentDigit = 0;

        int[] digitFrequency = new int[10];
        int[] digitArray = {num1, num2, num3, num4};

        for(int number: digitArray)
        {
            while (number>0) {
                int digit = number%10;
                digitFrequency[digit]++;
                number /=10;
            }
        
            int maxFrequency = 0;
            for (int i = 0; i < 10; i++) {
                if (digitFrequency[i] > maxFrequency || (digitFrequency[i] == maxFrequency && i > mostFrequentDigit)) {
                    mostFrequentDigit = i;
                    maxFrequency = digitFrequency[i];
                }
            }
    
            return mostFrequentDigit;
        }

        return mostFrequentDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();
        System.out.print("Enter Number 4: ");
        int num4 = sc.nextInt();
        
        int mostFrequentDigit = digitFrequency(num1,num2,num3,num4);
        System.out.println("The Most Frequent Digit is: "+mostFrequentDigit);
        sc.close();

    }
}

