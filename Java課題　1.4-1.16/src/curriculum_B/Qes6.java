package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		// 入力内容を取得する		
		Scanner scanner = new Scanner(System.in);

		// 入力できるように表示する		
		System.out.print("");

		// 入力された内容を「、」で区切れるように指定する		
		String[] goodsNames = scanner.nextLine().split("、");

		// 乱数オブジェクトの生成	
		Random random = new Random();

		// 乱数を生成する処理		
		int tvNum = random.nextInt(12);


		// 入力された内容をすべて取り出すまで繰り返しをする処理		
		for(String merchandise : goodsNames) {

			// 入力された内容によっての処理			
			switch(merchandise) {

			// 指定したものが入力された場合にコンソールに出力する処理
			case "パソコン","冷蔵庫","扇風機","洗濯機","加湿器":

				System.out.println("\r\n"+ merchandise + "の残り台数は" + (random.nextInt(12))+ "台です" );

			break;

			// 指定したものが入力された場合にコンソールに出力する処理			
			case "テレビ":

			case "ディスプレイ":

				// 変数に代入する				
				int count = merchandise.equals("テレビ") ? tvNum : (11 - tvNum);

				// コンソールに出力する処理				
				System.out.println("\r\n" + (merchandise.equals("テレビ") ? "ディスプレイ" : "テレビ") + "の残り台数は" + count + "台です");

				break;

				// 指定されていないものが入力された場合に　コンソールに出力する処理			
			default:

				System.out.println("\r\n『" + merchandise + "』は指定の商品ではありません");

			}

			// スキャナーを閉じる
			scanner.close();

		}

	}

}