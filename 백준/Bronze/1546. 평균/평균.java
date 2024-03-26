import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];
        for (int i=0; i<n; i++) {
            score[i] = sc.nextInt();
        }
        int m = score[0];
        for (int i=1; i<n; i++) {
            if(m < score[i]) {
                m = score[i];
            }
        }
        double sum =0;
        for (int s : score) {
            sum += (double)s/m*100;
        }
        System.out.println(sum/n);
    }
}