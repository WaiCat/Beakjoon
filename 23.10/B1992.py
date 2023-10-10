n = int(input())

arr = []
answer = []


def check(a, b, c, d):

    tem = []
    row = b - a

    for i in range(c, d):
        tem.append(arr[i][a:b])

    array_sum = sum(sum(row) for row in tem)

    if array_sum == 0:
        answer.append(0)
    elif array_sum == row*row:
        answer.append(1)
    else:
        m = int(row/2)
        answer.append("(")
        check(a, b-m, c, d-m)
        check(a+m, b, c, d-m)
        check(a, b-m, c+m, d)
        check(a+m, b, c+m, d)
        answer.append(")")


for i in range(n):
    arr.append(list(map(int, input())))

check(0, n, 0, n)

answer = ''.join(map(str, answer))

print(answer)
