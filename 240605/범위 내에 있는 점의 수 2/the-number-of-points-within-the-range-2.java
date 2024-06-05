import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 배열에서 최대값 찾기
        int maxVal = Arrays.stream(arr).max().orElse(0);
        
        // 값의 빈도수를 저장하는 배열
        int[] count = new int[maxVal + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        // 빈도수의 누적합 배열 계산
        int[] prefixCount = new int[maxVal + 1];
        prefixCount[0] = count[0];
        for (int i = 1; i <= maxVal; i++) {
            prefixCount[i] = prefixCount[i - 1] + count[i];
        }
        
        // 쿼리 처리
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            // 구간 내 요소 개수 계산
            int countInRange;
            if (l > 0) {
                countInRange = prefixCount[r] - prefixCount[l - 1];
            } else {
                countInRange = prefixCount[r];
            }
            System.out.println(countInRange);
        }
        
        sc.close();
    }
}