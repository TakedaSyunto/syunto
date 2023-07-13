package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		
		// Dogクラスから呼び出す
		Dog dog = new Dog();

		// 名前を取得する
		String name = dog.getName();

		// コンソールに出力する処理
		System.out.println(name);


		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		
		// Dogクラスのメソッドを呼び出し数を取得する
		int count = Dog.getCount();

		// コンソールに出力する処理
		System.out.println(count);


		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		
		// 現在の日時を取得する
		Date date = new Date();

		// フォーマットを指定する
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 指定したフォーマットを変数に代入する
		String nowDate = now.format(date);

		// コンソールに出力する処理
		System.out.println(nowDate);

	}
}
