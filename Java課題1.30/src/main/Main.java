package main;

import sub.Person;

public class Main{

	public static void main(String[] args) {

		// Personクラスから呼び出す処理
		Person person1 = new Person("鈴木太郎",20,1.7,60);

		
		// 呼び出しコンソールに出力する処理
		System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
		person1.printTotal();
		
	}

}