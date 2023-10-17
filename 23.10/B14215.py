a, b, c = map(int, input().split())

m = max(a, b, c) * 2
sum = a+b+c
if(sum > m):
    print(sum)
else:
    sum = sum-int(m/2)
    print(sum*2-1)