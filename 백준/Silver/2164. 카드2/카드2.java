import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<> ();
        int n = Integer.parseInt(br.readLine());

        // 카드 set
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }

        // 카드가 하나 남을 때까지
        while (queue.size() > 1) {
            queue.poll(); // 맨 위 카드 버리기
            queue.offer(queue.poll()); // 남은 카드 중 맨 위 카드 젤 아래로 이동
        }

        System.out.println(queue.poll());
    }
}