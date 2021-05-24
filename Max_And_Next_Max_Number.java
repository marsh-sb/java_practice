import java.util.Scanner;
import java.util.*;

class Max_And_Next_Max_Number
{
    static void maxAndNextMax(int arr[], int n)
    {
        // maxは最大数であり、
        // 次の（2番目の）最大数のsmax
        int max, smax;

        // maxとsmaxをarr [0]とarr [1]に応じて割り当てる
        // max > smaxの条件で
        if (arr[0] > arr[1])
        {
            max = arr[0];
            smax = arr[1];
        }
        else
        {
            max = arr[1];
            smax = arr[0];
        }

        // 配列内の残りの要素を比較する
        for (int i = 2; i < n; i++)
        {
            if (arr[i] > smax)
            {
                if (arr[i] > max)
                {
                    smax = max;
                    max = arr[i];
                }
                else
                {
                    smax = arr[i];
                }
            }
        }
        System.out.println("最大値: " + max);
        System.out.println("次の最大値: " + smax);
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        maxAndNextMax(arr, n);
    }
}

