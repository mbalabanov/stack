package bfi.stack_aufgabe;

public class StackAufgabe {

	public static void main(String[] args) {
	
		int[] myArray = { 12, 23, 45, 12, 32, 21, 76, 11 };
		
		int valueToPush = 12;
		
		// Neuen Wert an Array anhängen 
		myArray = push(myArray, valueToPush);
		System.out.println("Array mit angehängtem Wert: ");
		outputArray(myArray);
		
		// Letzten Wert aus Array entfernen
		myArray = pop(myArray);
		System.out.println("Array mit entferntem Wert: ");
		outputArray(myArray);		
		
	}

	private static int[] push(int[] originalArray, int pushValue) {
		
		int[] pushedArray = new int[originalArray.length + 1];
		
		for (int index = 0; index < originalArray.length; index++) {
			pushedArray[index] = originalArray[index];
		}
		
		pushedArray[pushedArray.length - 1] = pushValue;
		
		return pushedArray;
	}
	
	private static int[] pop(int[] originalArray) {
		
		int[] poppedArray = new int[originalArray.length - 1];
		
		for (int index = 0; index < originalArray.length - 1; index++) {
			poppedArray[index] = originalArray[index];
		}
		
		return poppedArray;
	}
	
	
	
	private static void outputArray(int[] arrayToOutput) {
		for (int index = 0; index < arrayToOutput.length; index++) {
			System.out.println(arrayToOutput[index] + " ");
		}
	}
	
}