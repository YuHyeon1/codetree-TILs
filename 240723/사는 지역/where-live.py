class Address:
    def __init__ (a,name,post,region):
        a.name = name
        a.post = post
        a.region = region
a = int(input())
list1 = []
for i in range(a):
    arr = input().split()
    address = Address(arr[0],arr[1],arr[2])
    list1.append(address)
list1.sort(key = lambda address:address.name)
print(f"name {list1[a-1].name}")
print(f"addr {list1[a-1].post}")
print(f"city {list1[a-1].region}")