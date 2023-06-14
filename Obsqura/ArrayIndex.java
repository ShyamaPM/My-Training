package exception_sample;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[2][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 6;
		arr[1][1] = 7;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
//     0    1
//0    1	2	
//1    4	5	