n, k = map(int, input().split())

zero = 0
l = []
dp = [[0 for _ in range (n)] for _ in range(k)]

print(dp)
for i in range(n):
    m, v = map(int, input().split())
    l.append([m, v])


for i, m, v in enumerate(l):
    for j in range(k):
        if(v > k):
            dp[i+1, j] = dp[i, j]
        else:
            if(j<m):
                dp[i+1, j] = dp[i, j]
            else:
                dp[i+1, j] = max(dp[i, j], dp[i, j-m] + v)

print(dp)
