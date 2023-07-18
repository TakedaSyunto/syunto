package main;

import java.util.Scanner;

import sub.Sub;

public class Main {


	public static void main(String[] args) {

		// Scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);

		// 入力された価を取得する
		String num = scanner.nextLine();

		// 入力された値を分割し配列に収納する
		String[] space = num.split(",");

		// Subクラスから呼び出す処理
		Sub sub = new Sub();

		// 呼び出しコンソールに出力する処理
		sub.processInput(space);

	}
}

