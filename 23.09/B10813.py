num, r = map(int, input().split())

arr = []

for i in range(num):
    arr.append(i+1)

for i in range(r):
    n1, n2 = map(int, input().split())
    tem = arr[n1-1]
    arr[n1-1] = arr[n2-1]
    arr[n2-1] = tem

for i in range(num):
    print(int(arr[i]), end=" ")
