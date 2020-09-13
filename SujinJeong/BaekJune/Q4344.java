import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        float[] test = new float[num];
        int total; int count;
        StringTokenizer st = null;
        
        for (int i = 0; i < num; i++) {
            total = 0; count = 0;
           
            st = new StringTokenizer(br.readLine());
            arr.add(0, Integer.parseInt(st.nextToken())); // 첫번째 원소 학생의 수
            
            for (int j = 1; j <= arr.get(0); j++) {
                arr.add(j, Integer.parseInt(st.nextToken())); // 점수들
                total += arr.get(j);
            }

            for (int k = 1; k <= arr.get(0); k++) {
                if (arr.get(k) > total / arr.get(0))
                    count++;
            }

            test[i] = (float)count / arr.get(0) * 100;
            arr.clear();
        }

        for (int i = 0; i < num; i++)
            System.out.println(String.format("%.3f", test[i]) + "%");
   }
}