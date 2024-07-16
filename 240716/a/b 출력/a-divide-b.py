from decimal import Decimal, getcontext

a, b = map(int, input().split())
c = Decimal(a)/Decimal(b)
print(f"{c:.20f}")