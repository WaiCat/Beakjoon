n = int(input())

arr = list(map(int, input().split()))
dp = [arr[0]]


def Binary_search(target, start, end):
    while start < end:
        mid = (start + end) // 2
        if (dp[mid] < target):
            start = mid + 1
        else:
            end = mid

    return start


for i in arr:
    if (i > dp[-1]):
        dp.append(i)
    else:
        dp[Binary_search(i, 0, len(dp)-1)] = i


print(len(dp))
