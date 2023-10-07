a, b, c = map(int, input().split())

sum = 1

arr = []

mod = 2
d = b
while d != 0:
    e = d % mod
    if(e < 2):    
        arr.append(e % mod)
        d -= e
    else:
        arr.append(0)
    mod *=2
    
mod = a % c

for i in range(len(arr)):
    sum = ((sum % c ) * mod * arr[i]) % c
    mod = (mod * mod) % c


print(sum)