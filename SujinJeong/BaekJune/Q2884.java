	import java.util.Scanner;

	public class Q2884 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int h, m; int printh = 0, printm = 0;
			h = sc.nextInt();
			m = sc.nextInt();
			
			
			if (m < 45) {
				if (h > 0) //1시 이후이고 분이 45분보다 작은 경우
					printh = h-1;
				else  //0시이고 45분보다 작은 경우
					printh = 23;
				printm = 60-(45-m);
			}
			else { //분이 45분 이후
				printm = m-45;
				printh = h;
			}
			System.out.print(printh + " " + printm);
		}


}