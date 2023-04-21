class Solution:
    # def isAnagram(self, s: str, t: str) -> bool:
    #     d1 = {}
    #     d2 = {}

    #     if len(s) == len(t):
    #         for i in range(len(s)):
    #             if s[i] in t:
    #                 t = t.replace(s[i], "", 1)
    #             else:
    #                 return False

    #         if len(t) == 0:
    #             return True
    #     else:
    #         return False
    def isAnagram(self, s: str, t: str) -> bool:
        d = [0] * 26

        if len(s) == len(t):
            for i in range(len(s)):
                    d[ord(s[i]) - ord('a')] += 1
                    d[ord(t[i]) - ord('a')] -= 1
        else:
            return False

        for i in d:
            if i != 0:
                return False

        return True 