import java.util.Random;
import java.io.*;

class file {
	public static void main(String args[])
	{
		// 0～100までの乱数を100個コンマ区切りで
		// ファイル出力する
		
		// 0～100までの乱数をint型の変数aに求めて
		// 出力
		Random b = new Random();
		
		// 変数aをtensu.txtにファイル出力する
		try{
			File file = new File("tensu.csv");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			//100個乱数をファイルに書きだす
			for(int i=1; i<=100;i++)
			{
			//乱数を作成
			int a =b.nextInt(101);
			//書き込む
			pw.print(a+",");
			}
			//閉じる
			pw.close();
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}