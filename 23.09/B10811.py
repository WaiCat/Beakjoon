n, m = map(int, input().split())

arr=[]

for i in range(n):
    arr.append(i+1)

for i in range(m):
    a, b = map(int, input().split())
    a=a-1
    brr = arr[a:b]
    brr.reverse()
    for j in brr:
        arr[a]=j
        a=a+1

for i in range(n):
    print(int(arr[i]), end=" ")