class Solution {
    public String solution(int a, int b) {
        // 각 월별 일수 (윤년: 2월 = 29일)
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 요일 배열: SUN=0, ..., SAT=6
        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        // 1월 1일부터 해당 날짜까지 총 며칠이 지났는지 계산
        int totalDays = 0;
        for (int i = 1; i < a; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += b - 1;

        // 요일 계산
        return dayOfWeek[totalDays % 7];
    }
}