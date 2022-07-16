
public class practice {
	
	public static void main(String[] args) {
		
		int[] ar = {3,5,1,89,88,89};
		int largest = 0;
		int temp = 0;
		/*
		 * for(int a : ar) { if(a==88) { System.out.println("match"); } }
		 */
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
			if(ar[i]==ar[j])
			{
				System.out.println("Duplicate spotted");
				System.out.println(ar[i]);
				System.out.println(ar[j]);
			}
		}
		}
	
		/*for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			//System.out.println(i);
			{
				if(ar[j+1]> ar[j])
			
			{
		
			//System.out.println(ar[i]);
			//System.out.println(ar[i+1]);
				temp= ar[j+1];
				ar[j+1]= ar[j];
				ar[j] = temp;
				
				
			}
			}}*/
				/*
				 * System.out.println(ar[i]); System.out.println(ar[i+1]); largest = ar[i+1];
				 */
			//}
			//System.out.println(ar[i]);
			
		
		//for(int a : ar) {  System.out.println(a); } 
		
		//System.out.println(largest);
		
		
		
	}

}
