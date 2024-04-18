import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 2751 오름차순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        // 수의 개수 입력 및 배열 생성
        int[] arr = new int[Integer.parseInt(br.readLine())];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);


        for (int a : arr) {
            sb.append(a + "\n");
        }
        System.out.println(sb);
    }
}