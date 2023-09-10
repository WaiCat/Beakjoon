num, r = map(int, input().split())

arr = []

for i in range(num):
    arr.append(0)

for i in range(r):
    n1, n2, n3 = map(int, input().split())
    for j in range(n1-1, n2):
        arr[j] = n3

for i in range(num):
    print(int(arr[i]), end=" ")
