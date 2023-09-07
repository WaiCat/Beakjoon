sum = 0
sum2= 0

for i in range(20):
    a, num, c = input().split()
    num = int(num[0])
    if(c[0]!="P"):
        sum = sum + num
    if(c=="A+"):
        sum2+=4.5*num
    elif(c=="A0"):
        sum2+=4*num
    elif(c=="B+"):
        sum2+=3.5*num
    elif(c=="B0"):
        sum2+=3*num
    elif(c=="C+"):
        sum2+=2.5*num
    elif(c=="C0"):
        sum2+=2*num
    elif(c=="D+"):
        sum2+=1.5*num
    elif(c=="D0"):
        sum2+=1*num
    elif(c=="F"):
        sum2+=0
        
if(sum == 0 and sum2 ==0):
    print(0)
else:
    print(sum2/sum)