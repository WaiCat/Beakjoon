word1 = list(input())
word2 = list(input())

dp = [0]*len(word2)

arr = []

for i in range(len(word1)):
    arr.append([])
    for j in range(len(word2)):
        if (word1[i] == word2[j]):
            arr[i].append(j)

print(max(dp))
