from decimal import Decimal, getcontext, ROUND_FLOOR

a, b = map(int, input().split())
c = Decimal(a)/Decimal(b)
c = c.quantize(Decimal('1.000000000000000000000'), rounding=ROUND_FLOOR)
print(f"{c:.20f}")