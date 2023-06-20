package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// コンソールに出力する処理
		System.out.println("生徒の人数を入力してください（２以上）：");

		// 入力内容を取得する		
		Scanner scan = new Scanner(System.in);	

		// 入力できるよう処理		
		System.out.print("");

		// 数を入力できるよう処理		
		int count = scan.nextInt();

		// 収納する配列		
		int [] eScore = new int[count];

		// 収納する配列	
		int [] mScore = new int[count];

		// 収納する配列	
		int [] scScore = new int[count];

		// 収納する配列	
		int [] soScore = new int[count];

		// 初期値を代入し初期化		
		int eTotal = 0;

		// 初期値を代入し初期化
		int mTotal = 0;

		// 初期値を代入し初期化
		int scTotal = 0;

		// 初期値を代入し初期化
		int soTotal = 0;


		// 点数を入力する処理		
		for(int i = 0; i < count; i++) {

			// コンソールに出力する処理
			System.out.println("\r\n" + (i + 1) + "人目の『英語』の点数を入力してください：");

			eScore[i] = scan.nextInt();

			// コンソールに出力する処理
			System.out.println("\r\n" + (i + 1) + "人目の『数学』の点数を入力してください：");

			mScore[i]  = scan.nextInt();

			// コンソールに出力する処理
			System.out.println("\r\n" + (i + 1) + "人目の『理科』の点数を入力してください：");

			scScore[i]  = scan.nextInt();

			// コンソールに出力する処理
			System.out.println("\r\n" + (i + 1) + "人目の『社会』の点数を入力してください：");

			soScore[i] = scan.nextInt();

		}

		// 平均点を計算し表示する処理
		for(int j = 0; j < count; j++) {

			// 平均点の計算式を変数に代入する
			int average = (eScore[j] + mScore[j] + scScore[j] + soScore[j]) / 4;

			// コンソールに出力する処理
			System.out.println("\r\n\r\n" + (j + 1) + "人目の平均点は" + average + "点です");

		}

		// 科目ごとの合計点を計算する処理
		for(int k = 0; k < count; k++) {

			// 点数を加算する
			eTotal += eScore[k];

			// 点数を加算する
			mTotal += mScore[k];

			// 点数を加算する
			scTotal += scScore[k];

			// 点数を加算する
			soTotal += soScore[k];

			
		}

		// 計算式を変数に代入する
		int eAverage = eTotal / count;

		// 計算式を変数に代入する
		int mAverage = mTotal / count;

		// 計算式を変数に代入する
		int scAverage = scTotal / count;

		// 計算式を変数に代入する
		int soAverage = soTotal / count;


		// コンソールに出力する処理		
		System.out.println("\r\n\r\n英語の平均点は" + eAverage + "点です");
		System.out.println("\r\n\r\n数学の平均点は" + mAverage + "点です");
		System.out.println("\r\n\r\n理科の平均点は" + scAverage + "点です");
		System.out.println("\r\n\r\n社会の平均点は" + soAverage + "点です");


	}

}