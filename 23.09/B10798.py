list1 = input()
list2 = input()
list3 = input()
list4 = input()
list5 = input()

max = max(len(list1), len(list2), len(list3), len(list4), len(list5))

list = []

for i in range(max):
    if (i < len(list1)):
        list.append(list1[i])
    if (i < len(list2)):
        list.append(list2[i])
    if (i < len(list3)):
        list.append(list3[i])
    if (i < len(list4)):
        list.append(list4[i])
    if (i < len(list5)):
        list.append(list5[i])

for i in range(len(list)):
    print(list[i], end="")
