package main;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {


		// コンソールに出力する処理
		System.out.println("コンソールに文字を入力してください");

		// Scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);

		// 入力された値を取得する
		String animal = scanner.nextLine();

		// 入力された値を分割し配列に収納する
		String[] space = animal.split(",");

		// 呼び出しコンソールに出力する処理
		Sub.display(space);

		// スキャナーを閉じる
		scanner.close();

	}
}