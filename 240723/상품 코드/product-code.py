class Product:
    def __init__ (a,name,code):
        a.name = name
        a.code = int(code)
a = input().split()
product = Product(a[0],a[1])
product2 = Product("codetree",50)
print(f"product {product2.code} is {product2.name}")
print(f"product {product.code} is {product.name}")