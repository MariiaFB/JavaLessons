public class Romb {
	public static void main(String[] args) {
		int width = 11;
		int item = width / 2;
		int middle = (width % 2 == 0 ? item - 1 : item);

		int leftLimit = middle - 1;
		int rightLimit = middle + 1;
		for (int i = 0; i < width; i++) {
			System.out.println(" ");
			for (int j = 0; j < width; j++) {
				if (j > leftLimit && j < rightLimit) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			if (i < middle) {
				leftLimit--;
				rightLimit++;
			} else {
				leftLimit++;
				rightLimit--;
			}
		}
	}
}
