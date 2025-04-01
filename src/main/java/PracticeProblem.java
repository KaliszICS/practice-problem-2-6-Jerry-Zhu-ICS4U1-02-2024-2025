public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] bubbleSort(double[] arr) {
		int swaps = 0;
		boolean hasSwitched = true;
		double temp;
		int steps = 0;
		for(int i = 0; i < arr.length - 1  && hasSwitched == true; i++){
hasSwitched = false;
swaps++;
for(int j = 0; j < arr.length - 1; j++){
	hasSwitched = false;
	steps++;
	if(arr[j] < arr[j+1]){
temp = arr[j];
arr[j] = arr[i];
arr[i] = temp;
hasSwitched = true;
swaps += 4;
	}
}
}
int[] stepNum = new int[] {swaps, steps};
return stepNum;
	}

}
