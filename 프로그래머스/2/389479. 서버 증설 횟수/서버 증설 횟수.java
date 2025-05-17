class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] serverEndTimes = new int[24 + k]; // 각 시간에 몇 대의 서버가 시작되었는지 저장

        for (int t = 0; t < players.length; t++) {
            int neededServers = players[t] / m; // m명당 서버 1대 (m명 미만이면 0)
            
            // 현재 시각 기준 k시간 동안 운영 중인 서버 수 계산
            int activeServers = 0;
            for (int i = Math.max(0, t - k + 1); i <= t; i++) {
                activeServers += serverEndTimes[i];
            }

            // 부족한 서버가 있으면 증설
            if (activeServers < neededServers) {
                int toExpand = neededServers - activeServers;
                serverEndTimes[t] += toExpand; // 현재 시각에 toExpand대 증설
                answer += toExpand;
            }
        }

        return answer;
    }
}
