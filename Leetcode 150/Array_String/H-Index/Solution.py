class Solution:
    def hIndex(self, citations: List[int]) -> int:
        h = len(citations)
        citations.sort()

        for i, n in enumerate(citations):
            if n >= h - i:
                return h - i

        return 0 