public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static int[] bubbleSort(double[] arr) {
		int swaps = 0;
		boolean hasSwitched = true;
		double temp;
		int steps = 0;

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

	public static int[] bubbleSort1(double[] nums) {
		int swaps = 0;
		boolean hasSwitched = true;
		double temp;
		int steps = 0;
		double[] arr = new double[nums.length];
		for(int k = 0; k < nums.length; k++){
			arr[k] = nums[k];
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

	public static int[] selectionSort1(double[] nums){
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
			for(int j = 1 + i; j < arr.length; j++){
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

	public static int[] selectionSort(double[] arr){
		int min;
		double temp;
		int steps = 0;
		int swaps = 0;
		
		for(int i = 0; i < arr.length - 1; i++){
			min = i;
			for(int j = 1 + i; j < arr.length; j++){
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

	public static int[] insertionSort1(double[] nums){
		int steps = 0;
		int swaps = 0;
		double[] arr = new double[nums.length];
		for(int i = 0; i < nums.length; i++){
			arr[i] = nums[i];
		}
		for(int j = 1; j < arr.length; j++){
			double key = arr[j];
			swaps++;
			int index = j-1;
			while(index >= 0 && key < arr[index]){
				arr[index + 1] = arr[index];
				index--;
				swaps++;
				steps++;
			}
			arr[index+1] = key;
			swaps++;
		}
		
		int[] sorted = new int[]{swaps,steps};
		return sorted;
	}

	public static int[] insertionSort(double[] arr){
		int steps = 0;
		int swaps = 0;
		for(int j = 1; j < arr.length; j++){
			double key = arr[j];
			swaps++;
			int index = j-1;
			while(index >= 0 && key < arr[index]){
				arr[index + 1] = arr[index];
				index--;
				swaps++;
				steps++;
			}
			arr[index+1] = key;
			swaps++;
		}
		
		int[] sorted = new int[]{swaps,steps};
		return sorted;
	}


	public static String leastSwaps(double[] nums){
		if (insertionSort1(nums)[0] < bubbleSort1(nums)[0]){
			if(selectionSort1(nums)[0] < insertionSort(nums)[0]){
				return "Selection";
			}
			else{
				return "Insertion";
			}
		}
		else if(selectionSort(nums)[0] < bubbleSort(nums)[0]){
return "Selection";
		}
		else{
			return "Bubble";
		}

	}

	public static String leastIterations(double[] nums){
		if (insertionSort1(nums)[1] < bubbleSort1(nums)[1]){
			if(selectionSort1(nums)[1] < insertionSort(nums)[1]){
				return "Selection";
			}
			else{
				return "Insertion";
			}
		}
		else if(selectionSort(nums)[1] < bubbleSort(nums)[1]){
return "Selection";
		}
		else{
			return "Bubble";
		}

	}
}
