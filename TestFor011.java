public class TestFor011{
	public static void main(String[] args){
		int size=27;
		int enterNum=size/2+1;//���������ڵ���
		int startNum=enterNum;//ÿ�е���ʼλ��
		int endNum=enterNum;//ÿ�еĽ���λ��
		boolean flag=true;
		//��ӡһ�������Σ�
		for(int j=1;j<=size;j++){
			for(int i=1;i<=size;i++){
				if(i==startNum||i==endNum){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			
			if(endNum-startNum+1==size){
				flag=false;
			}
			if(flag){
				startNum--;
				endNum++;
			}else{
				startNum++;
			    endNum--;
			}
			
			System.out.println();
		}
	}
}