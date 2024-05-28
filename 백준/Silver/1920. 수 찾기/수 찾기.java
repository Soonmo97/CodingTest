import java.util.*;
import java.io.*;
public class Main {
    static long[] arr;

    public static void main(String[] args) throws IOException {
        // 1920 수 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            sb.append(binarySearch(Long.parseLong(st.nextToken())) + "\n");
        }
        System.out.print(sb);
    }

    // 이분(진) 탐색 O(log n)
    // 조건: 정렬된 배열
    // 찾으려는 값을 최소값과 최대값의 중간값에 비교 후 작거나 크면 최소값 및 최대값을 수정 후 다시 비교
    public static int binarySearch(long goal) {
        int low = 0;
        int high = arr.length - 1;
        int result = 0;
        while (high >= low) {
            int mid = (low + high) / 2;

            if (goal == arr[mid]) {
                result = 1;
                break;
            } else if (goal < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

}