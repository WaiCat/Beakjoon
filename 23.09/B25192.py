from sys import stdin

n = int(stdin.readline())

lists = set()
total = 0

for _ in range(n):
    str = stdin.readline().rstrip()
    if (str == "ENTER"):
        lists.clear()
    elif (str not in lists):
        total += 1
        lists.add(str)

print(total)
