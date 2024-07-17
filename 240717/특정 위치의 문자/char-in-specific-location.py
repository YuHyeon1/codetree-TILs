cnt =0
arr = ["L","E","B","R","O","S"]
a = input()
for i in range (0,6):
    if arr[i]==a:
        print(i)
        cnt+=1
        break
if cnt==0:
    print("None")