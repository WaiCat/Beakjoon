n = int(input())

arr = []

for _ in range(n):
    arr.append(int(input()))
dp = []

dp.append(arr[0])
if (n > 0):
    dp.append(arr[0] + arr[1])
if (n > 1):
    dp.append(max(arr[0], arr[1])+arr[2])

for i in range(3, n):
    dp.append(max(dp[i-2], dp[i-3]+arr[i-1])+arr[i])

print(max(dp))
