/*
实现一个功能：
（1）打印一个矩形
*********
*********
*********
*********
（2）打印一个矩形
    *********
    *********
    *********
    *********
	
（3）打印一个平行四边形
         *********
        *********
       *********
      *********
（4）打印一个等腰三角形
         * 
        *** 
       ***** 
      ******* 
	  
（5）打印一个菱形
          *
		 ***
		*****
	   *******
	    *****
		 ***
		  *
（6）空心菱形
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
		for(int j=1;j<=4;j++){//控制行数
		
			for(int i=1;i<=9;i++){//控制每行上有多少个*
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("========================================");
		for(int j=1;j<=4;j++){//控制行数
			for(int i=1;i<=4;i++){
				System.out.print(" ");
			}
			for(int i=1;i<=9;i++){//控制每行上有多少个*
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("========================================");
		for(int j=1;j<=4;j++){//控制行数
			for(int i=1;i<=(10-j);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=9;i++){//控制每行上有多少个*
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("========================================");
		for(int j=1;j<=4;j++){//控制行数
			for(int i=1;i<=(10-j);i++){//空格数
				System.out.print(" ");
			}
			for(int i=1;i<=(2*j-1);i++){//控制每行上有多少个*
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}