package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。

	// 動物の名前の変数を定義する
	private String name;


	// Q2：フィールドに動物の数の変数を定義してください。

	// 動物の数の変数を定義する
	private int number;


	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。


	public Dog() {

		// 名前を指定する
		this.name = "犬";
		
	}


	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。


	public Dog(int number) {

		// 引数の数字を指定する
		this.number = number;

	}



	public String getName() {

		// 名前を返す処理
		return name;

	}


	public int getNumber() {

		// 数を返す処理
		return number;

	}

}