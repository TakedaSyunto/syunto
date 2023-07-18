package sub;

public class Sub {

	// 都道府県名を定義する
	private String prefecture;

	// 県庁所在地を定義する
	private String capital;

	// 面積を定義する
	private double area;



	// 都道府県名,県庁所在地,面積を設定する
	public void sub(String prefecture, String capital, double area) {

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
	public void processInput(String[] space) {


		for (String spaces : space) {

			// int型に変換し変数に代入する
			int num = Integer.parseInt(spaces);

			// 入力された値に対しての変数への代入
			switch (num) {

			case 0:

				prefecture = "北海道";
				capital = "札幌市";
				area = 83424;

				break;

			case 1:

				prefecture = "青森県";
				capital = "青森市";
				area = 9646;

				break;

			case 2:

				prefecture = "岩手県";
				capital = "盛岡市";
				area = 15275;

				break;

			case 3:

				prefecture = "宮城県";
				capital = "仙台市";
				area = 7282;

				break;

			case 4:

				prefecture = "秋田県";
				capital = "秋田市";
				area = 11638;

				break;

			case 5:

				prefecture = "山形県";
				capital = "山形市";
				area = 9323;

				break;

			case 6:

				prefecture = "福島県";
				capital = "福島市";
				area = 13784;

				break;

			case 7:

				prefecture = "茨城県";
				capital = "水戸市";
				area = 6097;

				break;

			case 8:

				prefecture = "栃木県";
				capital = "宇都宮市";
				area = 6408;

				break;

			case 9:

				prefecture = "群馬県";
				capital = "前橋市";
				area = 6362;

				break;

			case 10:

				prefecture = "埼玉県";
				capital = "さいたま市";
				area = 3798;

				break;
				
			}

			// 呼び出しコンソールに出力する処理
			printInfo();
			
		}

	}

}