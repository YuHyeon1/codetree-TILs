r, c = map(int,input().split())
arr = [input().split() for _ in range(r)]
cnt = 0
if arr[0][0] == 'W':
    for i in range(1,r-2):
        for j in range(1,c-2):
            if arr[i][j] == 'B' and arr[r-1][c-1] == 'B':
                for k in range(i+1,r-1):
                    for l in range(j+1,c-1):
                        if arr[k][l] == 'W':
                            cnt+=1
else:
    for i in range(1,r-2):
        for j in range(1,c-2):
            if arr[i][j] == 'W' and arr[r-1][c-1] == 'W':
                for k in range(i+1,r-1):
                    for l in range(j+1,c-1):
                        if arr[k][l] == 'B':
                            cnt+=1
print(cnt)