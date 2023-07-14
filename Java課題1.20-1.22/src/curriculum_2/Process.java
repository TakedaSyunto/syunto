package curriculum_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Process {

	// 日時を収納する変数
	private LocalDateTime date;

	
	public Process() {
	
		// 現在の日時を取得し収納する
		this.date = LocalDateTime.now();
		
	}
	
	
	public void printMessages() {
		
		// 配列に文字列を収納する
		String[] country = {"日本"};
		
		// 配列に文字列を収納する
		String[] food = {"寿司"};
		
		// コンソールに出力する処理
		System.out.println("こんにちは！ここは" + country[0] + "です！\rこの" + food[0] + "はうまい" + "\n" + food[0] + "は和食です");
		
		// コンソールに出力する処理
		System.out.println( "今の現在日時は" + getDateTime() + "です");
		
	}

	
	private String getDateTime() {

		// フォーマットを指定する
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		// 日時を返す処理
		return date.format(format);
	
	}

}
