import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        int minDifference = Integer.MAX_VALUE; // 최소 차이를 최대로 설정하여 비교 시작
        
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    // i, j, k는 서로 다른 인덱스를 나타냅니다.
                    int group1 = arr[i] + arr[j];
                    int group2 = arr[k];
                    int group3 = sum - (group1 + group2);

                    // 각각의 그룹에서 최소와 최대를 구합니다.
                    int minGroup = Math.min(group1, Math.min(group2, group3));
                    int maxGroup = Math.max(group1, Math.max(group2, group3));
                    
                    // 현재 그룹 조합에서의 최대 차이를 계산하고, 최소화합니다.
                    int currentDifference = maxGroup - minGroup;
                    minDifference = Math.min(minDifference, currentDifference);
                }
            }
        }
        
        // 최소 차이가 변경되지 않았을 경우, -1을 출력합니다.
        if (minDifference == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minDifference);
        }
    }
}