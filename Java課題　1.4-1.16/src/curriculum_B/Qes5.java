package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		// 繰り返しを行う処理		
		for(int i = 1; i <= 9; i++){

			
			// 繰り返しを行う処理			
			for(int j = 1; j <= 20; j++) {

				// ３桁で表示する処理				
				String iWord = String.format("%03d" , i);

				// ３桁で表示する処理
				String jWord = String.format("%03d" , j);

				// ３桁で表示する処理
				String ijResult = String.format("%03d" , i * j);

				// コンソールに出力する処理	
				System.out.print(jWord + "*"+ iWord + "=" + ijResult);

				
				// 条件を指定する	
				if(j != 20) {

					// コンソールに出力する処理
					System.out.print(" || ");

				}
			
			}

			// 改行をコンソールに出力する処理
			System.out.println("\r\n");

		
		}
	
	}

}
