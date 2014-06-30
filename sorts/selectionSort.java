// Selection sort, worst of the worst
// O(n2) average and worst case. Memory O(1)


// Start at the beginning and swap the elements if the left is bigger than the right.
// Then do this again for the array.length - 1. 

public static int[] selectionSort(int[] inputArray){

	for(int i = 0; i < inputArray.length; i++){
		for(int j = 0; j < inputArray.length; j++){

			if(inputArray[i] > inputArray[j]){
				int temp = inputArray[j];
				inputArray[j] = inputArray[i];
				inputArray[i] = temp;
			}
		}
	}

	return inputArray;


}