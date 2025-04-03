public class PracticeProblem {

	public static void main(String args[]) {
		double nums[] = {155.2, 155.1, 1, 5, 3, 2, 7, 235};
		

		for(int k = 0; k< arr.length; k++){
System.out.print(arr[k] + ", ");
		}
		
	}

	public static int[] bubbleSort(double[] nums) {
		int swaps = 0;
		boolean hasSwitched = true;
		double temp;
		int steps = 0;
		double[] arr = new double[nums.length];
		for(int i = 0; i < nums.length; i++){
			arr[i] = nums[i];
		}

		for (int i = 0; i < arr.length && hasSwitched; i++){
			hasSwitched = false;
			for (int j = 0; j < arr.length - 1 - i; j++){
				steps++;
				if (arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					hasSwitched = true;
					swaps += 3;
				}
			}
		}
int[] stepNum = new int[] {swaps, steps};
return stepNum;
	}


	public static int[] selectionSort(double[] nums){
		int min;
		double temp;
		int steps = 0;
		int swaps = 0;
		double[] arr = new double[nums.length];
		for(int i = 0; i < nums.length; i++){
			arr[i] = nums[i];
		}

		for(int i = 0; i < arr.length - 1; i++){
			min = i;
			swaps++;
			for(int j = 1 + i; j < arr.length - 1; j++){
				steps++;
				if(arr[min] > arr[j]){
					min = j;
					swaps++;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			swaps += 3;
		}

		int[] sorted = new int[]{swaps,steps};
		return sorted;
	}
}
