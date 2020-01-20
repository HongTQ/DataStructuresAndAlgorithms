package search;

public class Search {
	public int linearSearch(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public int binarySearch(int arr[], int x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}
}
