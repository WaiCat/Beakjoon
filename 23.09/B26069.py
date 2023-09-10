from sys import stdin

n = int(stdin.readline())

Chong = set()
Chong.add("ChongChong")

for _ in range(n):
    c1, c2 = stdin.readline().rstrip().split()
    if(c1 in Chong):
        Chong.add(c2)    
    elif(c2 in Chong):
        Chong.add(c1) 
        
print(len(Chong)) 