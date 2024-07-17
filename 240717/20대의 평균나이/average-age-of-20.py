plus = 0
cnt = 0
while True:
    a = int(input())
    if a>29 or a<20:
        print(f"{plus/cnt:.2f}")
        break
    plus += a
    cnt +=1