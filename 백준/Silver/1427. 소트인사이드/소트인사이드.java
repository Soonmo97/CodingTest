import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 1427 (소트인사이드) 내림차순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] arr = br.readLine().split(""); // 숫자 받기
        long[] n = new long[arr.length]; // 받은 숫자 long타입으로 변환해서 담을 배열

        for (int i=0; i<arr.length; i++) {
            n[i] = Long.parseLong(arr[i]);
        }
        for (int i=0; i<arr.length; i++) { // 회전 수
            for (int j=1; j<arr.length-i; j++) { // 비교 및 교환
                if(n[j-1] < n[j]) {
                    long temp = n[j-1];
                    n[j-1] = n[j];
                    n[j] = temp;
                }
            }
        }
        for (long number : n) {
            System.out.print(number);
        }

    }
}