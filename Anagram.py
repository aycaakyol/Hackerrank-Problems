class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1 = {}
        d2 = {}

        if len(s) == len(t):
            for i in range(len(s)):
                if s[i] in t:
                    t = t.replace(s[i], "", 1)
                else:
                    return False

            if len(t) == 0:
                return True
        else:
            return False