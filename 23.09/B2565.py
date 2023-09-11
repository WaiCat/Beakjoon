from sys import stdin

n = int(stdin.readline())

line = []
dp = [0]*n

for i in range(n):
    a, b = map(int, stdin.readline().split())
    line.append((a, b))

line.sort()

for i in range(n):
    for j in range(i):
        if (line[i][1] > line[j][1] and dp[i] < dp[j]):
            dp[i] = dp[j]
    dp[i] += 1

print(n-max(dp))
