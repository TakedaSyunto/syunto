package animalDisplay;

import animalConsole.Animal;

public class Display {

	public static void main(String[] args) {
	
		// Animalクラスから呼び出す処理
		Animal animal = new Animal();
		
		// 名前を設定する
		animal.setName("ライオン");
		
		// 長さを設定する
		animal.setLength(2.1);
		
		// 速度を設定する
		animal.setSpeed(80);
		
		
		// コンソールに出力する処理
		System.out.println("  動物名 :" + animal.getName() 
		+ "\n体長 :" + animal.getLength() + "m"
		+ "\n速度 :" + animal.getSpeed() + "km/h");

	}

}
