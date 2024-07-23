class Bomb:
    def __init__(a,code,color,second):
        a.code = code
        a.color = color
        a.second = second
a = list(input().split())
bomb = Bomb(a[0],a[1],a[2])
print(f"code : {a[0]}")
print(f"color : {a[1]}")
print(f"second : {a[2]}")