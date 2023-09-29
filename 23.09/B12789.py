from collections import deque

n = int(input())


arr = list(map(int, input().split()))

d = deque()

num = 1
i=0

while(i != n):
    a = arr[i]
    i+=1
    if(a == num):
        num+=1
    else:
        if(len(d) > 0):
            b = d.pop()
            if(b == num):
                num+=1
                i-=1
            else:
                d.append(b)
                d.append(a)
        else:
            d.append(a)
            
l = len(d)

for _ in range(l):
    if(d.pop() == num):
        num+=1
    else:
        break
            
if(num == (n+1)):
    print("Nice")
else:
    print("Sad")