import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		
		for (int i = 0; i < s.length(); i++)
				arr[Character.toUpperCase(s.charAt(i)) - 'A'] += 1;

		int max = -1; char rslt = '?';
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) { // �ִ밪 ã��
				max = arr[i];
				rslt = (char)(i+ 'A');
			} else if (arr[i] == max) // �ִ� ���� 2�� �̻� ���°��
				rslt = '?';
		}
		System.out.print(rslt);
	}
}
