package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/********************************************************************************************
		 * 
		 * 問1、問2
		 * 
		 ********************************************************************************************/

		// 入力内容を取得する
		Scanner textWrite = new Scanner(System.in);

		// 繰り返すために変数に代入する
		boolean repeatUser = true;

		// 繰り返す処理
		while(repeatUser) {

			// 入力できるよう表示する
			System.out.print("");

			// 入力された内容を変数に代入する
			String name = textWrite.nextLine();


			// 入力されなかった場合にコンソールに出力する処理
			if ((name.length() == 0) || (Objects.isNull(textWrite))){
				
				System.out.println("\r\n「名前を入力してください」");
				
				continue;

				// 半角英数以外で入力された場合にコンソールに出力する処理
			}else if(!name.matches("[A-Za-z0-9]+$")) {
				
				System.out.println("\r\n「半角英数のみで名前を入力してください");
				
				continue;

				// 10文字以上入力された場合にコンソールに出力する処理				
			}else if (name.length() > 10 ){
				
				System.out.println("\r\n名前を10文字以内にしてください");
				
				continue;

				// それ以外の場合にコンソールに出力する処理				
			}else {
				
				System.out.println("ユーザー名" + name + "を登録しました");

				repeatUser = false;
			
			}

			/********************************************************************************************
			 * 
			 * 問3
			 * 
			 ********************************************************************************************/


			// 乱数オブジェクトの生成
			Random random = new Random();

			// 繰り返すために変数に代入する
			boolean repeatHund = true;

			// 生成された乱数に要素を収納する配列を作成
			String [] hund = {"「グー」","「チョキ」","「パー」"};

			// 初期値を代入し初期化する
			int count = 0;


			// 繰り返す処理
			while(repeatHund) {

				// ３つの乱数を生成する処理				
				int userHund = random.nextInt(3);

				// ３つの乱数を生成する処理 				
				int cpHund = random.nextInt(3);

				// コンソールに出力する処理
				System.out.println( "\r\n" + name + "の手は" + hund[userHund]);
				System.out.println("\r\n相手の手は" + hund[cpHund]);


				// 勝利した場合にコンソールに出力する処理				
				if ((userHund == 0 && cpHund == 1) || (userHund == 1 && cpHund == 2) || (userHund == 2 && cpHund == 0)) {
					System.out.println("\r\n\r\nやるやん\r\n\r\n次は俺にリベンジさせて");
					repeatHund = false;
				}

				// グーに負けた場合にコンソールに出力する処理					
				else if (userHund == 1 && cpHund == 0) {
					
					System.out.println("\r\n\r\n俺の勝ち！\r\n\r\n負けは次につながるチャンスです！\r\n\r\nネバーギブアップ！");
					
					repeatHund = true;
				
				}
				
				// チョキに負けた場合にコンソールに出力する処理					
				else if(userHund == 2 && cpHund == 1){
					
					System.out.println("\r\n\r\n俺の勝ち！\r\n\r\nたかがジャンケン、そう思ってないですか？\r\n\r\nそれやったら次も、勝ちますよ");
					
					repeatHund = true;
				
				}

				// パーに負けた場合にコンソールに出力する処理					
				else if(userHund == 0 && cpHund == 2) {
					
					System.out.println("\r\n\r\n俺の勝ち！\r\n\r\nなんで負けたか、明日まで考えといてください。\r\n\r\nそしたら何かが見えてくるはずです");
					
					repeatHund = true;
				
				}

				// それ以外の場合にコンソールに出力する処理				
				else{
					
					System.out.println("\r\n\r\nDRAW あいこ もう一回しましょう！");
					
					repeatHund = true;
				
				}


				// 変数の値を１増加させる
				count++;


				// 勝利した場合にコンソールに出力する処理			
				if(userHund == 0 && cpHund == 1 || userHund == 1 && cpHund == 2 || userHund == 2 && cpHund == 0){
					
					System.out.println("\r\n\r\n勝つまでにかかった合計回数は " + count + "回です");
					
					break;

				}
			
			}
		
		}
	
	}

}