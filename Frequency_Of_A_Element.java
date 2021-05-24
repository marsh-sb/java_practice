import java.util.Scanner;
import java.util.*;

class Frequency_Of_A_Element
{
    static int frequency(int input[], int n, int x)
    {
        // 頻度は、数が発生した回数です
        int f = 0;
        for (int i = 0; i < n; i++)
        {
            if (input[i] == x)
            {
                f = f + 1;
            }
        }
        return f;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        // 頻度を見つける必要がある番号
        int x = s.nextInt();

        int result = frequency(arr, n, x);
        System.out.println(result);
    }
}
