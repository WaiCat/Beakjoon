n = int(input())

for _ in range(n):
    arr = []
    money = int(input())
    arr.append(money // 25)
    money = money % 25
    arr.append(money // 10)
    money = money % 10
    arr.append(money // 5)
    money = money % 5
    arr.append(money)
    print(*arr)
