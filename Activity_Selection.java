/*
アクティビティ選択の問題ステートメントは、「開始時間と終了時間のあるn個のアクティビティのセットを考えると、
1人の人が処理できるのは1人だけであるため、1人の人が実行できる競合しないアクティビティの最大数を選択する必要があります。
*/

class Activity_Selection
{
    // 選択するアクティビティを計算する関数
    public static void activities(int start[], int finish[], int n)
    {
        int i = 0, j;
        // 最初のアクティビティを選択します
        System.out.print( i + " ");
        // 現在のアクティビティjの開始時間が選択した前のアクティビティ以上の場合は、アクティビティjを選択します
        for (j = 1; j < n; j++)
        {
            if (start[j] >= finish[i])
            {
                System.out.print( j + " ");
                i = j;
            }
        }
    }

    // Driver function
    public static void main(String args[])
    {
        // n個の要素の配列。start[i]はi番目のアクティビティの開始時刻を示します
        int start[] = {1, 3, 1, 5, 6, 8};
        // n個の要素の配列。finish[i]はi番目のアクティビティの終了時間を示します。
        int finish[] = {2, 6, 6, 7, 8, 10};
        int n = start.length;
        // アクティビティ機能の呼び出し
        Activity_Selection obj = new Activity_Selection();
        obj.activities(start, finish, n);
    }
}