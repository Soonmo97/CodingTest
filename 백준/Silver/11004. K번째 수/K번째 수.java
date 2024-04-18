import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 2751 오름차순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수 개수
        int n = Integer.parseInt(st.nextToken());

        // 몇 번째
        int k = Integer.parseInt(st.nextToken());

        // 배열 생성
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // k번쨰 수의 index
        sb.append(arr[k-1]);

        System.out.println(sb);
    }
}