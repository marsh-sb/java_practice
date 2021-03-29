class Main {
  public static void main(String[] args) {
    String msg = "";
    msg += "Hello ";
    msg += "World!";
    System.out.println(msg);

    // 数値の17を出力してください
    System.out.println(17);
    
    // 5に3を足した値を出力してください
    System.out.println(5 + 3);
     
    // 「5 + 3」を文字列として出力してください
    System.out.println("5 + 3");

    // 12を3で割った値を出力してください
    System.out.println(12 / 3);
    
    // 3に6を掛けた値を出力してください
    System.out.println(3 * 6);
     
    // 8を3で割った時の余りを出力してください
    System.out.println(8 % 3);

    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);
    
    // 変数numberを9で上書きしてください
    number = 9;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数textを「Java」で上書きしてください
    text = "Java";
    
    // 変数textを出力してください
    System.out.println(text);

    int length = 6;
    int height = 8;
    
    // 変数rectangleAreaに、四角形の面積を代入してください
    int rectangleArea = length * height;
    
    // 変数rectangleAreaを出力してください
    System.out.println(rectangleArea);
    
    // 変数triangleAreaに、三角形の面積を代入してください
    int triangleArea = length * height / 2;
    
    // 変数triangleAreaを出力してください
    System.out.println(triangleArea);

    int month = 12;
    int date = 31;
    
    // 「12月31日」となるように変数と文字列を連結して出力してください
    System.out.println(month + "月" + date + "日");
    
    // 7を2で割った値を出力してください
    System.out.println(7 / 2);
    
    // 7.0を2.0で割った値を出力してください
    System.out.println(7.0 / 2.0);
    
    // 7を2.0で割った値を出力してください
    System.out.println(7 / 2.0);
  }
}

class Main2 {
  public static void main(String[] args) {
    // 変数nameに、好きな名前を代入してください
    String name = "marsh";
    
    // 変数ageに、好きな年齢を代入してください
    int age = 27;
    
    // 変数heightに、好きな身長を代入してください（例: 1.2）
    double height = 1.75;
    
    // 変数weightに、好きな体重を代入してください（例: 20.0）
    double weight = 85.5;
    
    // 変数bmiに、BMIを計算して代入してください
    double bmi = weight / height / height;
    
    // 名前、年齢、身長、体重、BMIに関する情報を出力してください
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");
  }
}

class Boolean {
  public static void main(String[] args) {
    // 「true」を用いて、「真」を表す真偽値を出力してください
    System.out.println(true);
    
    // 「false」を用いて、「偽」を表す真偽値を出力してください
    System.out.println(false);
    
    // 「==」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 == 3);
    
    // 「!=」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 != 3);
    
    // 変数を定義し、値を比較した結果を代入してください
    boolean bool = 3 * 9 == 27;
    
    // 変数boolの値を出力してください
    System.out.println(bool);
    
  }
}

class Main3 {
  public static void main(String[] args) {
    // trueと出力されるようにしてください
    System.out.println(true || false);
    
    // falseと出力されるようにしてください
    System.out.println(false && true);
    
    // 「8 < 5」かつ「3 >= 2」の結果を出力してください
    System.out.println(8 < 5 && 3 >= 2);
    
    // 「8 < 5」または「3 >= 2」の結果を出力してください
    System.out.println(8 < 5 || 3 >= 2);
    
    // 「8 < 5」でない、の結果を出力してください
    System.out.println(!(8 < 5));
    
  }
}

class Main4 {
  public static void main(String[] args) {
    // 条件式に直接trueをいれてください
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }
    
    // 条件式に直接falseをいれてください
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }
    
    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
    if (x > 2){
      System.out.println("xは2より大きい");
    }
    
    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
    if (x > 8){
      System.out.println("xは8より大きい");
    }
    
  }
}

class Main5 {
  public static void main(String[] args) {
    int number = 12;
    
    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (number < 10) {
      System.out.println("10より小さい");
    } 
    else if (number < 20){
      System.out.println("10以上、20より小さい");
    }
    else {
      System.out.println("20以上");
    }
  }
}