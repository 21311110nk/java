class fibo {
	public static void main(String args[])
	{
	//��`
    int [] hai = new int[11];
    //1��������
    hai[0] = 0;
    //2��������
     hai[1] = 1;
    //2���`10���ڂ̌v�Z
    for (int i=2 ; i<=10 ; i++) {
	hai[i] = hai[i-1] + hai[i-2];
	}
    //1~10���ڕ\��
    for (int i=1 ; i<=10 ; i++) {
		System.out.println(hai[i]);}
 }
}