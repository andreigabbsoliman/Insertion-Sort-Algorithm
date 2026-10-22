	public class Insertion_Sort_Algorithm {

		public static void main(String[] args) {

			int array[] = {17, 35, 8, 7, 59, 38, 24, 6};

			insertionSort(array);

			for (int i : array) {
				System.out.print(i + " ");
			}
		}

		private static void insertionSort(int[] array) {

			for (int i = 1; i < array.length; i++) {
				int temp = array[i];
				int j = i - 1;

				while (j >= 0 && array[j] > temp) {
					array[j + 1] = array[j];
					j--;
				}
				array[j + 1] = temp;
			}
		}
	}

	//INSERTION SORT ALGORITHM - after comparing elements to the left, shifts elements to the right to make room to insert a value.