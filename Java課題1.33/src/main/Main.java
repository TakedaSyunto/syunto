package main;

import sub.Person;

public class Main {
	
	
	public static void main(String[] args){
		
		// Personクラスから呼び出す処理
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		
		// 呼び出しコンソールに出力する処理
		person1.print();

		
		// Personクラスから呼び出す処理
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		// 呼び出しコンソールに出力する処理
		person2.print();

		
		// 呼び出しコンソールに出力する処理
		Person.printCount();
		
	}
}
