n = int(input())
arr = {}

for _ in range(n):
    a, b = input().split()
    if b == 'leave':
        if a in arr:
            del arr[a]
    else:
        arr[a] = 1

sorted_arr = sorted(arr.keys(), reverse=True)

for i in sorted_arr:
    print(i)
