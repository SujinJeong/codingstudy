package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1924 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int month = Integer.parseInt(st.nextToken());
            int date = Integer.parseInt(st.nextToken());
            int cnt = 0;
            if (month != 1)
                for (int i = 1; i < month; i++) {
                    if (i == 1 || i == 3 || i == 5 || i == 7 || 
                    i == 8 || i == 10 || i == 12) {// 31일까지 있는 경우
                        cnt += 31;
                    }
                    else if (i == 2) // 2월은 28일까지
                        cnt += 28;
                    else // 나머지 달은 30일까지
                        cnt += 30;
                }
            cnt += date; //일수 더하기

            String rslt = "";
            if (cnt % 7 == 1)
                rslt = "MON";
            else if (cnt % 7 == 2)
                rslt = "TUE";
            else if (cnt % 7 == 3)
                rslt = "WED";
            else if (cnt % 7 == 4)
                rslt = "THU";
            else if (cnt % 7 == 5)
                rslt = "FRI";
            else if (cnt % 7 == 6)
                rslt = "SAT";
            else
                rslt = "SUN";
            
            System.out.println(rslt);
        }
}
