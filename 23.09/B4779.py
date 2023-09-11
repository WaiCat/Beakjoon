lists = []
lists.append("-")


def kan(n):
    if (len(lists) > n):
        return lists[n]
    else:
        li = kan(n-1)
        lis = li
        l = len(li)
        for i in range(l):
            lis += " "
        lis += li
        lists.append(lis)
        return lis


while True:
    try:
        num = int(input())
        print(kan(num))
    except EOFError:
        break
