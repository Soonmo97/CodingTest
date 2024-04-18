import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 적게 걸리는 순으로 사람 순서를 배치한 것이 결국 각 사람이 인출하는데 필요한 시간의 합의 최솟값
        // 즉, 모든 경우의 수를 비교할 필요없이 적게 걸리는 순(오름차순)으로 배치했을 때 걸리는 시간(인출)의 합만 구하면 최적의 해가 보장된다.
        // 그리디(Greedy) 알고리즘은 두 가지 전제 조건이 되었을 때 사용
        // 1. 현재 선택이 미래 선택에 영향을 끼치지 않는다.
        // 2. 현재 선택으로 구한 부문 문제의 최적의 해와 나머지 부분 문제의 최적의 해가 더해진 것이 곧 전체 문제의 최적의 해가 되는 경우(최적 부분 구조 조건)


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // 최종 최솟값 합
        int sum=arr[0];

        // 이전에 사람이 걸린 시간
        int past=arr[0];

        for (int i=1; i<arr.length; i++) {
            past += arr[i]; // 이전에 사람이 걸린 시간 + 이번 차례 사람이 걸린 시간
            sum += past; // 합에 더해주기
        }

        sb.append(sum);

        System.out.println(sb);

    }
}