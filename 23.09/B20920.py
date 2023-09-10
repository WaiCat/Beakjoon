import sys


class words:
    def __init__(self, word):
        self.word = word
        self.num = 0

    def up(self):
        self.num += 1

    def __eq__(self, other):
        return self.word == other.word

    def __lt__(self, other):
        if self.num != other.num:
            return self.num > other.num
        elif len(self.word) != len(other.word):
            return len(self.word) > len(other.word)
        else:
            return self.word < other.word


n, m = map(int, sys.stdin.readline().split())

word_count = {}

for _ in range(n):
    word = sys.stdin.readline().rstrip()
    if len(word) >= m:
        if word in word_count:
            word_count[word].up()
        else:
            word_count[word] = words(word)

sorted_words = sorted(word_count.values())

for word_obj in sorted_words:
    print(word_obj.word)
