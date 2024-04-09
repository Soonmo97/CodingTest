import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 재료 개수 n
        int m = Integer.parseInt(br.readLine()); // 갑옷을 만드는데 필요한 수(두 재료의 고유번호 합) m
        int arr[] = new int[n]; // 재료 고유 번호들
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 재료 교유 번호 채워주기
        }

        int cnt = 0; // 만들 수 있는 갑옷 개수
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] + arr[j] == m) {
                    cnt++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb.toString());
    }
}