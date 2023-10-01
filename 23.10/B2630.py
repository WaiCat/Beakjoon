n = int(input())

arr = []

white = 0
blue = 0


def check(a, b, c, d):
    global white, blue

    tem = []
    row = b - a

    for i in range(c, d):
        tem.append(arr[i][a:b])

    array_sum = sum(sum(row) for row in tem)

    if array_sum == 0:
        white += 1
    elif array_sum == row*row:
        blue += 1
    else:
        m = int(row/2)
        check(a, b-m, c, d-m)
        check(a, b-m, c+m, d)
        check(a+m, b, c, d-m)
        check(a+m, b, c+m, d)


for i in range(n):
    arr.append(list(map(int, input().split())))

check(0, n, 0, n)

print(white)
print(blue)
