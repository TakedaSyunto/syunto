package main;

import sub.Person;

public class Main {
	
	public static void main(String[] argos){
		
		// Personクラスから呼び出す処理
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// 呼び出しコンソールに出力する処理
		person1.print();
		
		
		// Personクラスから呼び出す処理
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		
		// 呼び出しコンソールに出力する処理
		person2.print();
		
		
		// コンソールに出力する処理
		System.out.println("合計" + Person.count + "人です");
		
		
		// 呼び出しコンソールに出力する処理
		Person.printCount();
		
		}
}
