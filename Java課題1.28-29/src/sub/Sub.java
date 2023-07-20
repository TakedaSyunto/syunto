package sub;

import java.util.Arrays;

public class Sub {

	// 都道府県名を定義する
	private String prefecture;

	// 県庁所在地を定義する
	private String capital;

	// 面積を定義する
	private double area;



	// 都道府県名,県庁所在地,面積を設定する
	public Sub(String prefecture, String capital, double area) {

		this.prefecture = prefecture;
		this.capital = capital;
		this.area = area;

	}


	
	public void printInfo() {

		// コンソールに出力する処理
		System.out.println("\r\n  都道府県名 :  " + prefecture
				+ "\n県庁所在地 :  " + capital
				+ "\n面積 :  " + area + "km2");
	}



	// 入力された値に対して、出力する物を変える処理
	public void processInput(String[] space, boolean identification) {

		
		// 文字列配列をを整数配列に変換し配列に収納する
		int[] num = new int[space.length];
		
	    
		for (int i = 0; i < space.length; i++) {
			
			// 文字列を整数に変換し収納する
			num[i] = Integer.parseInt(space[i]);
			
		}

		// 昇順と入力された場合の処理
		if (identification) {
			
			Arrays.sort(num);
			
			
	    // 降順と入力された場合の処理
		} else {
			
			Arrays.sort(num);
			
			// 配列の数を取得し変数に代入する
			int a = num.length;
			
			
			for (int i = 0; i < a / 2; i++) {
				
				// 先頭と末尾を交換して逆順に並べ替える
				int temp = num[i];
				num[i] = num[a - i - 1];
				num[a - i - 1] = temp;
				
			}
		}


		for(int sortNum : num) {
			
			// 入力された値に対しての変数への代入
			switch (sortNum) {

			case 0:

				new Sub("北海道","札幌市",83424).printInfo();

				break;

			case 1:

				new Sub("青森県","青森市",9646).printInfo();

				break;

			case 2:

				new Sub("岩手県","盛岡市",15275).printInfo();

				break;

			case 3:

				new Sub("宮城県","仙台市",7282).printInfo();

				break;

			case 4:

				new Sub("秋田県","秋田市",11638).printInfo();

				break;

			case 5:

				new Sub("山形県","山形市",9323).printInfo();

				break;

			case 6:

				new Sub("福島県","福島市",13784).printInfo();

				break;

			case 7:

				new Sub("茨城県","水戸市",6097).printInfo();

				break;

			case 8:

				new Sub("栃木県","宇都宮市",6408).printInfo();

				break;

			case 9:

				new Sub("群馬県","前橋市",6362).printInfo();

				break;

			case 10:

				new Sub("埼玉県","さいたま市",3798).printInfo();

				break;
				
			default:
				
				System.out.println("該当する情報がありません");
				
				break;

			}

		}
	}
}
