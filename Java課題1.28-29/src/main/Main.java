package main;

import java.util.Scanner;

import sub.Sub;

public class Main {


	public static void main(String[] args) {

		// Scannerオブジェクトを作成
		Scanner scan = new Scanner(System.in);

		// コンソールに出力する処理
		System.out.println("欲しい情報の数字を入力してください");

		// 入力された値を収納する
		String num = scan.nextLine();

		// コンソールに出力する処理
		System.out.println("昇順、降順どちらで入力するか入力してください");

		// 入力された値を収納する
		String order = scan.nextLine();

		// 入力された値を分割し配列に収納する
		String[] space = num.split(",");

		// スキャナーを閉じる
		scan.close();

		// Subクラスから呼び出す処理
		Sub sub = new Sub(null, null,0);


		// orderに応じて処理を分岐
		switch (order) {

		// 昇順で処理
		case "昇順":

			sub.processInput(space, true); 

			break;

			// 降順の処理    
		case "降順":

			sub.processInput(space, false); 

			break;

		default:

			System.out.println("不正な入力です。");

			break;

		}
	}
}
