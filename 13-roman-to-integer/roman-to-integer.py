class Solution:
    def romanToInt(self, s: str) -> int:
        number = 0
        roman = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        for i in range(0,len(s)-1,+1):
            if roman[s[i]]<roman[s[i+1]]:
                number -= roman[s[i]]
            else:
                number += roman[s[i]]
        return number + roman[s[len(s)-1]]
        