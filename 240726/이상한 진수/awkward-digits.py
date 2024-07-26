a = list(map(int,input()))
b = list(map(int,input()))
for i in range(len(a)):
    arr= a[:]
    if arr[i] == 0:
        arr[i] = 1
        arr.reverse()
        cnta = 0
        cnt = 0
        ar = 1
        brr = []
        for j in range(len(arr)):
            cnta +=ar*arr[j]
            ar*=2
        k = cnta
        for j in range(len(b)):
            brr.append(cnta%3)
            cnta = cnta//3
        brr.reverse()
        for j in range(len(b)):
            if b[j] != brr[j]:
                cnt+=1
        if cnt ==1:
            print(k)
            break
    else:
        arr[i] = 0
        arr.reverse()
        cnta = 0
        cnt = 0
        ar = 1
        brr = []
        for j in range(len(arr)):
            cnta +=ar*arr[j]
            ar*=2
        k = cnta
        for j in range(len(b)):
            brr.append(cnta%3)
            cnta = cnta//3
        brr.reverse()
        for j in range(len(b)):
            if b[j] != brr[j]:
                cnt+=1
        if cnt ==1:
            print(k)
            break