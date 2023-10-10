a, b, c = map(int, input().split())

sum = 1
arr = []

while b > 1:
    arr.append(b % 2)
    b = b // 2

if (b > 0):
    arr.append(b)

for value in arr:
    if (value == 1):
        sum = (sum * a) % c

    a = (a % c * a % c) % c

print(sum)
