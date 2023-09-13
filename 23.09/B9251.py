word1 = list(input())
word2 = list(input())

m = min(len(word1), len(word2))

dp = [0]*len(word2)

for i in range(len(word1)):
    for j in range(len(word2)):
        if (word1[i] == word2[j]):
            dp[j] += 1
        elif (j != 0 and dp[j-1] > dp[j]):
            dp[j] = dp[j-1]

print(max(dp))
