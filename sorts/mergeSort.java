// mergesort

// keep dividing in half until you can't anymore, then merge the small ones back up


// Just so I can have a good looking signature
public static int[] mergesort(int[] inputArray){

	inputArray = callMergeSort(inputArray, 0, inputArray.length);
	return inputArray;

}

public static int[] callMergeSort(int[] inputArray, int low, int high){
		
	while(low < high){

		int middle = (high - low) / 2;
		callMergeSort(inputArray, low, middle);
		callMergeSort(inputArray, middle + 1, high);
		merge(inputArray, low, middle, high);

	}

	return inputArray;

}


public static void merge(int[] inputArray, int low, int middle, int high){
	
	int[] temp = new int[array.length];

	for(int i = low; low <= high; i++){
		temp[i] = array[i];
	}

	int current = low;
	int left = low;
	int right = middle + 1;

	while(left <= middle && right <= high){
		if(temp[left] <= temp[right]){
			inputArray[current] = temp[right];
			left++;
		}
		else{
			inputArray[current] = temp[left];
			right++;
		}
		current++;
	}

	// now add everything else
	int remaining = middle - left;
	for(int i = 0; i < remaining; i++){
		intputArray[current + i] = temp[left + i];
	}



}