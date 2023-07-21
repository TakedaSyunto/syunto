package sub;

import sub2.Bicycle;
import sub2.Car;


public class Person{

	// 名字を定義する
	private String familyName;

	// 名前を定義する
	private String firstName;

	// 年齢を定義する
	private int age;

	// 身長を定義する
	private double height;

	// 体重を定義する
	private double weight;

	// 人数の初期値を代入する
	static int total = 0;


	// 名前、年齢、身長、体重を設定する
	public Person(String familyName, String firstName, int age, double height,double weight) {

		this.familyName = familyName;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 加算する処理
		total++;
		
	}

	
	// 名字と名前を足してフルネームにし、その値を返す処理
	public String fullName() {

		return (familyName + firstName);
		
	}
	
	
    // BMIを計算し、その値を返す処理
	public double bmi() {


		// BMIを計算し変数に代入する
		double result = weight / (height * height);

		// 結果を返す処理
		return result;
		
	}
	

	// Carクラスから継承しgetterで取得した内容をコンソールに出力する処理
	public void buy(Car car) {
		
		car.setOwner(this.fullName());
		
		System.out.println(car.getOwner() + "が購入しました");
		
	}
	
	
	// Bicycleクラスから継承しgetterで取得した内容をコンソールに出力する処理
	public void buy(Bicycle bicycle) {
		
		bicycle.setOwner(this.fullName());
		
		System.out.println(bicycle.getOwner() + "が購入しました");
		
	}


	public void print() {

		// コンソールに出力する処理
		System.out.println("名前は" + this.fullName() + "です"
				+ "\n年は" + this.age + "です"
				+ "\nBMIは" + String.format("%.1f",this.bmi()) + "です");

	}


	public static void printTotal() {

		// コンソールに出力する処理
		System.out.println("\r合計" + total + "人です");

	}



}