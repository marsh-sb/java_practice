class Main {
	public static void main(String[] args) {
    String msg = "";
    int num1 = 1;
    int num2 = 1;
    
    if (num1 == num2) {
        msg = "==で一緒です";
    } else {
        msg = "==で違います";
    }
    
    System.out.println(msg); // ==で一緒です


    //equalsの場合

    String str1 = "ABCD";
    String str2 = new String(new byte[] { 0x41, 0x42, 0x43, 0x44 }); // 数値での表現だが、"ABCD"と同じ意味
    
    // 二つのStringが持つ文字列は見た目上では同じ
    System.out.println(str1); // → ABCD
    System.out.println(str2); // → ABCD
    
    // 二つのStringが持つ文字列が同じかequalsで確認する
    if (str1.equals(str2)) {
    System.out.println("str1 と str2 は同じ文字列です。"); // こちら!!
    } else {
    System.out.println("str1 と str2 は違う文字列です。");
    }
    
    // 二つのStringのインスタンスが同じか==で確認する
    if (str1 == str2) {
    System.out.println("str1 と str2 は同じインスタンスです。");
    } else {
    System.out.println("str1 と str2 は違うインスタンスです。"); // こちら!!
    }
    
    }

}