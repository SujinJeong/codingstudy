import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int sum = 0; //각 자리 숫자의 합 저장
        int cnt = 0; //싸이클 횟수 저장
        String num2 = ""; //새로운 숫자 저장

        //10보다 작다면 0을 붙여 두자리 수로
        if (Integer.parseInt(num) < 10)
            num = "0" + num;
        while (!num.equals(num2)) {
            //첫번째 루프인 경우 num2는 num
            if (cnt == 0)
                num2 = num;
            cnt++; // 싸이클 +1
            // 각 자리 숫자의 합 구하기
            sum = Character.getNumericValue(num2.charAt(0)) + Character.getNumericValue(num2.charAt(1));
            // 새로운 숫자 일의 자리 수 조합
            num2 = Character.toString(num2.charAt(1)) + Integer.toString(sum % 10);
        }
        System.out.println(cnt);
   }
}
