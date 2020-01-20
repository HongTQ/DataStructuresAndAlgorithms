import java.util.Scanner;

import search.Search;
import sort.Sort;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		Search search = new Search();
		Sort sort = new Sort();
		sc = new Scanner(System.in);
		int[] arr = { 10, 9, 5, 11, 40, 99, 86, 55, 21, 10 };
		System.out.println("default array M=[10,9,5,11,40,99,86,55,21,10]");
		System.out.println("Please choose menu");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Insertion Sort");
		System.out.println("3. Merge Sort");
		System.out.println("4. Quick Sort");
		System.out.println("5. Radix Sort");
		System.out.println("6. Counting Sort");
		System.out.println("7. Bucket Sort");
		System.out.println("8. Shell Sort");
		System.out.println("9. Heap Sort");
		System.out.println("10. Selection Sort");
		System.out.println("11. Linear Search");
		System.out.println("12. Binary Search");
		System.out.println(". Exit");
		int intChoose = sc.nextInt();
		switch (intChoose) {
		case 1:
			System.out.println("------------Bubble sort------------");
			sort.bubbleSort(arr);
			sort.showArray(arr);
			break;
		case 2:
			System.out.println("------------Insertion sort------------");
			sort.insertionSort(arr);
			sort.showArray(arr);
			break;
		case 3:
			System.out.println("------------Merge sort------------");
			sort.mergeSort(arr, 0, arr.length - 1);
			sort.showArray(arr);
			break;
		case 4:
			System.out.println("------------Quick sort------------");
			sort.quickSort(arr, 0, arr.length - 1);
			sort.showArray(arr);
			break;
		case 5:
			System.out.println("------------Radix sort------------");
			sort.radixSort(arr, arr.length);
			sort.showArray(arr);
			break;
		case 6:
			System.out.println("------------Counting sort------------");
			sort.countSort(arr);
			sort.showArray(arr);
			break;
		case 7:
			System.out.println("------------Bucket sort------------");
			break;
		case 8:
			System.out.println("------------Shell sort------------");
			sort.shellSort(arr);
			sort.showArray(arr);
			break;
		case 9:
			System.out.println("------------Heap sort------------");
			sort.heapSort(arr);
			sort.showArray(arr);
			break;
		case 10:
			System.out.println("------------Selection sort------------");
			sort.selectionSort(arr);
			sort.showArray(arr);
			break;
		case 11:
			System.out.println("------------Linear Search------------");
			System.out.println("Enter the search number:");
			int numSearch = sc.nextInt();
			int result = search.linearSearch(arr, numSearch);
			if (result == -1)
				System.out.print("Element is not present in array");
			else
				System.out.print("Element is present at index " + result);
			break;
		case 12:
			System.out.println("------------Binary Search------------");
			System.out.println("Enter the search number:");
			int numSearch1 = sc.nextInt();
			int result1 = search.binarySearch(arr, numSearch1);
			if (result1 == -1)
				System.out.print("Element is not present in array");
			else
				System.out.print("Element is present at index " + result1);
			break;
		default:
			System.exit(0);
			break;
		}
	}

}
