public class Main {

	public static void main(String args[]) {

		int test[] = { 3, 1, 2, 5 };

		System.out.print(solution(test));
	}

	static int solution(int A[]) {

		int count[] = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (A[i] > A.length)
				return 0;

			count[A[i] - 1]++;

			if (count[A[i] - 1] != 1)
				return 0;
		}

		return 1;
	}
}
