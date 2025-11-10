class Solution:
    def intToRoman(self, num: int) -> str:
        hash=[(1000, 'M'), (900, 'CM'), (500, 'D'), (400, 'CD'), (100, 'C'), (90, 'XC'), (50, 'L'), (40, 'XL'), (10, 'X'), (9, 'IX'), (5, 'V'), (4, 'IV'), (1, 'I')]
        string = []
        for a,b in hash:
            if num==0:
                break
            else:
                count = math.floor(num/a)
                string.append(b*count)
                num -= count*a
        return ''.join(string)