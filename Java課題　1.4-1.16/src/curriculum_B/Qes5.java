package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		// 繰り返しを行う処理		
		for(int num1 = 1; num1 <= 9; num1++){


			// 繰り返しを行う処理			
			for(int num2 = 1; num2 <= 20; num2++) {

				// 変数に式を代入する
				int result = num1 * num2;


				// 条件を指定する	
				if(num2 != 20) {

					// 条件に沿ってコンソールに出力する処理				
					System.out.printf("%03d * %03d = %03d || ", num1, num2, result);

				}else {

					// 条件以外の場合にコンソールに出力する処理		
					System.out.printf("%03d * %03d = %03d %n", num1,num2, result);

				}

			}
			
			// コンソールに出力する処理
			System.out.println();

		}

	}

}
