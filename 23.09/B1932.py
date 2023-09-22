n = int(input())

arr = [[0 for i in range(n)]for j in range(n)]

for i in range(n):
    tmp = list(map(int, (input().split())))
    for j in range(i+1):
        arr[i][j] = tmp[j]

for i in range(n-2, -1, -1):
    for j in range(i, -1, -1):
        arr[i][j] += max(arr[i+1][j], arr[i+1][j+1])

print(arr[0][0])
