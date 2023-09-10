from sys import stdin
from collections import deque

n = int(stdin.readline())
d = deque()

answers = []

for i in range(n):
    k = list(stdin.readline().split())
    if k[0] == "2":
        if d:
            answers.append(d.pop())
        else:
            answers.append(str(-1))
    elif k[0] == "3":
        answers.append(str(len(d)))
    elif k[0] == "4":
        answers.append(str(int(not d)))
    elif k[0] == "5":
        if d:
            answers.append(d[-1])
        else:
            answers.append(str(-1))
    else:
        d.append(k[1])

print("\n".join(answers))
