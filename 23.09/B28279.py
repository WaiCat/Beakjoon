from sys import stdin
from collections import deque

n = int(stdin.readline())
d = deque()

answers = []

for i in range(n):
    k = list(stdin.readline().split())
    if k[0] == "1":
        d.appendleft(k[1])
    elif k[0] == "2":
        d.append(k[1])
    elif k[0] == "3":
        if d:
            answers.append(d.popleft())
        else:
            answers.append(str(-1))
    elif k[0] == "4":
        if d:
            answers.append(d.pop())
        else:
            answers.append(str(-1))
    elif k[0] == "5":
        answers.append(str(len(d)))
    elif k[0] == "6":
        answers.append(str(int(not d)))
    elif k[0] == "7":
        if d:
            answers.append(d[0])
        else:
            answers.append(str(-1))
    elif k[0] == "8":
        if d:
            answers.append(d[-1])
        else:
            answers.append(str(-1))

print("\n".join(answers))
