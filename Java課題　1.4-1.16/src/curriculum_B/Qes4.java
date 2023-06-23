package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// 繰り返しを行う処理		
		for(int num1 = 1; num1 <= 9; num1++){

			// 繰り返しを行う処理			
			for(int num2 = 1; num2 <= 9; num2++) {

				// 変数に式を代入する
				int result = num1 * num2;

				// 条件を指定する				
				if(num2 != 9) {

					// コンソールに出力する処理				
					System.out.printf("%02d * %02d = %02d || ", num1, num2, result);

				}else {

					// コンソールに出力する処理
					System.out.printf("%02d * %02d = %02d %n", num1,num2, result);

				}
				
			}

			// コンソールに出力する処理
			System.out.println();

		}

	}

}
