from decimal import Decimal, getcontext, ROUND_FLOOR

a, b = map(int, input().split())
c = Decimal(a)/Decimal(b)
print(f"{c:.20f}")