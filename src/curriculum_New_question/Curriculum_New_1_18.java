package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	
	public static void outputMessage(String message, int num){

		// コンソールに出力する処理
		System.out.println(message + " " + num);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	
	public static void multiplication(int num1, int num2){

		// 計算式を変数に代入する
		int result = num1 * num2;

		// コンソールに出力する処理
		System.out.println(result);

	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	
	public static void order(int[] product) {
		
		for(int num : product) {
			
			// コンソールに出力する処理
			System.out.println(num);
			
		}
	
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	
	public static void add(double num1, double num2) {
		
		// 変数に式を代入する
		double result = num1 + num2;
		
		// コンソールに出力する処理
		System.out.println(result);
	
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	
	public static int[] RandomNumbers(int count) {
		
		// 乱数オブジェクトの生成
		Random random = new Random();
		
		// 収納する配列
		int[] num1 =new int[count];
		
		for(int num2 = 0; num2 < count; num2++) {
			
			// 乱数を生成する処理する
			int RandomNumber = random.nextInt(100) + 1;
			
			// コンソールに出力する処理
			System.out.println(RandomNumber);
			
			// 生成された乱数を配列に収納する
			num1[num2] = RandomNumber;
			
		}
		
		// 格納した値を返す
		return num1;
		
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	
	public static double receiveAverage(int[] num1) {
		
		// 変数に初期値を代入し初期化する
		int total = 0;
		
		for(int num : num1) {
			
			// 要素を加算する
			total += num;
			
		}
		
		// 計算式を変数に代入する
		double average = (double)total / num1.length;
		
		// コンソールに出力する処理
		System.out.println(String.format("%.2f" , average));
		
		// 格納した値を返す
		return average;
		
	}
	
	
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	
	public static boolean check(int[] average) {
		
		// 計算式を変数に代入する
		double num1 = receiveAverage(average);
		
		// 指定した条件に
		boolean conditions = num1 >= 50;
		
		// 格納した値を返す
		return conditions;
		
	}
	
	
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
	  
		
	  // 引数に文字列型と整数型を渡して出力する
      outputMessage("Hello JavaSE", 11);
      
      
      // 引数として整数型を渡して乗算結果を出力する
      multiplication(4,3);
      
      
      // 配列に整数を収納する
      int[] product = {1,2,3};
      
      //引数として整数の配列を渡して順番に出力する
      order(product);
      
      
      // 引数として小数2つを渡して和算結果を出力する
      add(1.4,3.9);
      
      
      // 引数として整数を渡し乱数を格納して出力し、格納した値を返す
      int[] RandomNumber = RandomNumbers(4);
      
      
      // 変数に代入する
      boolean result = check(RandomNumber);
      
      // コンソールに出力する処理
      System.out.println(result);
	
	}

}
