class Solution {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] romans = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i=0;i<numbers.length;i++)
        {
            if(num==0){
                break;
            }
            while(num>=numbers[i])
            {
                s.append(romans[i]);
                num -= numbers[i];
            }
        }
        return s.toString();
    }
}