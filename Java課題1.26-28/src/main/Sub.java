package main;


public class Sub {

	public static void display(String[] space) {


		// 文字列を配列に収納する
		String[] info = {"動物名","体長","速度","学名"};


		for(String name : space) {

			// 分割された値をさらに分割し配列に収納する
			String[] inputSpace = name.split(":");

			// 動物名を取得し変数に代入する
			String animalName = inputSpace[0];

			// 体長の値を取得しdouble型に変換し変数に代入する
			double length = Double.parseDouble(inputSpace[1]);

			// 速度の値を取得しint型に変換し変数に代入する
			int speed = Integer.parseInt(inputSpace[2]);

			// 学名を取得し変数に代入する
			String scientificName = get_scientificName(animalName);


			// コンソールに出力する処理
			System.out.println("\r\n " + info[0] + ":" + animalName
					+ "\n" + info[1] + ":" + length + "m"
					+ "\n"+ info[2] + ":" + speed + "km/h"
					+ "\n"+ info[3] + ":" + scientificName);

		}
	}


	// 動物名に対して学名を返す処理
	public static String get_scientificName(String animalName) {

		
		switch (animalName) {

		case "ライオン":

			return "パンテラ レオ";


		case "ゾウ":

			return "ロキソドンタ・サイクロティス";


		case "パンダ":

			return "アイルロポダ・メラノレウカ";


		case "チンパンジー":

			return "パン・トゥログロディテス";


		case "シマウマ":

			return "チャップマンシマウマ";


		case "インコ":

			return "不明";


		default:

			return "不明";


		}
	}
}