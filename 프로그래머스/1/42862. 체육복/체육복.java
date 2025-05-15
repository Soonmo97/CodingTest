import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 배열을 리스트로 변환해서 중복 제거에 유리하게 처리
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난당했지만 여벌도 있는 학생 제거
        for (int l : lost) {
            boolean isOverlap = false;
            for (int i = 0; i < reserve.length; i++) {
                if (l == reserve[i]) {
                    reserve[i] = -1; // 사용 처리
                    isOverlap = true;
                    break;
                }
            }
            if (!isOverlap) lostList.add(l);
        }

        for (int r : reserve) {
            if (r != -1) reserveList.add(r);
        }

        for (int r : reserveList) {
            if (lostList.contains(r - 1)) {
                lostList.remove(Integer.valueOf(r - 1));
            } else if (lostList.contains(r + 1)) {
                lostList.remove(Integer.valueOf(r + 1));
            }
        }

        return n - lostList.size();
    }
}
