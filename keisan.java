class keisan {
	public static void main(String args[])
	{
    	// 入力：２つの数値を入力
    	int in0 = new java.util.Scanner(System.in).nextInt();
    	int in1 = new java.util.Scanner(System.in).nextInt();
    	System.out.println(in0+","+in1);
    	
    	// 処理：足し算
    	int add = in0+in1;
    	// 処理：引き算
    	int sub = in0-in1;
    	// 処理：掛け算
    	// 処理：割り算
    	// 処理：余り
    	
    	// 計算結果を出力
    	System.out.println("足し算："+add);
    	System.out.println("引き算："+sub);
	}
}