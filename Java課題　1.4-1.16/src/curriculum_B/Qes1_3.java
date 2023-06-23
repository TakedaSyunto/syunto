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
		Scanner scanner = new Scanner(System.in);

		// 繰り返すために変数に代入する
		boolean repeatUser = false;

		// 繰り返す処理
		while(!repeatUser){

			// 入力できるよう表示する
			System.out.print("");

			// 入力された内容を変数に代入する
			String name = scanner.nextLine();


			// 入力されなかった場合にコンソールに出力する処理
			if ((name.length() == 0) || (Objects.isNull(name))){

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

				repeatUser = true;

			}

			/********************************************************************************************
			 * 
			 * 問3
			 * 
			 ********************************************************************************************/


			// 乱数オブジェクトの生成
			Random random = new Random();

			// 繰り返すために変数に代入する
			boolean repeatHund = false;

			// 生成された乱数に要素を収納する配列を作成
			String [] hund = {"「グー」","「チョキ」","「パー」"};

			// 初期値を代入し初期化する
			int count = 0;


			// 繰り返す処理
			while(!repeatHund) {

				// ３つの乱数を生成する処理				
				int userHund = random.nextInt(3);

				// ３つの乱数を生成する処理 				
				int cpHund = random.nextInt(3);

				// 変数の値を１増加させる
				count++;

				// コンソールに出力する処理
				System.out.printf("""
                        \r\n\r\n%sの手は%s
                        \r\n相手の手は%s
                        """, name, hund[userHund], hund[cpHund]);


				// 勝利した場合にコンソールに出力する処理				
				if ((userHund == 0 && cpHund == 1) || (userHund == 1 && cpHund == 2) || (userHund == 2 && cpHund == 0)) {

					System.out.printf("""
                            \r\n\r\nやるやん
                            \r\n次は俺にリベンジさせて
                            \r\n\r\n勝つまでにかかった合計回数は %d回です
                            """, count);

					repeatHund = true;

				}

				// グーに負けた場合にコンソールに出力する処理					
				else if (userHund == 1 && cpHund == 0) {

					System.out.printf("""
                            \r\n\r\n俺の勝ち！
                            \r\n負けは次につながるチャンスです！
                            \r\nネバーギブアップ！
                            """);
					repeatHund = false;

				}

				// チョキに負けた場合にコンソールに出力する処理					
				else if(userHund == 2 && cpHund == 1){

					System.out.printf("""
                            \r\n\r\n俺の勝ち！
                            \r\nたかがジャンケン、そう思ってないですか？
                            \r\nそれやったら次も、勝ちますよ
                            """);
					repeatHund = false;

				}

				// パーに負けた場合にコンソールに出力する処理					
				else if(userHund == 0 && cpHund == 2) {

					System.out.printf("""
                            \r\n\r\n俺の勝ち！
                            \r\nなんで負けたか、明日まで考えといてください。
                            \r\nそしたら何かが見えてくるはずです
                            """);
					repeatHund = false;

				}

				// それ以外の場合にコンソールに出力する処理				
				else{

					System.out.println("\r\n\r\nDRAW あいこ もう一回しましょう！");

					repeatHund = false;

				}

				// スキャナーを閉じる
			    scanner.close();
				
			}

		}

	}

}