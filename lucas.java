class lucas {
	public static void main(String args[])
	{
	// リュカ数列(1~100項まで算出して、合計を表示)
	// 合計を入れる変数
	double goukei = 0;
	//定義
    double [] hai = new double[101];
    //1項初期化
    hai[0] = 2;
    //2項初期化
     hai[1] = 1;
    //2項～10項目の計算
	// 2~100まで書く
    for (int i=2 ; i<=100 ; i++) {
	hai[i] = hai[i-1] + hai[i-2];
	goukei = goukei + hai[i];
	System.out.println(goukei);}
	}
    //1~10項目表示
    for (int i=1 ; i<=10 ; i++) {
		System.out.println(hai[i]);}
 }
}

//検索キーワード
