/*
ʵ��һ�����ܣ�
��1����ӡһ������
*********
*********
*********
*********
��2����ӡһ������
    *********
    *********
    *********
    *********
	
��3����ӡһ��ƽ���ı���
         *********
        *********
       *********
      *********
��4����ӡһ������������
         * 
        *** 
       ***** 
      ******* 
	  
��5����ӡһ������
          *
		 ***
		*****
	   *******
	    *****
		 ***
		  *
��6����������
          *
		 * *
		*   *
	   *     *
	    *   *
		 * *
		  *		  
*/
public class TestFor10{
	public static void main(String[] args){
		//*********
		for(int j=1;j<=4;j++){//��������
		
			for(int i=1;i<=9;i++){//����ÿ�����ж��ٸ�*
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("========================================");
		for(int j=1;j<=4;j++){//��������
			for(int i=1;i<=4;i++){
				System.out.print(" ");
			}
			for(int i=1;i<=9;i++){//����ÿ�����ж��ٸ�*
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("========================================");
		for(int j=1;j<=4;j++){//��������
			for(int i=1;i<=(10-j);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=9;i++){//����ÿ�����ж��ٸ�*
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("========================================");
		for(int j=1;j<=4;j++){//��������
			for(int i=1;i<=(10-j);i++){//�ո���
				System.out.print(" ");
			}
			for(int i=1;i<=(2*j-1);i++){//����ÿ�����ж��ٸ�*
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}