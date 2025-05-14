import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIndex.put(friends[i], i);
        }

        int[][] giftHistory = new int[n][n]; // giftHistory[i][j] : i가 j에게 준 선물 수
        int[] given = new int[n];  // i가 이번 달까지 준 선물 수
        int[] received = new int[n]; // i가 이번 달까지 받은 선물 수

        // 1. 선물 기록 파싱
        for (String gift : gifts) {
            String[] split = gift.split(" ");
            int giver = nameToIndex.get(split[0]);
            int receiver = nameToIndex.get(split[1]);

            giftHistory[giver][receiver]++;
            given[giver]++;
            received[receiver]++;
        }

        // 2. 선물 지수 계산
        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            giftIndex[i] = given[i] - received[i];
        }

        // 3. 다음 달 받을 선물 수 계산
        int[] nextMonthGifts = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int gi = giftHistory[i][j];
                int gj = giftHistory[j][i];

                if (gi > gj) {
                    nextMonthGifts[i]++;
                } else if (gi == gj) {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++;
                    }
                }
            }
        }

        // 4. 최대값 반환
        int maxGifts = 0;
        for (int giftsCount : nextMonthGifts) {
            maxGifts = Math.max(maxGifts, giftsCount);
        }

        return maxGifts;
    }
}