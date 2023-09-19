import sys
input = sys.stdin.readline

n = int(input())

arr = [[0 for i in range(3)]for i in range(n)]

for i in range(n):
    r, g, b = map(int, input().split())
    arr[i][0] = r
    arr[i][1] = g
    arr[i][2] = b

dp = [[0 for i in range(3)]for i in range(n)]
dp[0] = arr[0]

for i in range(1, n):
    for j in range(n):
        if (j == 0):
            dp[i][0] = arr[i][0] + min(dp[i-1][1], dp[i-1][2])
        elif (j == 1):
            dp[i][1] = arr[i][1] + min(dp[i-1][0], dp[i-1][2])
        else:
            dp[i][2] = arr[i][2] + min(dp[i-1][0], dp[i-1][1])

print(min(dp[n-1]))
