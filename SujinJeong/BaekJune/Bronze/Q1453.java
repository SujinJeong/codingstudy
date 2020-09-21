package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        int cnt = 0;

        // 선호하는 자리 arr에 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
                // 만약 자리에 이미 사람이 존재하면 cnt 증가
                if (arr[j] == arr[i]) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}