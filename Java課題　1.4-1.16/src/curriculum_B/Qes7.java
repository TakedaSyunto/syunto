package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// コンソールに出力する処理
		System.out.println("生徒の人数を入力してください（２以上）：");

		// 入力内容を取得する		
		Scanner scanner = new Scanner(System.in);	

		// 入力できるよう処理		
		System.out.print("");

		// 数を入力できるよう処理		
		int count = scanner.nextInt();

		// 文字列を収納する配列
		String [] subject = {"英語","数学","理科","社会"};

		// 生徒ごとの教科の点数を収納する配列
		int[][] scores = new int[count][subject.length];

		// 教科ごとの合計点を収納する配列
		int[] eachScores = new int[subject.length];


		// 点数を入力する処理		
		for(int num1 = 0; num1 < count; num1++) {

			for(int num2 = 0; num2 < subject.length; num2++) {
				// コンソールに出力する処理
				System.out.println("\r\n" + (num1 + 1) + "人目の『" + subject[num2] + "』の点数を入力してください：");

				// 入力するための処理
				int score = scanner.nextInt();

				// 生徒ごとの教科の点数を収納する
				scores[num1][num2] = score;

				// 各教科の点数に加算する
				eachScores[num2] += score;

			}

		}

		// 平均点を計算し表示する処理
		for(int num1 = 0; num1 < count; num1++) {

			// 初期値を入力し代入する
			int num3 = 0;

			for(int num2 = 0; num2 < subject.length; num2++) {

				// 生徒ごとの点数を合計する
				num3 += scores[num1][num2];

			}

			// 平均点の計算式を変数に代入する
			double average = (double)num3 / subject.length;

			// コンソールに出力する処理
			System.out.printf("\r\n\r\n%d人目の平均点は%.2f点です%n", (num1 + 1), average);			
		
		}
		

		for(int num2 = 0; num2 < subject.length; num2++){

			// 	平均点の計算式を変数に代入する
			double eachAverage = (double)eachScores[num2] / count;

			// コンソールに出力する処理
			System.out.printf("\r\n\r\n%sの平均点は%.2f点です%n", subject[num2], eachAverage);		
		
		}
		
		// 変数の初期値を代入し初期化する
		int totalScore = 0;
		
			for(int num1 = 0; num1 < count; num1++) {
				
				for(int num2 = 0; num2 < subject.length; num2++)
					
			// 
			totalScore += scores[num1][num2];
			
		}
		
		
			double totalAverage = (double) totalScore / (count * subject.length);
		
			// 全体の平均点を表示する
			System.out.printf("\r\n\r\n全体の平均点は%.2f点です%n", totalAverage);
		
		
	    

		// スキャナーを閉じる
		scanner.close();

	}

}