import java.lang.reflect.Array;
import java.util.*;
class LRC{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int colm=sc.nextInt();
		int count=0;
		int[][] arr = new int[row][colm];
		System.out.println("Enter elements: ");
		for (int i =0; i <row-1; i++){
			for (int j =0; j <colm; j++){
					arr[i][j]=sc.nextInt();
			}
		}
		 
		for (int j=colm-1; j >=0; j--){
			int i;
			for ( i =0; i <=row-2; i++){
				if(arr[i][j]==1){
					count++;
				}
				
				
			}
		
			if(count%2==0){
					arr[i][j]=0;
			}
			else{
				arr[i][j]=1;
			}
			count=0;
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int i =row-1; i <row; i++){
			for (int j=0; j<colm; j++){
				stringBuilder.append(arr[i][j]);
			}
		}

		System.out.println("Parity bits are: "+ stringBuilder);

	}
}
