public class TestFor011{
	public static void main(String[] args){
		int size=27;
		int enterNum=size/2+1;//中轴线所在的列
		int startNum=enterNum;//每行的起始位置
		int endNum=enterNum;//每行的结束位置
		boolean flag=true;
		//打印一个正方形：
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