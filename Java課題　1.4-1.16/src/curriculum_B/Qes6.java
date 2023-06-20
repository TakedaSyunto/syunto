package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		// 入力内容を取得する		
		Scanner textWrite = new Scanner(System.in);

		// 入力できるように表示する		
		System.out.print("");

		// 入力された内容を「、」で区切れるように指定する		
		String[] goodsName = textWrite.nextLine().split("、");

		// 乱数オブジェクトの生成	
		Random random = new Random();

		// 乱数を生成する処理		
		int tvNum = random.nextInt(11) + 1;


		// 入力された内容をすべて取り出すまで繰り返しをする処理		
		for(String goods : goodsName) {

			// 入力された内容によっての処理			
			switch(goods) {

			// 指定したものが入力された場合にコンソールに出力する処理
			case "パソコン":
				
				System.out.println("\r\nパソコンの残り台数は" + (random.nextInt(11) + 1)+ "台です" );
				
				break;

			// 指定したものが入力された場合にコンソールに出力する処理
			case "冷蔵庫":
				
				System.out.println("\r\n冷蔵庫の残り台数は" + (random.nextInt(11) + 1) + "台です" );
				
				break;

			// 指定したものが入力された場合にコンソールに出力する処理
			case "扇風機":
				
				System.out.println("\r\n扇風機の残り台数は" + (random.nextInt(11) + 1) + "台です" );
				
				break;

			// 指定したものが入力された場合にコンソールに出力する処理
			case "洗濯機":
				
				System.out.println("\r\n冷蔵庫の残り台数は" + (random.nextInt(11) + 1) + "台です" );
				
				break;

			// 指定したものが入力された場合にコンソールに出力する処理
			case "加湿器":
				
				System.out.println("\r\n加湿器の残り台数は" + (random.nextInt(11) + 1) + "台です" );
				
				break;

			// 指定したものが入力された場合にコンソールに出力する処理			
			case "テレビ":
			
			case "ディスプレイ":
				
                // 変数に代入する				
				int count = goods.equals("テレビ") ? tvNum : (11 - tvNum) + 1;
				
                // コンソールに出力する処理				
				System.out.println("\r\n" + (goods.equals("テレビ") ? "ディスプレイ" : "テレビ") + "の残り台数は" + count + "台です");
				
				break;

			// 指定されていないものが入力された場合に　コンソールに出力する処理			
			default:
				
				System.out.println("\r\n『" + goods + "』は指定の商品ではありません");
			
			}
		
		}
	
	}

}