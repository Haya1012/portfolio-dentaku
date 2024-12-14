
package Dentaku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Denntakumain {

	public static void main(String[] args) throws IOException{
		
		//繰り返し
		boolean continueProcessing = true;
		while(continueProcessing) {
		
		System.out.println("計算を始めます");
		System.out.println("足し算ならt");
		System.out.println("引き算ならh");
		System.out.println("割り算ならw");
		System.out.println("掛け算ならkを入力してください");
		

		BufferedReader first = new BufferedReader(new InputStreamReader(System.in));
		
		String cal = first.readLine();
				
		try {
				
			//足し算
			if(cal.equals("t")) {
				System.out.println("足し算を行います");
			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				String str = br.readLine();
				float num = Integer.parseInt(str);
				System.out.println(num + "が入力されました");
			
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String str2 = br2.readLine();
				float num2 = Integer.parseInt(str2);
				System.out.println(num2 + "が入力されました");
			
				System.out.println(num + "+" + num2 + "は" +(num + num2)+ "です");
			
			//引き算
			}else if(cal.equals("h")) {
				System.out.println("引き算を行います");
			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				String str = br.readLine();
				float num = Integer.parseInt(str);
				System.out.println(num + "が入力されました");
			
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String str2 = br2.readLine();
				float num2 = Integer.parseInt(str2);
				System.out.println(num2 + "が入力されました");
			
				System.out.println(num + "-" + num2 + "は" +(num - num2)+ "です");
			
		
			//割り算
			}else if(cal.equals("w")) {
				System.out.println("割り算を行います");
			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				String str = br.readLine();
				float num = Integer.parseInt(str);
				System.out.println(num + "が入力されました");
			
					BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String str2 = br2.readLine();
				float num2 = Integer.parseInt(str2);
				System.out.println(num2 + "が入力されました");
				if(num2 == 0) {
				System.out.println("エラ- ： 0で割ることはできません");
			} else {
			
			System.out.println(num + "/" + num2 + "は" +(num / num2)+ "です");
			
			}
			
			//掛け算
			}else if(cal.equals("k")) {
				System.out.println("掛け算を行います");
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				String str = br.readLine();
				float num = Integer.parseInt(str);
				System.out.println(num + "が入力されました");
		
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String str2 = br2.readLine();
				float num2 = Integer.parseInt(str2);
				System.out.println(num2 + "が入力されました");
		
				System.out.println(num + "*" + num2 + "は" +(num * num2)+ "です");
		
			//指定の文字以外が入力されたときに出るエラー文
			}else {
				System.out.println("T.H.W.Kのどれかを入力してください");
		
			}
		}catch(NumberFormatException e) {
			System.out.println("");
		}
		
			//繰り返しの確認
		System.out.println("もう一度計算を行う場合は : y");
		System.out.println("終了する場合は : n を押してください");
		BufferedReader mouitido = new BufferedReader(new InputStreamReader(System.in));
		String str = mouitido.readLine();
		if(str.equals("y")) {
			continueProcessing = true;
		}else if(str.equals("n")) {
			continueProcessing = false;
		}else {
			System.out.println("無効な選択のためシステムを終了します");
			break;
			}
		}
			System.out.println("終了します");	

	}
}
