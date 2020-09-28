package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11650 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 이차원 배열 정렬 함수
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1]; // 0번째 인덱스가 같다면 1번째 인덱스 비교
                else
                    return o1[0] - o2[0]; // 기본은 인덱스 0으로 비교
            }
            
        });

        for(int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
