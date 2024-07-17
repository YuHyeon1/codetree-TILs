cnt =0
arr = ["L","E","B","R","O","S"]
a = input()
for i in range (len(arr)):
    if arr[i]==a:
        print(i)
        cnt+=1
        break
if cnt==0:
    print("None")