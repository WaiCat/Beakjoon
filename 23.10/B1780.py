n = int(input())

arr = []

mone = 0
zero = 0
one = 0


def is_all_zeros(arr):
    for row in arr:
        for element in row:
            if element != 0:
                return False
    return True


def check(a, b, c, d):
    global mone, zero, one

    tem = []
    row = b - a

    for i in range(c, d):
        tem.append(arr[i][a:b])

    array_sum = sum(sum(row) for row in tem)

    if array_sum == row*row:
        one += 1
    elif array_sum == -row*row:
        mone += 1
    elif array_sum == 0:
        if is_all_zeros(tem):
            zero += 1
        else:
            m = int(row/3)
            check(a, a+m, c, c+m)
            check(a, a+m, c+m, d-m)
            check(a, a+m, d-m, d)
            check(a+m, b-m, c, c+m)
            check(a+m, b-m, c+m, d-m)
            check(a+m, b-m, d-m, d)
            check(b-m, b, c, c+m)
            check(b-m, b, c+m, d-m)
            check(b-m, b, d-m, d)
    else:
        m = int(row/3)
        check(a, a+m, c, c+m)
        check(a, a+m, c+m, d-m)
        check(a, a+m, d-m, d)
        check(a+m, b-m, c, c+m)
        check(a+m, b-m, c+m, d-m)
        check(a+m, b-m, d-m, d)
        check(b-m, b, c, c+m)
        check(b-m, b, c+m, d-m)
        check(b-m, b, d-m, d)


for i in range(n):
    arr.append(list(map(int, input().split())))

check(0, n, 0, n)

print(mone)
print(zero)
print(one)
