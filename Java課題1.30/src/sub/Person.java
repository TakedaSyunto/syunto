package sub;


public class Person{
	
	
	// 名前を定義する
	private String name;
	
	// 年齢を定義する
	private int age;
	
	// 身長を定義する
	private double height;
	
	// 体重を定義する
	private double weight;
	
	// 人数の初期値を代入する
	static int total = 0;
	
	
	// 名前、年齢、身長、体重を設定する
	public Person(String name, int age, double height,double weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// 加算する処理
		total++;
		
	}
	
	
	public double bmi() {
		
		
		// BMIを計算し変数に代入する
		double result = weight / (height * height);
		
		// 結果を返す処理
		return result;
		
	}
	
	
	public void print() {
	
		// コンソールに出力する処理
		System.out.println("名前は" + this.name + "です"
				+ "\nBMIは" + String.format("%.1f",this.bmi()) + "です"
				+ "\n年は" + this.age + "です");
		
	}
	
	
	public void printTotal() {
	
		// コンソールに出力する処理
		System.out.println("\r合計" + total + "人です");
	
	}
	
}