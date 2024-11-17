package practice_DSA;


//Given N Numbers of sorted Array Delete/remove all the duplicate numbers and print output array
// Ex : Input = [0,0,1,2,2,4,4,4,6,6,9,9]
//     Output = [0,1,2,4,6,9]

public class RemoveDuplicateElements {
	
//	Return type method:
//	public static int[] findDuplicate(int arr[]) {
//		int[] updated = new int[arr.length];
//		
//		updated[0] = arr[0];
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] != updated[i-1]) {
//				updated[i] = arr[i];
//			}
//		}
//		return updated;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,0,1,2,2,4,4,4,6,6,9,9};
		
		int temp = arr[0];
		System.out.print(temp); //Printing first number then comparing that with every other number in the Array 
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != temp) {
				System.out.print(" "+arr[i]);
				temp = arr[i];
			}
		}
		
	}

}
