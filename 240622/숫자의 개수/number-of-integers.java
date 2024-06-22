import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 배열의 크기 a와 검색할 값의 개수 b를 읽음
        String[] firstLine = br.readLine().split(" ");
        int a = Integer.parseInt(firstLine[0]);
        int b = Integer.parseInt(firstLine[1]);

        // 두 번째 줄에서 배열의 요소를 읽음
        int[] arr = new int[a];
        String[] secondLine = br.readLine().split(" ");
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(secondLine[i]);
        }

        // 쿼리 처리
        for (int i = 0; i < b; i++) {
            int n = Integer.parseInt(br.readLine()); // 검색할 값

            // 이진 탐색을 통한 값 찾기
            int left = 0;
            int right = a - 1;
            int count = 0;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] < n) {
                    left = mid + 1;
                } else if (arr[mid] > n) {
                    right = mid - 1;
                } else {
                    // arr[mid] == n 인 경우, 연속된 같은 값 찾기
                    count++;
                    int temp = mid - 1;
                    while (temp >= 0 && arr[temp] == n) {
                        count++;
                        temp--;
                    }
                    temp = mid + 1;
                    while (temp < a && arr[temp] == n) {
                        count++;
                        temp++;
                    }
                    break;
                }
            }
            System.out.println(count);
        }

        // 버퍼리더 닫기
        br.close();
    }
}