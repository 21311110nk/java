class lucas {
	public static void main(String args[])
	{
	// �����J����(1~100���܂ŎZ�o���āA���v��\��)
	// ���v������ϐ�
	double goukei = 0;
	//��`
    double [] hai = new double[101];
    //1��������
    hai[0] = 2;
    //2��������
     hai[1] = 1;
    //2���`10���ڂ̌v�Z
	// 2~100�܂ŏ���
    for (int i=2 ; i<=100 ; i++) {
	hai[i] = hai[i-1] + hai[i-2];
	goukei = goukei + hai[i];
	System.out.println(goukei);}
	}
    //1~10���ڕ\��
    for (int i=1 ; i<=10 ; i++) {
		System.out.println(hai[i]);}
 }
}

//�����L�[���[�h
