public class Main {

	public static void main(String[] args) {
		int test[] = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int x = 5;

		System.out.print(solution(x, test));
	}

	static int solution(int X, int[] A) {

		int found = 0;
		int count[] = new int[X];

		for (int i = 0; i < A.length; i++) {

			if (A[i] - 1 < X) {

				count[A[i] - 1] += 1;

				if (count[A[i] - 1] == 1)
					found++;
			}
			if (found == X)
				return i;
		}

		return -1;
	}

}
