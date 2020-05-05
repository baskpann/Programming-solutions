class Solution:
    def firstUniqChar(self, s: str) -> int:
        ind = -1
        for i in range(len(s)):
            cnt = s.count(s[i])
            if cnt == 1:
                ind = i
                break
        return ind 
