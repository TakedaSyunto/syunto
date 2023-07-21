package sub;

public class Person {
	
	// 名前を定義する
	public String name;
	
	// 年齢を定義する
	public int age;
	
	// 身長を定義する
	public double height;
	
	// 体重を定義する
	public double weight;
	
	// 合計人数の初期値を代入し初期化する
	public static int count = 0;

	
	// 名前、年齢、身長、体重を設定する
	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// 加算する
		count++;
		
	}
	
	
	// 名前を取得する
	public String getName() {
		
		return name;
		
	}
	
	
	// 年齢を取得する
	public int getAge() {
		
		return age;
		
	}

	
	// BMIを計算し返す処理
	public double bmi(){
		
		return this.weight / this.height / this.height;
		
	}

	
	// コンソールに出力する処理
	public void print(){
		
		System.out.println("名前は" + this.getName() + "です");
		System.out.println("年は" + this.getAge() + "です");
		
	}
	
	
	// コンソールに出力する処理
	public static void printCount() {
		
		System.out.println("合計" + count + "人です");
		
	}


}