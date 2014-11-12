class fibo {
	public static void main(String args[])
	{
	//’è‹`
    int [] hai = new int[11];
    //1€‰Šú‰»
    hai[0] = 0;
    //2€‰Šú‰»
     hai[1] = 1;
    //2€`10€–Ú‚ÌŒvZ
    for (int i=2 ; i<=10 ; i++) {
	hai[i] = hai[i-1] + hai[i-2];
	}
    //1~10€–Ú•\¦
    for (int i=1 ; i<=10 ; i++) {
		System.out.println(hai[i]);}
 }
}