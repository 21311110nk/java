class bunki {
	public static void main(String args[])
	{
	    // ����
    	int kotae=0;
		// ���́F���l�P�A�L���A���l�Q�̏��Ԃɓ���
		System.out.print("���l1=");
    	int in0 = new java.util.Scanner(System.in).nextInt();
		System.out.print("�����Z�i+�j�A�����Z�i-�j�A����Z�i*�j�A�]��i%�j�̂ǂꂩ=");
        String kigou = new java.util.Scanner(System.in).nextInt();
		System.out.print("���l2=");
    	int in1 = new java.util.Scanner(System.in).nextInt();
    	// �����F�L���ɉ����Čv�Z
		if (kigou.equals("+"))
		{  kotae = in0+in1;
	    } else if (kigou.equals("-"))
		{  kotae = in0-in1;
        } else if (kigou.equals("*"))
		{  kotae = in0*in1;
        } else if (kigou.equals("/"))
	    {  kotae = in0/in1;
        } else {if (kigou.equals("%"))
		{  kotae = in0%in1;
        }
		//�@�o�́F�v�Z���ʂ��o��
		// [���l�@�v�Z�L���@���l�@= ����
		System.out.println("" + in0 + kigou + in1 + "=" + kotae);
	}
    }
}	