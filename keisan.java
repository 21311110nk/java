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
		int a = in0*in1;
    	// 処理：割り算
		int b = in0/in1;
    	// 処理：余り
		int c = in0%in1;
    	
    	// 計算結果を出力
    	System.out.println("足し算："+add);
    	System.out.println("引き算："+sub);
		System.out.println("掛け算"+a);
    	System.out.println("割り算："+b);
		System.out.println("余り："+ｃ);
		
		
	}
}