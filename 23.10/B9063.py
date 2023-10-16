n = int(input())

xmin = 10001
xmax = -10001

ymin = 10001
ymax = -10001

for _ in range(n):
    x, y = map(int, input().split())
    xmax = max(xmax, x)
    xmin = min(xmin, x)
    ymax = max(ymax, y)
    ymin = min(ymin, y)
    
print((xmax - xmin) * (ymax - ymin))