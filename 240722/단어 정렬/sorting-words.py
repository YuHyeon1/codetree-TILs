a = int(input())
arr = ["n"]*a
for i in range(a):
    arr[i] = input()
arr.sort()
for i in range(a):
    print(arr[i])