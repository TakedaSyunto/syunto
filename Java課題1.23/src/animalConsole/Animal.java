package animalConsole;

public class Animal {

	// 名前
	private String name;
	
	// 長さ
	private double length;
	
	// 速度
	private double speed;
	
	
	// 名前を設定する
	public void setName(String name) {
		
		this.name = name;
	
	}
	
	// 長さを設定する
	public void setLength(double length) {
		
		this.length = length;
		
	}
	
	// 速度を設定する
	public void setSpeed(double speed) {
		
		this.speed = speed;
		
	}
	
	// 名前を取得し返す処理
	public String getName() {
		
		return name;
		
	}
	
	// 長さを取得し返す処理
	public double getLength() {
		
		return length;
		
	}
	
	// 速度を取得し返す処理
	public double getSpeed() {
		
		return speed;
		
	}
	

}