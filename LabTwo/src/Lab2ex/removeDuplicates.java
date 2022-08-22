package Lab2ex;

public class removeDuplicates {
	
	static int modifyArray(int arr[], int n) {
		
		
		for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 
				 
				 if(arr[j]>arr[i]) {
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;	 
				 }
			 }
			 }

		 if (n == 0 || n == 1)
	            return n;
	 
	        int[] temp = new int[n];
	 
	        // Start traversing elements
	        int j = 0;
	        for (int i = 0; i < n - 1; i++)
	            
	            if (arr[i] != arr[i + 1])
	                temp[j++] = arr[i];
	 
	        temp[j++] = arr[n - 1];
	 
	        // Modify original array
	        for (int i = 0; i < j; i++)
	            arr[i] = temp[i];
	        
	        return j;
	
	}

	public static void main(String[] args) {
		
		int a[] = {2,3,7,8,3,6,7,5};
		int len = a.length;
		
		int lg = modifyArray(a, len);
		for (int i=0; i<8; i++)
	           System.out.print(a[i]+" ");

	}

}
