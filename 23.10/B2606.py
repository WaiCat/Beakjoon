dot = int(input())
n = int(input())

arr = [[] for _ in range(dot+1)]
answer = []

for _ in range(n):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)


def child(s):
    global arr

    for i in arr[s]:
        if (i not in answer and i != 1):
            answer.append(i)
            child(i)


child(1)

print(len(answer))
