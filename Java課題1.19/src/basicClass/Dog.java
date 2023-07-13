package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。

	// 動物の名前の変数を定義する
	private String name;


	// Q2：フィールドに動物の数の変数を定義してください。

	// 動物の数の変数を定義する
	private static int count;


	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。


	public Dog() {

		// 名前を指定する
		this.name = "犬";

		// 加算する
		count++;

	}


	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。


	public Dog(String name) {

		// 引数の名前を指定する
		this.name = name;

		// 加算する
		count++;

	}



	public String getName() {

		// 名前を返す処理
		return name;

	}


	public static int getCount() {

		// 数を返す処理
		return count;

	}

}