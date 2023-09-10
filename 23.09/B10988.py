str = input()

bool = True

for i in range(int(len(str)/2)):
    if (str[i] != str[-i-1]):
        bool = False
        break

if (bool):
    print(1)
else:
    print(0)
