import java.util.Scanner;

class Anagram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1文字目の入力");
        String str1 = sc.nextLine();

        System.out.println("2文字目の入力");
        String str2 = sc.nextLine();

        int count1[] = new int[256];
        int count2[] = new int[256];

        // 長さが等しくない場合、アナグラムにすることはできません
        if (str1.length() != str2.length())
        {
            System.out.println("文字列はアナグラムではありません");
            return;
        }

        // 文字列内のすべての文字の数を保存します
        for (int i = 0; i < str1.length(); i++)
        {
            count1[str1.charAt(i) - 'a']++;
            count2[str2.charAt(i) - 'a']++;
        }

        // 文字数が等しくない場合、
        // それらはアナグラムではありません
        for (int i = 0; i < 256; i++)
        {
            if (count1[i] != count2[i])
            {
                System.out.println("文字列はアナグラムではありません");
                return;
            }
        }
        System.out.println("文字列はアナグラムです");
    }
}