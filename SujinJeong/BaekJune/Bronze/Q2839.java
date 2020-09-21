package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        if (total % 5 == 0) {// 5kg로 모두 표현할 수 있는 경우
            System.out.println(total/5);
            return;
        }
        else {
            //둘의 합산으로 구하는 경우
            for (int i = (total / 5); i > 0; i--) { // 5kg를 1 ~ total/5개까지 이용
                int num = total - 5*i; // 3kg짜리 봉지 계산 위해 남은 kg 수 num으로 받기
                if (num % 3 == 0) {
                    System.out.println((num / 3) + i);
                    return;
                }
            }
        }

        if (total % 3 == 0) // 5kg로 나타낼 수 없지만 3kg로 모두 표현할 수 있는 경우
            System.out.println(total/3);
        else
            System.out.println("-1");

        return;
    }
}
