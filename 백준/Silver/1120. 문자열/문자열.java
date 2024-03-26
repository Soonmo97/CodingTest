import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int ans = a.length();//최대값
        int cnt;
        for(int i=0;i<b.length()-a.length()+1;i++){
            cnt = 0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j) != b.charAt(i+j)) cnt++;
            }
            if(cnt<ans) ans = cnt;
        }

        System.out.println(ans);

    }
}