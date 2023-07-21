package sub;

public class Person {

	// 
	public static int count = 0;

	// 名前を定義する
	public String firstName;

	// 名字を定義する
	public String lastName;

	// 年齢を定義する
	public int age;

	// 身長、体重を定義する
	public double height, weight;



	// 名字、名前、年齢、身長、体重を設定し数を加算する処理
	public Person(String firstName, String lastName, int age, double height, double weight){

		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}


	// 名字と名前を足してフルネームとして返す処理
	public String fullName(){

		return this.firstName + this.lastName;

	}


	// コンソールに出力する処理
	public void print(){

		System.out.println("\r\n名前は" + this.fullName() + "です");
		System.out.println("\r\n年は" + this.age + "です");

	}


	// BMIを計算し返す処理
	public double bmi(){

		return this.weight / this.height / this.height;

	}


	// コンソールに出力する処理
	public static void printCount(){

		System.out.println("\r\n合計" + Person.count + "人です");

	}

}