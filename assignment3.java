public class assignment3 {

	static void bsort(int[] array) {
		 int n = array.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                      if(array[j-1] > array[j]){                                    
	                               temp = array[j-1];  
	                               array[j-1] = array[j];  
	                               array[j] = temp;  
	                         } 
	                          
	                 }  
	         }  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {1,50,49,36,5,7,26,18,17,8,6,16,14,38,41};

System.out.println("Array before bubble sort"); 

for(int i=0; i < array.length; i++){  
        System.out.print(array[i] + " ");  
}  

System.out.println();  

bsort(array);

System.out.println("Array after bubble sort");  
for(int i=0; i < array.length; i++){  
        System.out.print(array[i] + " ");  
}  
	}

}
