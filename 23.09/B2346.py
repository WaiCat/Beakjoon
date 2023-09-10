from sys import stdin
from collections import deque

n = int(stdin.readline())
m = list(map(int, stdin.readline().split()))
d = deque()
q = deque()

answer = []

for i in range(n):
    d.append(i+1)
    q.append(m[i])

for i in range(n):
    answer.append(str(d.popleft()))
    num = q.popleft()
    if (num > 0):
        num = -(num-1)
    else:
        num = -num

    d.rotate(num)
    q.rotate(num)


print(" ".join(answer))
