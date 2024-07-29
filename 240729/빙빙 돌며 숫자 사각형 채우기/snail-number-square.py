n, m = map(int, input().split())
arr = [[0]*m for _ in range(n)]  # n x m 배열 생성
cnt = 1
dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]  # 방향 벡터
x, y = 0, 0  # 시작 위치
drct = 0  # 초기 방향 (우측)

while cnt <= n * m:
    arr[x][y] = cnt
    cnt += 1
    
    # 다음 위치 계산
    a = x + dx[drct]
    b = y + dy[drct]
    
    # 경계 체크 및 방향 전환
    if 0 <= a < n and 0 <= b < m and arr[a][b] == 0:
        x, y = a, b
    else:
        drct = (drct + 1) % 4
        x += dx[drct]
        y += dy[drct]

# 배열 출력
for i in range(n):
    for j in range(m):
        print(arr[j][i], end=" ")
    print()