package main;

import java.util.Scanner;

class Main {
	
	public static String scan() {
		
		
		// Scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);

		// 入力された値を取得する
		String animal = scanner.nextLine();

		// スキャナーを閉じる
		scanner.close();
		
		// 値を返す処理
		return animal;
		
}
	
	
	public static void main(String[] args) {


		// 呼び出しコンソールに出力する処理
		Sub.display();

		
	}

}