a = int(input())
arr = map(int,input().split())
new_arr = [i**2 for i in arr]
for i in range (0,a):
    print(new_arr[i],end=" ")