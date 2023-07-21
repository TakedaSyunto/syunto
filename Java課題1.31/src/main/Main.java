package main;

import sub.Person;
import sub2.Bicycle;
import sub2.Car;

public class Main{

	
	public static void main(String[] args) {

		// Personクラスから呼び出す処理
		Person person1 = new Person("鈴木","太郎",20,1.7,60);

		// Personクラスから呼び出す処理
		Person person2 = new Person("山田","花子", 22, 1.5, 40);

		// Carクラスから呼び出す処理
		Car car = new Car();

		// Bysysleクラスから呼び出す処理
		Bicycle bicycle = new Bicycle();


		//ownerの設定
		// car.setOwner(person1.fullName());
		// bicycle.setOwner(person2.fullName());


		// System.out.println(car.getOwner());
		// System.out.println(bicycle.getOwner());


		// 呼び出しコンソールに出力する処理
		person1.buy(car);
		person2.buy(bicycle);
		
	}
}