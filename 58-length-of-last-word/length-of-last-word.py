class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        count=0
        n = len(s)
        j= len(s) - 1
        while s[j] == ' ':
            n = n - 1
            j = j - 1

        for i in range(0, n, +1):
            if s[i]!=' ' :
                count= count+1
            else:
                count=0
        return count