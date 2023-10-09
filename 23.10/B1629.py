a, b, c = map(int, input().split())

sum = 1

arr = []

mod = 2

tmp = b

k = 0

while tmp > 1:
    if (tmp % mod < 2):
        arr.append(k)
        k = 0
        mod = 2
    else:
        k += 1
        mod = mod * mod
if (tmp > 0):
    arr.append(tmp)

print(arr)
